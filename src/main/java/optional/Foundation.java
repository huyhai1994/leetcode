package optional;


import java.util.Optional;

public class Foundation {
    public static String getUserEmail(User user) {
        return Optional.ofNullable(user)
                .map(User::getEmail)
                .orElse("unknown");
    }
}
