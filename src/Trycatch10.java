import java.util.Scanner;

public class Trycatch10 {

    public static void main(String[] args) {
        Scanner age= new Scanner(System.in);
        System.out.println("what is your age ? ");
        try {
            int ages= age.nextInt();
            System.out.println("you are "+ages+" years old ");

        }catch (Exception e){// there are many types of exception// watch mike dane video 25
            System.out.println("invalid number");// you canhave multiple catch block// if you use throwable instead of exception you
             // can cathch both error and exception

        }
    }
}
