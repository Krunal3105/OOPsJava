package OOPs;

public class ConsParameter {
    int a;
    public ConsParameter(int b) {
         a =  b;
    }
    public static void main(String[] args) {
        ConsParameter Obj = new ConsParameter(7);
        ConsParameter Obj1 = new ConsParameter(8);
        System.out.println(Obj.a + Obj1.a);
    }
}

