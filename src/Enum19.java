public class Enum19 {
    enum level{//https://www.w3schools.com/JAVA/java_enums.asp
        low,medium ,high

    }

    public static void main(String[] args) {
        level enumsss = level.high;// enums also cannot have an object .. we call it using '.'
        System.out.println(enumsss);// this is the way to acces the the nums

   // using for loop to get output

        for (level myVar : level.values()) {
            System.out.println(myVar);
        }


        //using switch statement


        level myVar = level.medium;

        switch(myVar) {
            case low:
                System.out.println("Low level");
                break;
            case medium:
                System.out.println("Medium level");
                break;
            case high:
                System.out.println("High level");
                break;
        }



    }
}

