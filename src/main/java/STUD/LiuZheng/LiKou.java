package STUD.LiuZheng;


/**
 * @author qingyun
 * @version 1.0
 * @date 2021/4/5 16:20
 */
public class LiKou {
}



//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = 0, p2 = 0;
//        int[] sorted = new int[m + n];
//        int cur = 0;
//        while (p1 < m || p2 < n){
//            if (p1 == m){
//                cur = nums2[p2++];
//            }else if (p2 == n){
//                cur = nums1[p1++];
//            }else if (nums1[p1] < nums2[p2]){
//                cur = nums1[p1++];
//            }else {
//                cur = nums2[p2++];
//            }
//            sorted[p1+p2-1] = cur;
//        }
//        for (int i = 0; i != m+n ; i++) {
//            nums1[i] = sorted[i];
//        }
//    }
//}


//class Solution {
//    public int search(int[] nums, int target) {
//        int n = nums.length;
//        if (n == 0){
//            return -1;
//        }
//        if (n == 1){
//            if (nums[0] == target){
//                return 0;
//            }else {
//                return -1;
//            }
//        }
//        int left = 0; int right = n-1;
//        while (left <= right){
//            int mid = (left+right)/2;
//            if (nums[mid] == target){
//                return mid;
//            }
//            if (nums[left] <= nums[mid]){
//                if (nums[left] <= target && nums[mid]>target){
//                    right = mid-1;
//                }else {
//                    left = mid+1;
//                }
//            }else {
//                if (nums[mid] < target && target<=nums[right]){
//                    left = mid+1;
//                }else {
//                    right = mid-1;
//                }
//            }
//        }
//        return  -1;
//    }
//}

//class Solution {
//    public int findMin(int[] nums) {
//        int left  = 0;
//        int right = nums.length-1;
//        while (left < right){
//            int mid = (left+right)/2;
//            if (nums[mid] < nums[right]){
//                right = mid;
//            }else if (nums[mid] > nums[right]){
//                left = mid+1;
//            }else {
//                right--;
//            }
//        }
//        return nums[left];
//    }
//}

//class Solution {
//    public boolean isUgly(int n) {
//        while (true){
//            if (n == 1){
//                return true;
//            }
//            if (n%2 == 0){
//                n = n/2;
//            }else if (n%3 == 0){
//                n = n/3;
//            }else if (n%5 == 0){
//                n = n/5;
//            }else {
//                return false;
//            }
//        }
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int i = solution.nthUglyNumber(1);
//        System.out.println(i);
//    }
//    public int nthUglyNumber(int n) {
//        int Number = 0;   boolean flag = false; int i = 0;
//        while (Number < n){
//            i++;
//                flag = isUgly(i);
//            if (flag){
//                Number++;
//                flag = false;
//            }
//        }
//        return i;
//    }
//
//    private boolean isUgly(int n) {
//        while (true){
//            if (n == 1){
//                return true;
//            }
//            if (n%2 == 0){
//                n = n/2;
//            }else if (n%3 == 0){
//                n = n/3;
//            }else if (n%5 == 0){
//                n = n/5;
//            }else {
//                return false;
//            }
//        }
//    }
//}

//class Solution {
//    public int nthUglyNumber(int n) {
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//        int p2 = 1 ; int p3 = 1; int p5 = 1;
//        for (int i = 2; i <= n; i++) {
//            int num2 = dp[p2] * 2 , num3  =  dp[p3] * 3 ,num5 = dp[p5] * 5;
//            dp[i] = Math.min(num5,Math.min(num2,num3));
//           if (dp[i] == num2){
//               p2++;
//           }
//           if (dp[i] == num3){
//               p3++;
//           }
//           if (dp[i] == num5){
//               p5++;
//           }
//        }
//        return dp[n];
//    }
//}

//class Solution {
//    public int arraySign(int[] nums) {
//        int f = 0;
//        for (int num : nums) {
//            if (num == 0){
//                return 0;
//            }
//            if (num < 0){
//                f++;
//            }
//        }
//        if ((f%2) ==0){
//            return 1;
//        }else {
//            return 0;
//        }
//    }
//}
//class Solution {
//    public int findTheWinner(int n, int k) {
//        final  int N = n, S = 1, M = k;
//        int[] p = new int[N];
//        int[] q = new int[N];
//        int i,j,o ,e =  0;
//        o = S-2;
//        for (i = 0; i <=N ; i++) {
//            for ( j = 0; j <= M; j++) {
//                if (o == N-1){
//                    o = 0;
//                }else {
//                    o++;
//                }
//                if (p[o] == 1){
//                    j--;
//                }
//                p[o] = 1;
//                q[e++]  = o+1;
//            }
//        }
//        return q[(q.length-1)];
//    }
//}
//class Solution {
//    public int minSideJumps(int[] obstacles) {
//        int[][] p = new int[2][];
//        for (int i = 0; i < obstacles.length; i++) {
//            if (obstacles[i] == 1){
//                p[0][i] = 1;
//            }else if (obstacles[i] == 2){
//                p[1][i] = 1;
//            }else if (obstacles[i] == 3){
//                p[2][i] =1;
//            }
//        }
//            int num = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < obstacles.length; j++) {
//
//            }
//        }
//
//        return 0;
//    }
//}

//
//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode prehead = new ListNode(-1);
//
//        ListNode prev = prehead;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            } else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//
//        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
//        prev.next = l1 == null ? l2 : l1;
//        return prehead.next;
//    }
//}
//class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        solution.threeSum(new int[]{-1,0,1,2,-1});
//    }
//    List<List<Integer>> res;
//    public List<List<Integer>> threeSum(int[] nums) {
//        res = new ArrayList<>();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                break;
//            }
//            if (i == 0 || nums[i] != nums[i-1]){
//                twoSum(nums,i);
//            }
//        }
//        return res;
//    }
//
//    private void twoSum(int[] nums, int index) {
//        int i = index+1,j = nums.length - 1,item = nums[index],target = -item;
//        long sum;
//        while (i < j){
//            sum = (long) nums[i] + (long)nums[j];
//            if (sum == target){
//                res.add(Arrays.asList(item,nums[i],nums[j]));
//                while (i+1 < j && nums[i+1] == nums[i]){
//                    i++;
//                }
//                while (j-1 > i && nums[j-1] == nums[j]){
//                    j--;
//                }
//            }
//            if (sum > target){
//                j--;
//            }else {
//                i++;
//            }
//        }
//    }
//}

//class Solution {
//    public String largestNumber(int[] nums) {
//        int n = nums.length;
//        Integer[] numsArr = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            numsArr[i] = nums[i];
//        }
//
//        Arrays.sort(numsArr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer x, Integer y) {
//                long sx  = 10,sy =  10;
//                while (sx <= x){
//                    sx *= 10;
//                }
//                while (sy <= y){
//                    sy *=10;
//                }
//                return (int)(-sy*x - y + sx * y + x);
//            }
//        });
//        if (numsArr[0] == 0){
//            return "0";
//        }
//        StringBuffer ret = new StringBuffer();
//        for (Integer num : numsArr) {
//            ret.append(num);
//        }
//        return ret.toString();
//    }
//}
//class Solution {
//    public List<String> letterCombinations(String digits) {
//        List<String> combinations = new ArrayList<>();
//        if (digits.length() == 0){
//            return combinations;
//        }
//        Map<Character, String> phoneMap = new HashMap<Character, String>(){{
//            put('2',"abc");
//            put('3',"def");
//            put('4',"ghi");
//            put('5',"jkl");
//            put('6',"mno");
//            put('7',"pqrs");
//            put('8',"tuv");
//            put('9',"wxyz");
//        }};
//        backtrack(combinations,phoneMap,digits,0,new StringBuffer());
//        return combinations;
//    }
//
//    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
//        if (index == digits.length()){
//            combinations.add(combination.toString());
//        }else {
//            char digit = digits.charAt(index);
//            String letters = phoneMap.get(digit);
//            for (int i = 0; i < letters.length(); i++) {
//                combination.append(letters.charAt(i));
//                backtrack(combinations,phoneMap,digits,index+1,combination);
//                combination.deleteCharAt(index);
//            }
//        }
//    }
//}
//class Solution {
//    List res = new ArrayList<String>();
//    public List<String> generateParenthesis(int n) {
//        if (n <= 0){
//            return res;
//        }
//        getParentheris("",n,n);
//        return res;
//    }
//
//    private void getParentheris(String str, int left, int right) {
//       if (left == 0 && right == 0){
//           res.add(str);
//           return;
//       }
//       if (left == right){
//           getParentheris(str+"(",left-1,right);
//       }else {
//           if (left > 0){
//               getParentheris(str+"(", left-1, right);
//           }
//           getParentheris(str+")", left, right-1);
//       }
//    }
//}

//class Solution {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        ArrayList<Integer> output = new ArrayList<>();
//        for (int num : nums) {
//            output.add(num);
//        }
//        int n = nums.length;
//        backtrack(n,output,res,0);
//        return res;
//    }
//
//    private void backtrack(int n, ArrayList<Integer> output, List<List<Integer>> res, int first) {
//        if (first == n){
//            res.add(new ArrayList<>(output));
//        }
//        for (int i = first; i < n; i++) {
//            //动态维护数组
//            Collections.swap(output,first,i);
//            backtrack(n,output,res,first+1);
//            Collections.swap(output,first,i);
//        }
//    }
//}

//class Solution {
//    public int maxSubArray(int[] nums) {
//        int pre = 0 ;int maxNum = nums[0];
//        for (int num : nums) {
//            pre = Math.max(pre+num,num);
//            maxNum = Math.max(maxNum,pre);
//        }
//        return maxNum;
//    }
//}

//class Solution {
//    public boolean canJump(int[] nums) {
//        int k = 0;  boolean flag = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                for ( k = 0; k < i; k++) {
//                    if (k + nums[k] > i){
//                       flag = true;
//                       break;
//                    }
//                }
//                if (flag){
//                    flag = false;
//                    k = i;
//                }else {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}

