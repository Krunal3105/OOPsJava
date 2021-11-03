package OOPs;

public class MethodOverloading {
    //Using int multiplication.
    static int intMethod(int a, int b) {
        return a * b;
    }
    //Using double subtraction.
    static double doubleMethod(double a,double b){
        return a - b;
    }
    //Using float addition
    static float floatMethod(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        int num = intMethod(7, 4);
        double num2 = doubleMethod(7.11, 9.9);
        float num3 = floatMethod(5.576f, 4.9795f);
        System.out.println("int = " + num);
        System.out.println("double = " + num2);
        System.out.println("float = " +num3);
    }

}
