public class ForElse7 {
    public static void main(String[] args) {

        for (int i=0;i<4;i++){// Structure of for loop
            System.out.println("hello shahid");
        }
        int i=1;
    while (i<5) {// while loop structure
        System.out.println("hello this done using while loop");
        i++;
        }
    ArrayUsingForLoop();

    }


    public static void ArrayUsingForLoop(){

       String []name={"shahid","karthik","daniel"};
       for (int i = 0; i<name.length; i++){
           System.out.println(" this is an array using for loop and your name is  "+name[i]);
       }


    }



}
