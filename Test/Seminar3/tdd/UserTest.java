package Seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("user1", "qwerty", false);
    }

    @Test
    @DisplayName("Проверка правильного ввода логина и пароля для пользователя")
    void testisAuthenticateVerifyCorrect() {
        assertTrue(user.isAuthenticateVerify("user1", "qwerty"));
    }

    @Test
    @DisplayName("Проверка на ввод не верного пароля при аутентификации пользователя")
    void testisAuthenticateVerifyIncorrect() {
        assertFalse(user.isAuthenticateVerify("user1", "qwer"));
    }

    @Test
    @DisplayName("Проверка на ввод пустых строк при аутентификации пользователя")
    void testIsAuthenticateVerifyEmptyCredentials() {
        assertFalse(user.isAuthenticateVerify("", ""));
        assertFalse(user.isAuthenticate);
    }

    @Test
    @DisplayName("Проверка разлоги")
    void testLogOut() {
        user.logOut();
        assertFalse(user.isAuthenticate);
    }
}