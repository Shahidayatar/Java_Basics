import java.util.Scanner;

public class SwitchStatement6 {
    public static void main(String[] args) {
        Scanner ask= new Scanner(System.in);
        System.out.println("What is your age ? ");
        int age = ask.nextInt();
        switch (age){
            case 19:
                System.out.println(" you are 19 ");
                break;
            case 20:
                System.out.println(" you are 20 ");
            case 21:
                System.out.println(" you are 21 ");
            default:
                System.out.println(" enter proper age");


        }


    }
}
