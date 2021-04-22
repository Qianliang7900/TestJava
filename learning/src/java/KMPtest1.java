public class KMPtest1 {
    //生成匹配子串的next数组
    public static int[] next(String s){
        int[]  n = new int[s.length()];
        int j=0;
        for (int i = 1; i < s.length(); i++) {
            if (j>0 && s.charAt(i)!=s.charAt(j)){
                j=n[j-1];
            }
            if (s.charAt(i)==s.charAt(j)){
                j++;
            }
            n[i]=j;

        }
        return n;
    }

    public static int kmp(String str,String s){
        int[] n = next(s);
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (k>0 && str.charAt(i)!=s.charAt(k)){
                k = n[k-1];
            }
            if (str.charAt(i)==s.charAt(k)){
                k++;
            }
            if (k==s.length()){
                return i-k+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "BBCABCDABABADABCDABDE";
        String sub = "ABADAB";

        int index = kmp(str, sub);
        System.out.println("index-->" + index);

    }

}
