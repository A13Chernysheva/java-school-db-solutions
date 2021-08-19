package enums.lab;

/**
 * @author Evgeny Borisov
 */
public enum HttpCode {

    REDIRECTION(300, 399) {
        @Override
        void handle() {
            System.out.println("Redirection completed");
        }
    },

    CLIENT_ERROR(400, 499) {
        @Override
        void handle() {
            System.out.println("Client error occurred");
        }
    },

    SERVER_ERROR(500, 599) {
        @Override
        void handle() {
            System.out.println("Server error occurred");
        }
    };

    HttpCode(int minHttpCode, int maxHttpCode) {
        this.minHttpCode = minHttpCode;
        this.maxHttpCode = maxHttpCode;
    }

    private int minHttpCode;
    private int maxHttpCode;

    private boolean checkCode(int code) {
        return minHttpCode <= code && code <= maxHttpCode;
    }

    static HttpCode getHttpCode(int httpCode) {
        HttpCode[] httpCodes = values();
        for (HttpCode code: httpCodes) {
            if (code.checkCode(httpCode)) {
                return code;
            }
        }
        throw  new IllegalStateException(httpCode + "illegal code");
    }

    abstract void handle();
}
