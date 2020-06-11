public class InheritenceImplements17____interface {
    public static void main(String[] args) {
        InheritenceImplements17___part3 callme = new InheritenceImplements17___part2();// there is difference we put InheritenceImplements17___part3
        // instead of InheritenceImplements17___part2
        callme.hello();



        InheritenceImplements17___part3 callme1 = new InheritenceImplements17___part3() {  // look at the output
            @Override
            public void hello() {
                System.out.println("hiiiiii");
            }

            @Override
            public void hi() {
                System.out.println("helloss");

            }
        };
        callme1.hello();
// remeber Interface is an example of abstract class

    }
}// watch mike dane video 38 (last one) package and imports is not done
