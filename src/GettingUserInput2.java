
import java.util.Scanner;

public class GettingUserInput2 {
    public static void main(String[] args) {
        Scanner ask= new Scanner(System.in);
        System.out.println("what is your name?");
        String name= ask.nextLine();
        System.out.println("what is you age");
        int age= ask.nextInt();

        System.out.println("your name is "+name+" and you are "+ age);



//                             Arrays


        // first way of writing an arrray


        String [] names= {"Shahid","karthik","Daniel"};
        System.out.println(names[1]);
        names[1]= "karthik swami";
        System.out.println(names[1]);// you can change the value of an array look above value for names[1]


        // second way of writing an array

        int[] ages= new int[4];
        ages [0] = 9;
        ages [1]=8;
        ages[2]=7;
        ages[3]=6;
        System.out.println(ages[1]);


    }








}
