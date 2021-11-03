package OOPs;

public class MethodParameter {
    //String method as parameter
    static void myMethod(String playername ) {

        System.out.println("Player: " +playername);
    }

    public static void main(String[] args) {
        myMethod("Sachin Tendulkar");
        myMethod("Saurav Ganguly");
        myMethod("Rahul Dravid");


    }
}

