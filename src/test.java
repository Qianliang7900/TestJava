import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        int i = 122;
        byte a = (byte) i;
        char b = (char) a;
        String c = String.valueOf(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

//        byte b = 97;
//        System.out.println((char)b);
//        HashMap<Integer, Character> map = new HashMap<>();
//        for (int i = 0; i <52 ; i++) {
//            if (i<26){
//                map.put(i,(char)(byte)(i+65));
//            }
//            if (i>=26){
//                map.put(i,(char)(byte)(i+71));
//            }
//
//
//        }


    }
}
