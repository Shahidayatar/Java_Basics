import java.text.BreakIterator;

public class Constructors12 {
    String names;//
    int age;
    double gpa;

    public Constructors12(String name, int age,double gpa){
this.names=name;// we are assinging the above data types to constructor so we need to do  this// look at string name
this.age=age;
this.gpa=gpa;
// secod code-- video 30 mike dane java
    }
    public double gpas(){
        if (this.gpa>3.5){
            System.out.println("you pass !");

        }
        return this.gpa;

    }
}
