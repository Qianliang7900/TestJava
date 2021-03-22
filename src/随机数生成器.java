import java.util.HashMap;
import java.util.Random;


//生成一个随机密码  8位数 以字母开头   包含数字字母 和下划线
public class 随机数生成器 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {

            String s = suijinum(8);
            System.out.println(s);
            System.out.println();
        }

    }

    public static String suijinum(int i) {
        if (i == 8) {
            String res = suijiStringOf8();
            int indexOf_ = new Random().nextInt(7) + 1;
            res = res.substring(0, indexOf_) + "_" + res.substring(indexOf_, res.length());
            return res;
        } else if (i == 16) {
            String res = suijiStringOf8() + suijiStringOf8();
            int indexOf_ = new Random().nextInt(14) + 1;
            res = res.substring(0, indexOf_) + "_" + res.substring(indexOf_, res.length());
            return res;
        } else {
            return "只能生成8位或16位密码，请输入正确的位数！";
        }
    }


    public static String suijiStringOf8() {
        String res;  //定义返回结果
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        putString(map);
        //获取随机数的第一位
        String s1 = map.get(new Random().nextInt(52)).toString();
        res = s1;
        getnum(new Random().nextInt(9));

        int numOfString = new Random().nextInt(5) + 1;
        for (int i = 0; i < numOfString; i++) {
            res = res + map.get(new Random().nextInt(52));

        }

        int numOfnum = 6 - numOfString;
        for (int i = 0; i < numOfnum; i++) {
            int s = getnum(new Random().nextInt(10));
            int index = new Random().nextInt(numOfString) + 2;
            res = res.substring(0, index) + s + res.substring(index, res.length());

        }
        return res;
    }

    //随机数字集合
    public static Integer getnum(int i) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        return arr[i];
    }

    //随机字母集合
    public static HashMap<Integer, Character> putString(HashMap<Integer, Character> map) {
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                map.put(i, (char) (byte) (i + 65));
            }
            if (i >= 26) {
                map.put(i, (char) (byte) (i + 71));
            }

        }
        return map;
    }
}
