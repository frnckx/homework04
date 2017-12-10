package hu.homework04.jf;

import java.util.Scanner;

/**
 * Created by java1 on 2017.12.06..
 */
public class UserRegistry {
    private User[] users;


    public UserRegistry() { //paraméter nélküli konstruktor
        users = new User[10]; // inicializálás
        init();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        int operation = -1;
        while (operation != 5) {
            System.out.print("Válasszon egy menüpontot: ");
            operation = scanner.nextInt();
            switch (operation) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    printAllUser();
                    break;
                case 2:
                    addNewUser();
                    ;
                    break;
                case 3:
                    modifyUser();
                    ;
                    break;
                case 4: deleteUser();
                    ;
                    break;
                case 5:
                    System.out.println("Kilépés...");
                default:
            }
        }
    }

    public void printMenu() {
        System.out.println("**********Menu**********");
        System.out.println("*****Print Menu(0)******");
        System.out.println("***Print all User (1)***");
        System.out.println("***Add New User (2)*****");
        System.out.println("***Modify User (3)******");
        System.out.println("***Delete User (4)******");
        System.out.println("********Exit (5)********");

    }

    private void init() {
        for (int i = 0; i < users.length - 1; i++) {
            users[i] = new User();
            users[i].setId(i);
            users[i].setFirstName("alma" + Math.random() * 100);
            users[i].setLastname("béla" + Math.random() * 100);
            users[i].setPassword("secretkey" + Math.random() * 100);
            users[i].setAge((int) (Math.random() * 100));
        }

    }

    private void printAllUser() {

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.print("id: " + users[i].getId());
                System.out.print(", first name: " + users[i].getFirstname());
                System.out.print(", last name: " + users[i].getLastname());
                System.out.print(", password: " + users[i].getPassword());
                System.out.println(", age: " + users[i].getAge());
            }

        }
    }

    private void addNewUser() {
        boolean hasPlace = false;

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                Scanner scanner = new Scanner(System.in);
                User user = new User();
                int id = 0;

                for (int j = 0; j < users.length; ++j) {
                    if (users[j] != null && users[j].getId() > id) {
                        id = users[j].getId();
                    }

                }


                String firstname;
                String lastname;
                String password;
                int age;
                System.out.println("First name: ");
                firstname = scanner.next();
                System.out.println("Last name: ");
                lastname = scanner.next();
                System.out.println("Password: ");
                password = scanner.next();
                System.out.println("age: ");
                age = scanner.nextInt();
                user.setId(id);
                user.setFirstName(firstname);
                user.setLastname(lastname);
                user.setPassword(password);
                user.setAge(age);
                users[i] = user;
                hasPlace = true;
                break;
            }

        }
        if (!hasPlace) {
            System.out.println("nincs több hely");
        }

    }

    private void modifyUser() {
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Módosítandó user id: ");
        id = scanner.nextInt();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                String firstname;
                String lastname;
                String password;
                int age;
                System.out.println("First name: ");
                firstname = scanner.next();
                System.out.println("Last name: ");
                lastname = scanner.next();
                System.out.println("Password: ");
                password = scanner.next();
                System.out.println("age: ");
                age = scanner.nextInt();

                users[i].setFirstName(firstname);
                users[i].setLastname(lastname);
                users[i].setPassword(password);
                users[i].setAge(age);
                break;
            }
        }

    }

    private void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Törlendő user id: ");
        id = scanner.nextInt();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
                break;

            }
        }

    }
}
