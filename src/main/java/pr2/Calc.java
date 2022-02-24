package pr2;
import pr22.DivByZeroException;
public class Calc {
    public static void main(String[] args) {
        int a=12;
        int b=4;
        add(a,b);
        min(a,b);
        mul(a,b);
        div(a,b);
        System.out.println(add(a,b));
        System.out.println(min(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int min(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        if(b == 0) try {
            throw new DivByZeroException("error");
        } catch (DivByZeroException e) {
            e.printStackTrace();
        }
        return a / b;
    }
}
