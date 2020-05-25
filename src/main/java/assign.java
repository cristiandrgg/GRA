import java.util.ArrayList;
import java.util.Scanner;


public class assign {

    public static void  main(String[] args) {
        ArrayList<userType> users = new ArrayList<userType>(); // store and hold user input temporary
        Scanner input = new Scanner(System.in); // to obtain input from user

        String email, password, username;
        int contact;

        // System.out.println(" SIGN UP PAGE ");
        System.out.println("Pick your choice:  ");
        System.out.println("1) Seller" + "\n" + "2) Buyer");
        int choice = input.nextInt();

        ArrayList<userType> Seller = new ArrayList<userType>(); // store and hold user(seller) input temporary
        ArrayList<userType> Buyer = new ArrayList<userType>(); // store and hold user(buyer) input temporary

        switch (choice) {
            case 1:
                System.out.println("--- Seller Account ---");

                System.out.print("email : "); // input userType information (email, password ...)
                email = input.next();
                System.out.print("password : ");
                password = input.next();
                System.out.print("username : ");
                username = input.next();
                System.out.print("subject : ");


                Seller.add(new userType(email, password, username));
                break;

            case 2:
                System.out.println("--- Buyer Account ---");

                System.out.print("email : "); // input userType information (email, password ...)
                email = input.next();
                System.out.print("password : ");
                password = input.next();
                System.out.print("username : ");
                username = input.next();
                System.out.print("subject : ");


                Buyer.add(new userType(email, password, username));
                break;

            default:
                System.out.println("Please pick your account type");
        }
    }
}