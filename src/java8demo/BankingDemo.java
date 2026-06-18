package java8demo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BankingDemo {

    private BankingDemo() {
    }

    public static final class Account {
        private final String id;
        private final String owner;
        private final BigDecimal balance;

        public Account(String id, String owner, BigDecimal balance) {
            this.id = id;
            this.owner = owner;
            this.balance = balance;
        }

        public String getId() {
            return id;
        }

        public String getOwner() {
            return owner;
        }

        public BigDecimal getBalance() {
            return balance;
        }
    }

    //Total balance across all accounts
    public static  BigDecimal totalBalance(List<Account> accounts) {
        return accounts.stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    //Accounts whose balance is above the threshold, richest first
    public static  List<Account> richAccounts(List<Account> accounts, BigDecimal threshold) {
        return accounts.stream()
                .filter(a -> a.getBalance().compareTo(threshold) > 0)
                .sorted((x, y) -> y.getBalance().compareTo(x.getBalance()))
                .collect(Collectors.toList());
    }

    //safely find an account by id(no nulls leaking out)
    public static Optional<Account> findById(List<Account> accounts, String id) {
        return accounts.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
    }

    //Owner name or a fallback
    public static String ownerOf(List<Account> accounts, String id) {
        return findById(accounts, id)
                .map(Account::getOwner)
                .orElse("UNKNOWN");
    }

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
                new Account("A1","Alice", new BigDecimal("1500.00")),
                new Account("A2","Bob", new BigDecimal("250.00")),
                new Account("A3","Carol", new BigDecimal("9800.50"))
        );

        System.out.println("total balance: " + totalBalance(accounts));
        System.out.println("richAccounts: " + richAccounts(accounts,new BigDecimal("1000.00"))
                .stream().map(Account::getOwner).toList());
        System.out.println("ownerOf(A2): " + ownerOf(accounts,"A2"));
        System.out.println("ownerOf(X9): " + ownerOf(accounts,"X9"));
    }
}
