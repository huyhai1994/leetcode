package fileio.naive_reading;

public class Cookie {
    private String cookie;
    private String timestamp;

    public Cookie(String cookie, String timestamp) {
        this.cookie = cookie;
        this.timestamp = timestamp;
    }

    public Cookie() {
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
