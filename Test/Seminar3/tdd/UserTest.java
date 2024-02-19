package Seminar3.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    public static User userActual;
    public static User userFail;

    /**
     * Создаем двух пользователей:
     * userActual - пользователь удовлетворяющий условиям теста
     * userFail - пользователь НЕ удовлетворяющий условиям теста
     */
    @BeforeAll
    public static void createUsers() {
        userActual = new User("someName", "somePassword", Role.ADMIN);
        userFail = new User("someName", "somePassword", Role.USER);
    }

    /**
     * Тестирование успешной аутентификации пользователя
     * ожидаем получить от метода authenticate и изменение поля isAuthenticate - true
     */
    @Test
    void checkAuthentificatePositive() {
        userActual.authentificate("someName", "somePassword");
        assertTrue(userActual.isAuthentificate);
    }

    /**
     * Тестирование отрицательной аутентификации пользователя
     * ожидаем получить от метода authenticate - false
     * поле isAuthenticate не подвергается изменению
     */
    @Test
    void checkAuthenticateNegative() {
        userFail.authenticate("wrongName", "wrongPassword");
        assertFalse(userFail.isAuthenticate);
    }

    /**
     * Тестирование подтверждения роли администратора
     * для пользователя удовлетворяющего условиям теста
     * ожидаем получить от метода isRoleAdmin() - true
     */
    @Test
    void checkIsRoleAdminPositive() {
        assertTrue(userActual.isRoleAdmin());
    }

    /**
     * Тестирование отсутствия роли администратора
     * для пользователя НЕ удовлетворяющего условиям теста
     * ожидаем получить от метода isRoleAdmin() - false
     */
    @Test
    void checkIsRoleAdminNegative() {
        assertFalse(userFail.isRoleAdmin());
    }
}