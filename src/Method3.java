public class Method3 {

    public static void hello(){
        System.out.println("hi");

    }


    public static void hi (int age){
        System.out.println("i am "+age);
    }

// we wanted to to use return so we did not put void
    //we are getting the cube of no
    public  static int cube(int power){
        return (power*power*power);// any code after return statement is never executed

    }



    public static void main(String[] args) {
        hello();
        hi(1);

        System.out.println(cube(4));
    }

}
