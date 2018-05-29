/**
 * Created by renwujie on 2018/05/29 at 15:37
 */
public class TestCharToInt {
    public static void main(String[] args) {
        String postfix = "1345*++2+= ";
        int i = 0,result = 0;

        while (i < postfix.length()) {
            char ch = postfix.charAt(i);
            if (ch >= '0' && ch <= '9') {
                result = 0;
                while (ch != ' ') {
                    //将整数字符转为整数值ch=90
                    result = result * 10 + Integer.parseInt(ch + "");
                    i++;
                    ch = postfix.charAt(i);
                    System.out.println("ch --> " + ch);
                }
                i++;
            }
        }

        System.out.println("result --》 " + result);
    }
}
