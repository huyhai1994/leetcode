package java_enum;

public enum HttpStatus {
    OK(200),
    NOT_FOUND(404),
    INTERNAL_ERROR(500);
    private final int code;

    HttpStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
