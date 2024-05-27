import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String usernameAdmin = "Admin";
        String passwordAdmin = "Admin123";
        int login;

        String[] nimmahasiswa = {"2023103770311024", "1234567890"};

        System.out.println("=== Library System ===");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose Option (1-3): ");
        login = input.nextInt();

        switch (login){
            case 1 :
                System.out.print("Enter your NIM: ");
                String masukkannim = input.nextLine();

                boolean benaratausalah = false;
                for ( String nim : nimmahasiswa){
                    if (nim.equals(masukkannim)){
                        benaratausalah = true;
                        break;
                    }
                }

                if (benaratausalah){
                    System.out.println("Successfull login as Student");
                } else {
                    System.out.println("User Not Found");
                }
                break;
            case 2 :
                System.out.println("Enter your NIM: ");
                String masukkanAdmin = input.nextLine();
                System.out.println("Enter your Password: ");
                String paswordAdmin = input.nextLine();
                if (masukkanAdmin.equals(usernameAdmin) && paswordAdmin.equals(passwordAdmin)){
                    System.out.println("Successfull login as Admin");
                } else {
                    System.out.println("Admin user not found");
                }
                break;
            case 3 :
                System.out.println("Thank you");

        }
    }
}