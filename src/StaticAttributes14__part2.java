public class StaticAttributes14__part2 {
    public static void main(String[] args) {
        StaticAttributes14 slearn = new StaticAttributes14();
        StaticAttributes14 learns=  new StaticAttributes14();
        slearn.age=12;
        slearn.id=49615;
        slearn.name="Shahid";
        slearn.company="google";


        learns.age=19;
        learns.id=49518;
        learns.name="adil";
        learns.company="amazon";

        System.out.println(slearn.age+slearn.name+slearn.id+slearn.company);// static  gives same value ...
        System.out.println(learns.age+learns.name+learns.id+learns.company);// the company output must be amazon but it is google because we use static
    }

}
