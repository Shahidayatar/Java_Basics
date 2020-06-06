// from here on it is not from mike dane jave course .. this is self learning


public abstract class AbstractClassAndMethod_18 {// the benefit of abstract class is you cannot create an objectof this class
                            //i.e AbstractClassAndMethod_18 hiii= new AbstractClassAndMethod_18 ();(not allowed)

String name;
public void learn (){// but if you want to call this method you need to inherit from other class
    // that is create a new class and use extends keyword// look below


}
public static class Callme extends AbstractClassAndMethod_18{

        public void learn() {
            System.out.println("hello guys");
        }
    }



    public static void main(String[] args) {// remember you cannot access a static method from nonstatic method..
Callme learning = new Callme();                // so both have to be static
learning.learn();




// remeber Interface is an example of abstract class

    }
}
