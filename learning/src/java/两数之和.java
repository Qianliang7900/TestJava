import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * */
    public static void main(String[] args) {
        int[] nums ={1,3,4,5};
        int target = 5;
        int[] i = Solution.twoSum(nums, target);
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]+"\t");
        }

    }
    static class Solution{
        public static int[] twoSum(int[] nums,int target){
            Map<Integer,Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target-nums[i])){
                    return new int[] {map.get(target-nums[i]),i};
                }
                map.put(nums[i],i);
            }

          throw new IllegalArgumentException("没有满足条件的数");

        }

    }
}
