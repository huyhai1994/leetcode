package user_name_validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsernameValidatorTest {

    @Test
    @DisplayName("username length < 8 -> not valid")
    void userNameLengthNotValid() {
        String name = "Julia";
        assertFalse(name.matches(UsernameValidator.regularExpression));
    }

    @Test
    @DisplayName("username length > 8 ->  valid")
    void userNameLengthValid() {
        String name = "JuliaStomach";
        assertTrue(name.matches(UsernameValidator.regularExpression));
    }

    @Test
    @DisplayName("valid name with number")
    void validUserNameWithNumber() {
        String name = "Samantha_21";
        assertTrue(name.matches(UsernameValidator.regularExpression));
    }

    @Test
    @DisplayName("invalid username begin with non-alphabetic character")
    void invalidUserNameBeginWithNonAlphabeticCharacter() {
        String name = "1Samantha";
        assertFalse(name.matches(UsernameValidator.regularExpression));
    }
}