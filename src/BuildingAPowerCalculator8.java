public class BuildingAPowerCalculator8 {
    public static void main(String[] args) {
        System.out.println(power(2,6));
    Exponent();
    }
    public static int power(int basenum, int pownum){
        int result = 1;
        for(int i= 0;i<pownum;i++){
            result=result*basenum;
        }

        return result ;


    }
                // Nested loop


    public static  void Exponent(){// we called this in the main
        for (int j=0;j<3;j++){
            for (int i =0;i<3 ;i++) {
                System.out.println("J : " + j +"       I : "+i);
            }
        }
    }
}
