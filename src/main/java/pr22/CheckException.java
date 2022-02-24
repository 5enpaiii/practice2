package pr22;

import pr2.Calc;

public class CheckException {
    public static void main(String[] args){
        //1) Make your own Exception implementation. Use it in your CalcApp

        Calc.div(3, 0);
    }
}
