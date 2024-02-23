package Seminar5.user;

/**
 * У вас есть два класса - UserService и UserRepository. UserService использует UserRepository для получения информации о
 *  пользователе. Ваша задача - написать интеграционный тест, который проверяет, что UserService и UserRepository работают
 *  вместе должным образом.
 */
public class UserRepository {
    public String getUserById(int id) {
        // В реальной жизни здесь был бы код, работающий с базой данных
        return "User " + id;
    }
}
