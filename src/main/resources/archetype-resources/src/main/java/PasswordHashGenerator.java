package ${package};

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * To generate password hash for test data, run this main class.
 */
public class PasswordHashGenerator {
    public static void main(String[] args) {
        final String password = "p@ssw0rd";
        System.out.println(new BCryptPasswordEncoder().encode(password));
    }
}
