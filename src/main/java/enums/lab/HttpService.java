package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class HttpService {

    public void handleHttpCode(int httpCode) {
        HttpCode http = HttpCode.getHttpCode(httpCode);
        http.handle();
    }

    public static void main(String[] args) {
       HttpService service = new HttpService();
       service.handleHttpCode(402);

    }
}
