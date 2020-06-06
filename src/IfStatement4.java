import java.util.Scanner;

public class IfStatement4 {
    public static void main(String[] args) {
        Scanner shah= new Scanner(System.in);
        System.out.println("what is your name");
        String name=shah.nextLine();
        System.out.println("what is you age?");
        int age= shah.nextInt();
        if ( name.contains("shahid") && age==19){
            System.out.println(" you are "+name+" and you are " + age);
        }else{
            System.out.println("enter correct value");
        }


    }
}
