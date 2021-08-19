package enums.lab;

import enums.MaritalStatus;
import lombok.Getter;

@Getter
public enum HttpCode {

    REFLECTION(3), CLIENT_ERROR(4), SERVER_ERROR(5);

    private final int code;

    HttpCode(int code) {
        this.code = code;
    }

    public static HttpCode findByCode(int code) {
        HttpCode[] statuses = values();
        for (HttpCode status : statuses) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalStateException(code+" not supported");

    }
}
