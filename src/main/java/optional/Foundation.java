package optional;


public class Foundation {
    public static String getUserEmail(User user) {
        if (user == null) {
            return "unknown";
        }

        if (user.getEmail() == null) {
            return "unknown";
        }

        return user.getEmail();
    }
}
