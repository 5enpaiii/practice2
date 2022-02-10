package pr2;

public class StringCalc {
    public static void main(String[] args) {
        //2
        String s = "qwdxvcsdf WERD AWEDA AE FAE A";
        System.out.println(s.split(" ").length);
        //3
        for (String w:s.split(" ")){
            System.out.print(w.length());
        }
        //4
        System.out.println(stringCalc(s, 2));
    }
    static int stringCalc(String s, int i){
        return s.split(" ")[i].length();
    }
}
