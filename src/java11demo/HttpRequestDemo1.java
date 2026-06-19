package java11demo;

public class HttpRequestDemo1 {
    private final String uri;
    private final String header;
    private final String timeout;

    // Private constructor so only the Builder can make this object
    private HttpRequestDemo1(Builder builder) {
        this.uri = builder.uri;
        this.header = builder.header;
        this.timeout = builder.timeout;
    }

    // Getters
    public String getUri() { return uri; }
    public String getHeader() { return header; }
    public String getTimeout() { return timeout; }

    // Static Builder Class
    public static class Builder {
        private String uri;
        private String header;
        private String timeout;

        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public Builder header(String header) {
            this.header = header;
            return this;
        }

        public Builder timeout(String timeout) {
            this.timeout = timeout;
            return this;
        }

        // Build method to create the final object
        public HttpRequestDemo1 build() {
            return new HttpRequestDemo1(this);
        }
    }
}
