package Seminar3.tdd;

import javax.management.relation.Role;

//Разработайте класс User с методом аутентификации по логину и паролю. Метод должен возвращать true, если
//введенные логин и пароль корректны, иначе false. Протестируйте все методы.
public class User {
    String name;
    String password;

    Role userRole;

    boolean isAuthentificate = false;

    public User(String name, String password, Role userRole) {
        this.name = name;
        this.password = password;
        this.userRole = userRole;
    }

    public boolean authentificate(String name, String password) {
        this.isAuthentificate = (this.name.equals(name) && this.password.equals(password));
        return this.isAuthentificate;
    }

    public boolean isRoleAdmin() {
        return this.userRole.equals(Role.ADMIN);
    }

}