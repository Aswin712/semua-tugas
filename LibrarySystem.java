import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    String nimOrUsername;
    String password;
    String role;

    User(String nimOrUsername, String password, String role) {
        this.nimOrUsername = nimOrUsername;
        this.password = password;
        this.role = role;
    }
}

public class LibrarySystem {

    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("202210370311203", new User("202210370311203", "studentPass", "student"));
        users.put("admin", new User("admin", "admln", "admin"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter your NIM: ");
                scanner.nextLine();
                String nim = scanner.nextLine();
                User student = users.get(nim);
                if (student != null) {
                    if (student.password.equals("studentPass")) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("Incorrect Password");
                    }
                } else {
                    System.out.println("User Not Found");
                }
            } else if (choice == 2) {
                System.out.print("Enter your username (admin): ");
                scanner.nextLine();
                String username = scanner.nextLine();
                User admin = users.get(username);
                if (admin != null) {
                    if (admin.password.equals("admln")) {
                        System.out.println("Successful Login as Admin");
                    } else System.out.println("Incorrect Password");
                }
            }
        }
    }
}