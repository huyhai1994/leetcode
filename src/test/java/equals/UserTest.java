package equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    public void compareTwoUser() {
        User u1 = new User("Alice", 30);
        User u1Prime = u1;
        User u2 = new User("Alice", 30);
        User u3 = null;
        User u4 = new User("James", 30);
        User u5 = new User("Jonas", 20);

        assertTrue(u1.equals(u2));
        assertTrue(u1.equals(u1Prime));
        assertFalse(u1.equals(u3));
        assertFalse(u1.equals(u4));
        assertFalse(u1.equals(u5));
        assertTrue(null == null);


    }

}