import java.util.Scanner;

public class BuildACalculator5 {

    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        int num3=3;
        Scanner cacli=new Scanner(System.in);
        System.out.println("Enter number 1 :");
        num1=cacli.nextInt();


        System.out.println("Enter number 2 :");
        num2=cacli.nextInt();


        System.out.println("Enter number 3 :");// we took the values from user .. now we ask operator
        num3=cacli.nextInt();


        System.out.println("Enter the operator :");
        String operator= cacli.next();// if you use next line code will finsih here so use next
if (operator.equals('+')){
    System.out.println(num1+num2+num3);
}else if (operator.equals("-")){
    System.out.println(num1-num2-num3);

}else if (operator.equals("*")){
    System.out.println(num1*num2*num3);

}else {
    System.out.println("enter right operator :");
}


    }
}
