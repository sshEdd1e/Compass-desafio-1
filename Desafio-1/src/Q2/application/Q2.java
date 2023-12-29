package Q2.application;

import Q2.model.entities.Sistema;

public class Q2 {
    public static void main(String[] args) {
        Sistema sistema = new Sistema("user1@gmail.com", "123456");
        sistema.addUser("user2", "654321");
        sistema.addUser("31912345678", "123654");
        sistema.addUser("user3", "654123");
        sistema.logar("user2", "654321");
    }
}
