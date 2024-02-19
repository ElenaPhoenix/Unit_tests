package Seminar3.tdd;

import java.util.ArrayList;
import java.util.List;

// Добавьте класс UserRepository для управления пользователями. В этот класс должен быть включен метод
// addUser, который добавляет пользователя в систему, если он прошел аутентификацию.
// Покройте тестами новую функциональность
public class UserRepository {
    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    /**
     * Добавление пользователя в список аутентифицированных пользователей
     * @param user
     */
    public void addUser(User user) {
        if (user.isAuthentificate) this.data.add(user);
        else throw new RuntimeException("wrong login or password!");
    }

    /**
     * Проверка находится ли пользователь в списке аутентифицированных пользователей
     * @param username имя пользователя
     * @return если является true, иначе false
     */
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Разлогирование пользователей не обладающих правами администратора,
     * удаляет пользователей из списка аутентифицированных пользователей.
     */
    public void logOutExceptAdministrator() {
        data.removeIf(user -> !user.isRoleAdmin());
    }
}