package enums.lab;

public class HttpService {

    public void handleHttpCode(int httpCode) {
        int code = httpCode/100;
        HttpCode response = HttpCode.findByCode(code);
        System.out.println(response);
    }

    public static void main(String[] args) {
        HttpService service = new HttpService();
        service.handleHttpCode(333);
    }
}
