package STUD.LiuZheng;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qingyun
 * @version 1.0
 * @date 2021/4/12 18:55
 */

public class Test {
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//class Solution {
//    public boolean isValidBST(TreeNode root) {
//        if (root != null){
//            int val = root.val;
//
//            if (root.left!=null){
//                int valLeft = root.left.val;
//                if (valLeft >= val){
//                    return false;
//                }
//                isValidBST(root.left);
//            }
//
//            if (root.right != null){
//                int valRight = root.right.val;
//                if (valRight <= val){
//                    return false;
//                }
//                isValidBST(root.right);
//            }
//        }
//        return true;
//    }
//}

//class Solution {
//
//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        //动态数组
//        TreeSet<Long> set = new TreeSet<>();
//        for (int i = 0; i < nums.length; i++) {
////            floor(E e) 方法返回在这个集合中小于或者等于给定元素的最大元素，如果不存在这样的元素,返回null.
////            ceiling(E e) 方法返回在这个集合中大于或者等于给定元素的最小元素，如果不存在这样的元素,返回null.
//            Long ceiling = set.ceiling((long) nums[i] - (long) t);
//            if (ceiling != null && ceiling <= (long)nums[i] + (long)t){
//                return true;
//            }
//
//            set.add((long)nums[i]);
//            if (set.size() == k+1){
//                set.remove((long)nums[i-k]);
//            }
//        }
//
//        return false;
//    }
//}
//
//class Solution {
//    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(1);
//        TreeNode treeNode1 = new TreeNode(2);
//        TreeNode treeNode2 = new TreeNode(3);
//        treeNode.left = treeNode1;
//        treeNode.right = treeNode2;
//        Solution solution = new Solution();
//        boolean symmetric = solution.isSymmetric(treeNode);
//        System.out.println(symmetric);
//    }
//    public boolean isSymmetric(TreeNode root) {
//        return check(root,root);
//    }
//
//    boolean check(TreeNode leftRoot,TreeNode rightRoot){
//        if (leftRoot == null && rightRoot == null){
//            return true;
//        }
//        if (leftRoot != null && rightRoot!=null){
//            return (leftRoot.val == rightRoot.val)&&(check(leftRoot.left, rightRoot.right)&&check(leftRoot.right,rightRoot.left));
//        }
//        return false;
//    }
//}
//


//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> arrayLists = new ArrayList<>();
//        if (root == null){
//            return arrayLists;
//        }
//        /**
//         * 使用队列记录
//         * 有关LinkedList  双向链表
//         * LinkedList是通过双向链表实现的
//         * 1、add()和offer()区别:
//         * add()和offer()都是向队列中添加一个元素。一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，
//         * 调用 add() 方法就会抛出一个 unchecked 异常，而调用 offer() 方法会返回 false。因此就可以在程序中进行有效的判断！
//         *  2、poll()和remove()区别：
//         * remove() 和 poll() 方法都是从队列中删除第一个元素。如果队列元素为空，
//         * 调用remove() 的行为与 Collection 接口的版本相似会抛出异常，但是新的 poll() 方法在用空集合调用时只是返回 null。因此新的方法更适合容易出现异常条件的情况。
//         * 3、element() 和 peek() 区别：
//         * element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。
//         */
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            ArrayList<Integer> integer = new ArrayList<>();
//            /**
//             *记录需要删除的队列数量
//             * 每一层的数量，依次记录
//             */
//            int size = queue.size();
//            for (TreeNode treeNode : queue) {
//                integer.add(treeNode.val);
//            }
//            arrayLists.add(integer);
//            for (int i = 0; i < size; i++) {
//                TreeNode poll = queue.poll();
//                if (poll.left!=null){
//                    queue.offer(poll.left);
//                }
//                if (poll.right!=null){
//                    queue.offer(poll.right);
//                }
//            }
//        }
//        return arrayLists;
//    }
//}
//
//

/**
 * 双指针指向，快指针与目标值不同时间，改变慢指针的指向
 * 注意快指针的速度，一次为一格
 * <p>
 * 暴力循环破解
 * 每次第一位相同时开始比对，全部相同则返回 不同则比对下一位
 */
//class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] ints = new int[]{0,1,2,2,3,0,4,2};
//        int i = solution.removeElement(ints, 2);
//        System.out.println(i);
//    }
//    public int removeElement(int[] nums, int val) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        int left = 0 ; int right = 0;
//        for (; right < nums.length; right++) {
//            if (nums[right] != val){
//                nums[left] = nums[right];
//                left++;
//            }else {
//            }
//        }
//        return left;
//    }
//}

//class Solution {
//    public int strStr(String haystack, String needle) {
//        if (needle.equals("") || (haystack.length()<needle.length())){
//            return 0;
//        }
//        int left = 0;
//        int right = 0;   int length = needle.length()-1;
//        for (; left < haystack.length() - needle.length(); left++) {
//            if (needle.charAt(right)==haystack.charAt(left)){
//               right++;
//               if (right == length){
//                   return left - length;
//               }
//            }else {
//                right = 0;
//            }
//        }
//        return -1;
//    }
//}


/**
 * 暴力循环破解
 * 每次第一位相同时开始比对，全部相同则返回 不同则比对下一位
 */
//class Solution {
//    public int strStr(String haystack, String needle) {
//        if (needle.equals("")){
//            return 0;
//        }
//        boolean flag = true;
//        int n = needle.length()-1;
//        for (int m = 0; m+n < haystack.length() ; m++) {
//            if (haystack.charAt(m) == needle.charAt(0)){
//                flag = true;
//                for (int j = 1; j < needle.length(); j++) {
//                    if (haystack.charAt(m+j) != needle.charAt(j)){
//                        flag = false;
//                    }
//                }
//                if (flag){
//                    return m;
//                }
//            }
//        }
//        return -1;
//    }
//}

//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> arrayLists = new ArrayList<>();
//        if (root == null) {
//            return arrayLists;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            ArrayList<Integer> integer = new ArrayList<>();
//            int size = queue.size();
//            for (TreeNode treeNode : queue) {
//                integer.add(treeNode.val);
//            }
//            arrayLists.add(integer);
//            for (int i = 0; i < size; i++) {
//                TreeNode poll = queue.poll();
//                if (poll.left!=null){
//                    queue.offer(poll.left);
//                }
//                if (poll.right!=null){
//                    queue.offer(poll.right);
//                }
//            }
//        }
//        return arrayLists;
//    }
//}

//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> arrayLists = new ArrayList<>();
//        if (root == null){
//            return  arrayLists;
//        }
//        Queue<TreeNode> linkedList = new LinkedList<>();
//        linkedList.offer(root);
//        while (!linkedList.isEmpty()){
//            int size = linkedList.size();
//            ArrayList<Integer> integers = new ArrayList<>();
//            for (TreeNode treeNode : linkedList) {
//                integers.add(treeNode.val);
//            }
//            arrayLists.add(integers);
//            for (int i = 0; i < size; i++) {
//                TreeNode poll = linkedList.poll();
//                if (poll.left!=null){
//                    linkedList.add(poll.left);
//                }
//                if (poll.right!=null){
//                    linkedList.add(poll.right);
//                }
//            }
//        }
//        return arrayLists;
//    }
//}

//class Solution {
//    public int maxDepth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        return (Math.max(left,right)+1);
//    }
//}


//class Solution {
//    public int numDecodings(String s) {
//        int n = s.length();
//        int[] f = new int[n + 1];
//        f[0] = 1;
//        for (int i = 1; i <= n; i++) {
//            if (s.charAt(i-1) != '0'){
//                f[i]+=f[i-1];
//            }
//            if (i > 1 && s.charAt(i-2) != '0'&& ((s.charAt(i-2) - '0')*10 + (s.charAt(i-1) - '0') <= 26)){
//                f[i] += f[i-2];
//            }
//        }
//        return f[n];
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
//    public int climbStairs(int n) {
//       int p = 0 , q = 0,r = 1;
//        for (int i = 1; i < n; i++) {
//            p = q;
//            q = r;
//            r = p+q;
//        }
//        return r;
//    }
//}

//class Solution {
//    public int maxProfit(int[] prices) {
//        int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minprice){
//                minprice = prices[i];
//            }else if ((prices[i] -  minprice) > maxprofit){
//                maxprofit = prices[i] -  minprice;
//            }
//        }
//        return maxprofit;
//    }
//}

//class Solution {
//    public int climbStairs(int n) {
//        int p = 0 , q = 0,r = 1;
//        for (int i = 1; i <= n; i++) {
//            p = q;
//            q = r;
//            r = p+q;
//        }
//        return r;
//    }
//}

//class Solution {
//    public int climbStairs(int n) {
//        //n= (n-1) + (n-2)
//        if (n == 1){
//            return 1;
//        }
//        int []dp = new int[n+1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//    }
//}

///**
// * 这玩意应该是贪心解法
// * 设-1买入为无穷大
// * 则第一天买入记为第一天的，当有比他小的时候，就买入，相当于原价卖了，再买入。
// * 如果比他大，则卖出，切记录此时的利润（因为没有手续费，所以这里是假定卖出，如果有利润更大的存在，则卖出更大的利润
// * 例如 2  5  9 则在2买入，5卖出 利润为3 ，因为在9卖出，利润为7，则相当于取消上次的交易）
// *
// */
//class Solution {
//    public int maxProfit(int[] prices) {
//        int price = Integer.MAX_VALUE;
//        int li = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < price){
//                price = prices[i];
//            }else if ((prices[i] - price) > li){
//                li = (prices[i] - price);
//            }
//        }
//        return li;
//    }
//}

//class Solution {
//    public int maxSubArray(int[] nums) {
//        int maxNum = nums[0];  int num = 0;
//        for (int i = 0; i < nums.length; i++) {
//            /**
//             * 遍历时，判断  相加和 与 当前变量值的大小 ，取较大值
//             */
//            num = Math.max(nums[i],num+nums[i]);
//            maxNum = Math.max(num,maxNum);
//        }
//        return maxNum;
//    }
//}

///**
// * 双指针的方法
// * 两个指针指向两个字符串
// * 判断s的指针是否等于s的长度
// */
//class Solution {
//    public boolean isSubsequence(String s, String t) {
//        char[] Schars = s.toCharArray();
//        char[] Tchars = t.toCharArray();
//        int i = 0;
//        if (s.equals("")){
//            return false;
//        }
//        for (; i < s.length(); ) {
//            for (int j = 0; j < t.length(); j++) {
//                if (Schars[i] == Tchars[j]){
//                    i++;
//                    if ( i == s.length() ){
//                        return true;
//                    }
//                }
//            }
//            break;
//        }
//        return (i == s.length());
//    }
//}

//class Solution {
//    public boolean isSubsequence(String s, String t) {
//        int n = s.length(),m = t.length();
//        int[][] f = new int[m+1][26];
//        for (int i = 0; i < 26; i++) {
//            f[m][i] = m;
//        }
//
//        for (int i = m-1; i >= 0 ; i--) {
//            for (int j = 0; j < 26; j++) {
//                if (t.charAt(i) == j+'a'){
//                    f[i][j] = i;
//                }else {
//                    f[i][j] = f[i+1][j];
//                }
//            }
//        }
//
//        int add = 0;
//        for (int i = 0; i < n; i++) {
//            if (f[add][s.charAt(i) - 'a'] == m){
//                return false;
//            }
//            add = f[add][s.charAt(i) - 'a'] + 1;
//        }
//        return true;
//    }
//}

//class Solution {
//    public boolean divisorGame(int n) {
//        Boolean[] booleans = new Boolean[n+5];
//        booleans[1] = false;
//        booleans[2] = true;
//        for (int i = 3; i <= n; i++) {
//            for (int j = 1; j < i; j++) {
//                if ((i%j) == 0 && !booleans[i-j]){
//                    booleans[i] = true;
//                    break;
//                }
//            }
//        }
//        return booleans[n];
//    }
//}

//class Solution {
//    public int waysToStep(int n) {
//        if (n == 1){
//            return 1;
//        }
//        if (n == 2){
//            return 2;
//        }
//        if (n == 3){
//            return 4;
//        }
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 4;
//        int i = 4;
//        for ( ;i <= n; i++) {
//            dp[i] = ((dp[i-1] + dp[i-2])%1000000007 + dp[i-3]);
//        }
//        return dp[n];
//    }
//}

//class Solution {
//    public int massage(int[] nums) {
//        int n = nums.length;
//        int dp0 = 0 ; int dp1 = nums[0];
//        for (int i = 1; i < n; i++) {
//            int tdp0 = Math.max(dp0,dp1);
//            int tdp1 = dp0 + nums[i];
//
//            dp0 = tdp0;
//            dp1 = tdp1;
//        }
//        return Math.max(dp0,dp1);
//    }
//}

//class Solution {
//    /**
//     * 新建一个公用树
//     */
//    private TreeNode resNode;
//    public TreeNode increasingBST(TreeNode root) {
//        //指向公用树的初始节点
//        TreeNode dummyNode = new TreeNode(-1);
//        resNode = dummyNode;
//        inorder(root);
//        return dummyNode.right;
//    }
//    public void inorder(TreeNode node){
//        if (node == null){
//            return;
//        }
//        inorder(node.left);
//        //在中序遍历过程中改变节点
//        resNode.right = node;
//        node.left = null;
//        resNode = node;
//        inorder(resNode.right);
//    }
//}
//
//class Solution1 {
//    public int sumBase(int n, int k) {
//        double origin = (double) n;
//        List<Integer> a = new ArrayList<>();
//        while (origin > 0){
//            int x = (int)(Math.log(origin) / Math.log(k));
//            // 获取该幂的乘数
//            int m = (int)(origin / Math.pow(k, (double)(x)));
//            a.add(m);
//            // 取余，进行递归运算
//            origin = origin % (m * Math.pow(k, (double)(x)));
//        }
//        StringBuilder c = new StringBuilder();
//        int sum = 0;
//        for (Integer each:a
//        ) {
//          sum+=each;
//        }
//        return sum;
//    }
//}
//
//class Solution2 {
//    public int longestBeautifulSubstring(String word) {
//        if (word.length() <= 1){
//            return 0;
//        }
//        int pre = 1; int maxNum = 1; int num = 1;
//        for (int i = 1; i < word.length(); i++) {
//            if ( word.charAt(i) == word.charAt(i-1)){
//                pre++;
//            }else if (word.charAt(i) > word.charAt(i-1)){
//                pre++;
//                num++;
//                if (num == 5){
//                    int n =i+1;
//                    while ((n<word.length())&&(word.charAt(n) == word.charAt(i))){
//                        n=n+1;
//                        pre++;
//                    }
//                    maxNum = Math.max(pre,maxNum);
//                }
//            }else {
//                pre = 1;
//                num = 1;
//            }
//        }
//        if (maxNum == 1){
//            return 0;
//        }
//        return maxNum;
//    }
//}
//
//class Solution {
//    public int maxFrequency(int[] nums, int k) {
//
//        int[] ints = new int[nums[(nums.length-1)]+1];
//
//        for (int num : nums) {
//            ints[num]++;
//        }
//
//        for (int i = ints.length-1; i >= 0 ; i--) {
//            int cho = k;
//                for (int j = i-1; j >= 0; j--) {
//                        int choose = ints[j];
//                        while (choose != 0) {
//                            int sub = i - j;
//                            if (sub <= cho) {
//                                cho -= sub;
//                                choose--;
//                                ints[i]++;
//                            } else {
//                                break ;
//                            }
//                        }
//            }
//        }
//        int max = 0;
//        for (int anInt : ints) {
//            max = Math.max(max,anInt);
//        }
//        return max;
//    }
//}
//class Solution {
//    static int sum = 0;
//    public int rangeSumBST(TreeNode root, int low, int high) {
//        if (root == null){
//            return  sum;
//        }
//        int val = root.val;
//        if (val >= low && val <= high){
//            sum+=val;
//        }
//        rangeSumBST(root.left,low,high);
//        rangeSumBST(root.right,low,high);
//        return sum;
//    }
//}

//class Duxiaoman2{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int W = in.nextInt();
//        int[] arrW = new int[N];
//        int[] arrT = new int[W];
//
//        for (int i = 0; i < N; i++) {
//            arrW[i] = in.nextInt();
//        }
//        for (int i = 0; i < N; i++) {
//            arrT[i] = in.nextInt();
//        }
//
//        Duxiaoman2 test = new Duxiaoman2();
//        System.out.println(test.mintime(arrW,arrT,W,N));
//    }
//
//    private int mintime(int[] arrW, int[] arrT, int w, int n) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 -o2;
//            }
//        });
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int time = 0;
//        int W = 0;
//        int[] endtime = new int[n];
//        return 0;
//    }
//}


///**
// * 双指针法
// * 如果生成数较大，则大值减小
// * 生成数较小，则小值变大
// */
//class Solution {
//    public boolean judgeSquareSum(int c) {
//        int a = 0;
//        int b = (int) Math.sqrt(c);
//
//        while (a <= b){
//            if ((a * a + b* b) < c){
//                a++;
//            }else if ((a * a + b* b) > c){
//                b--;
//            }else {
//                return true;
//            }
//        }
//        return false;
//    }
//}

///**
// * 双指针排序
// * 先进行排序
// * 固定两个数字
// * 遍历排序其中一个数字（在两个数字之间）
// *每次遇到不同的值，更新结果。
// */
//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        int best = 10000000;
//        for (int i = 0; i < n; i++) {
//            if (i > 0 && nums[i] == nums[i-1]){
//                continue;
//            }
//            int j = i+1; int k = n-1;
//            while (j < k){
//                int sum = nums[i] + nums[j] +nums[k];
//                if (sum == target){
//                    return target;
//                }
//                if (Math.abs(sum-target) < Math.abs(best - target)){
//                    best = sum;
//                }
//                if (sum > target){
//                    int k0 = k-1;
//                    while (j < k0 && nums[k0] == nums[k]){
//                        --k0;
//                    }
//                    k = k0;
//                }else {
//                    int j0 = j+1;
//                    while (j0 < k && nums[j0] == nums[j]){
//                        ++j0;
//                    }
//                    j = j0;
//                }
//            }
//        }
//        return best;
//    }
//}

//class Solution {
//    int[] cnts = new int[10009];
//    public int deleteAndEarn(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        int max = 0;
//        for (int x : nums) {
//            cnts[x]++;
//            max = Math.max(max,x);
//        }
//        // f[i][0] 代表「不选」数值 i；f[i][1] 代表「选择」数值 i
//        int [][]f = new int[max+1][2];
//        for (int i = 1; i <= max ; i++) {
//            f[i][1] = f[i-1][0] + i* cnts[i];
//            f[i][0] = Math.max(f[i-1][1],f[i-1][0]);
//        }
//        return Math.max(f[max][1],f[max][0]);
//    }
//}


//class Solution {
//    public int[] decode(int[] encoded, int first) {
//        int length = encoded.length + 1;
//        int[] ans = new int[length];
//        ans[0] = first;
//        for (int i = 1; i < length ; i++) {
//            ans[i] = ans[i-1] ^ encoded[i-1];
//        }
//        return ans;
//    }
//}

//class Solution {
//    public int minPathSum(int[][] grid) {
//        if(grid == null || grid[0].length == 0 || grid.length == 0){
//            return 0;
//        }
//        int rows = grid.length;
//        int columns = grid[0].length;
//        int [][] dp = new int[rows][columns];
//        dp[0][0] = grid[0][0];
//
//        for (int i = 0; i < rows; i++) {
//            dp[i][0] = dp[i-1][0] + grid[i][0];
//        }
//
//        for (int j = 0; j < columns; j++) {
//            dp[0][j] = dp[0][j-1] + grid[0][j];
//        }
//        for (int i = 1; i < rows; i++) {
//            for (int j = 1; j < columns; j++) {
//                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
//            }
//        }
//        return  dp[rows - 1][columns - 1];
//    }
//}


/**
 * 模拟
 */
//class Solution {
//    public int xorOperation(int n, int start) {
//        int[] ans  = new int[n];
//        ans[0] = start;
//        for (int i = 1; i < n; i++) {
//            ans[i] = start + 2*i;
//        }
//        int sum = ans[0];
//        for (int i = 0; i < n ; i++) {
//            sum = sum ^ ans[i];
//        }
//        return sum;
//    }
//}

//class Solution {
//    boolean[][] f;
//    List<List<String>> ret = new ArrayList<>();
//    List<String> ans = new ArrayList<>();
//    int n;
//    public List<List<String>> partition(String s) {
//        n = s.length();
//        return null;
//    }
//}

//class Solution {
//    public int minDays(int[] bloomDay, int m, int k) {
//        if (m > bloomDay.length / k ){
//            return  -1;
//        }
//
//        int low = Integer.MAX_VALUE, high = 0;
//
//        int length = bloomDay.length;
//
//        for (int i = 0; i < length; i++) {
//            //天数最小值
//            low = Math.min(low,bloomDay[i]);
//            //天数最大值
//            high = Math.max(high,bloomDay[i]);
//        }
//
//        while (low < high){
//            //二分数
//            int days = (high - low) / 2 +low;
//            //检测是否满足条件（满足则高位变mid  ,负责低位变 mid）
//            if (canMake(bloomDay,days,m,k)){
//                high = days;
//            }else {
//                low = days + 1;
//            }
//        }
//        return low;
//    }
//
//    private boolean canMake(int[] bloomDay, int days, int m, int k) {
//        int bouquets = 0;
//        int flowers = 0;
//        int length = bloomDay.length;
//        for (int i = 0; i < length && bouquets < m ; i++) {
//            if (bloomDay[i] <= days){
//                flowers ++;
//                if (flowers == k){
//                    bouquets++;
//                    flowers = 0;
//                }
//            }else {
//                flowers = 0;
//            }
//        }
//        return  bouquets >= m;
//    }
//}


//class Solution {
//    boolean[][] f;
//    List<List<String>> ret = new ArrayList<List<String>>();
//    List<String> ans = new ArrayList<String>();
//    int n;
//    public List<List<String>> partition(String s) {
//        n = s.length();
//        f = new boolean[n][n];
//        for (int i = 0; i < n; i++) {
//            //填充数组
//            Arrays.fill(f[i],true);
//        }
//        for (int i = n-1; i >= 0 ; --i) {
//            for (int j = i+1; j < n; j++) {
//                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i+1][j-1];
//            }
//        }
//        dfs(s,0);
//        return ret;
//    }
//
//    private void dfs(String s, int i) {
//        if (i == n){
//            ret.add(new ArrayList<String>(ans));
//            return;
//        }
//        for (int j = i; j < n; j++) {
//            if (f[i][j]){
//                ans.add(s.substring(i,j+1));
//                dfs(s,j+1);
//                ans.remove(ans.size() - 1);
//            }
//        }
//    }
//
//}


//class Solution {
//    public int[] decode(int[] encoded) {
//        int n = encoded.length + 1;
//        int total = 0;
//        for (int i = 1; i <= n  ; i++) {
//            total ^= i;
//        }
//        int odd = 0;
//        for (int i = 1; i < n - 1; i+=2) {
//            odd ^= encoded[i];
//        }
//        int[] perm = new int[n];
//        perm[0] = total ^ odd;
//        for (int i = 0; i < n-1 ; i++) {
//            perm[i+1] = perm[i] ^ encoded[i];
//        }
//        return perm;
//    }
//}

//class Solution {
//    public int[] xorQueries(int[] arr, int[][] queries) {
//        int n = arr.length;
//        int []xors = new int[n+1];
//        /**
//         * 实现前缀异或
//         */
//        for (int i = 0; i < n; i++) {
//            xors[i+1] = xors[i] ^ arr[i];
//        }
//        int m = queries.length;
//        int []ans = new int[m];
//        /**
//         * 异或两次 则异或相当于没有异或  故实现区间异或
//         */
//        for (int i = 0; i < m; i++) {
//            ans[i] = xors[queries[i][0]] ^ xors[queries[i][1] + 1];
//        }
//        return ans;
//    }
//}


//class Solution {
//    public int countTriplets(int[] arr) {
//        int n = arr.length;
//        int[] s = new int[n + 1];
//        for (int i = 0; i < n ; i++) {
//            s[i+1] = s[i] ^ arr[i];
//        }
//        Map<Integer,Integer> cnt = new HashMap<Integer,Integer>();
//        Map<Integer, Integer> total = new HashMap<>();
//        int ans = 0;
//        for (int k = 0; k < n; k++) {
//            if (cnt.containsKey(s[k+1])){
//                ans += cnt.get(s[k + 1]) * k - total.get(s[k + 1]);
//            }
//            cnt.put(s[k],cnt.getOrDefault(s[k],0) + 1);
//            total.put(s[k],total.getOrDefault(s[k],0) + k);
//        }
//        return ans;
//    }
//}


//class Solution {
//    int res = 0;
//    public int subsetXORSum(int[] nums) {
//        if (nums.length == 1 ) {
//            return nums[0];
//        }
//        dfs(nums,0,0);
//        return  res;
//    }
//
//    private void dfs(int[] nums, int i, int i1) {
//        if (i == nums.length){
//            res+=i1;
//            return;
//        }
//
//        //当前位置要
//        dfs(nums,i+1,i1 ^ nums[i]);
//
//        dfs(nums,i+1,i1);
//    }
//}

//双指针
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int n = nums.length;
//        if (n == 0){
//            return 0;
//        }
//        int fast = 0 , slow = 0;
//        while (fast < n) {
//            if (nums[fast] == nums[slow]){
//                fast++;
//            }else {
//                slow++;
//                nums[slow] = nums[fast];
//                fast++;
//            }
//        }
//        return  slow;
//    }
//}

//买卖股票的最佳时机 II
//class Solution {
//    public int maxProfit(int[] prices) {
//       if (prices == null || prices.length < 2){
//           return 0;
//       }
//       int length = prices.length;
//       int [][]dp = new int[length][2];
//
//       dp[0][1] = -prices[0];
//       dp[0][0] = 0;
//        for (int i = 1; i < length; i++) {
//            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
//            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
//        }
//
//        return dp[length-1][0];
//    }
//}

//旋转数组
//class Solution {
//    public void rotate(int[] nums, int k) {
//        int length = nums.length;
//        k %= length;
//        reverse(nums,0,length-1);
//        reverse(nums,0,k-1);
//        reverse(nums,k,length-1);
//    }
//
//
//    public void reverse(int[] nums , int start ,int end){
//        while (start < end){
//            int temp = nums[end];
//            nums[end] = nums[start];
//            nums[start] = temp;
//            start++;
//            end--;
//        }
//    }
//}
//存在重复数据
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> Integerset = new HashSet<>();
//        for (int num : nums) {
//            Integerset.add(num);
//        }
//        return Integerset.size()!=nums.length;
//    }
//}
//只出现一次的数据
//通过异或处理
//异或的特性
//使用异或运算，将所有值进行异或
//异或运算，相异为真，相同为假，所以 a^a = 0 ;0^a = a
//因为异或运算 满足交换律 a^b^a = a^a^b = b 所以数组经过异或运算，单独的值就剩下了
//
//
//class Solution {
//    public int singleNumber(int[] nums) {
//    int reduce = 0;
//        for (int num : nums) {
//            reduce = reduce ^ num;
//        }
//        return reduce;
//    }
//}
//两个数组的交集 II
//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        Arrays.sort(nums1); Arrays.sort(nums2);
//        int first = 0 ;int second = 0;
//        int length1 = nums1.length;
//        int length2 = nums2.length;
//        if(length1 == 0 || length2 == 0){  //处理边界条件
//            return new int[0];
//        }
//
//        while (first<length1 && second < length2){
//            if (nums1[first] == nums2[second]){
//                integers.add(nums1[first]);
//                first++;
//                second++;
//            }else if (nums1[first] < nums2[second]){
//                first++;
//            }else {
//                second++;
//            }
//        }
//        int []ans = new int[integers.size()];
//        for (int i = 0; i < integers.size(); i++) {
//            ans[i] =  integers.get(i);
//        }
//        return ans;
//    }
//}
//加一
//class Solution {
//    public int[] plusOne(int[] digits) {
//        int end = digits.length - 1;
//        while (digits[end] == 9){
//            digits[end] = 0;
//            if (end == 0){
//                digits=Arrays.copyOf(digits,digits.length+1);
//                for (int i = digits.length-1; i > 0 ; i--) {
//                    digits[i] = digits[i-1];
//                }
//                digits[0] = 1;
//                return digits;
//            }
//            end--;
//        }
//        digits[end]++ ;
//        return digits;
//    }
//}
//移动零
//class Solution {
//    public void moveZeroes(int[] nums) {
//        if (nums == null || nums.length == 0){
//            return;
//        }
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0){
//                nums[index++] = nums[i];
//            }
//        }
//        while (index < nums.length){
//            nums[index++] = 0;
//        }
//    }
//}


//两数之和
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.get(target-nums[i]) != null){
//                return new int[]{map.get(target - nums[i]),i};
//            }
//            map.put(nums[i],i);
//        }
//
//        return new int[]{0,0};
//    }
//}

//有效的数独

//class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        int length = board.length;
//        int[][] line = new int[length][length];
//        int[][] column = new int[length][length];
//        int[][] cell = new int[length][length];
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (board[i][j] == '.'){
//                    continue;
//                }
//                int num = board[i][j] - '0' - 1;
//                int k = i/3*3 + j/3;
//                if (line[i][num] != 0 || column[j][num] != 0 || cell[k][num] != 0){
//                    return false;
//                }
//                line[i][num] = column[j][num] = cell[k][num] = 1;
//            }
//        }
//        return true;
//    }
//}

//旋转图像
//class Solution {
//    public void rotate(int[][] matrix) {
//        int length = matrix.length;
//        //上下交换
//        for (int i = 0; i < length/2; i++) {
//            int []temp = matrix[i];
//            matrix[i] = matrix[length - 1 - i];
//            matrix[length - i- 1] = temp;
//        }
//
//        //对角线交换
//        for (int i = 0; i < length; i++) {
//            for (int j = i+1; j < length; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] =   matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//    }
//}

//class Solution {
//    public void reverseString(char[] s) {
//        int length = s.length;
//        char temp;
//        for (int i = 0; i < length/2; i++) {
//            temp = s[i];
//            s[i] = s[length-1-i];
//            s[length-1-i] = temp;
//        }
//    }
//}


//class Solution {
//    public int reverse(int x) {
//        int res = 0;
//        while (x != 0){
//            int t = x%10;
//            int newRes = res*10 + t;
//            if ((newRes - t) /10 != res){
//                return 0;
//            }
//            res =newRes;
//            x = x/10;
//        }
//        return res;
//    }
//}

//class Solution {
//    public int firstUniqChar(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        char[] chars = s.toCharArray();
//        for (char ch : chars) {
//            map.put(ch,map.getOrDefault(ch,0) + 1);
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(chars[i]) == 1){
//                return i;
//            }
//        }
//        return  -1;
//    }
//}

//是否是异位词语
//class Solution {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()){
//            return false;
//        }
//        int []letterCount = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            letterCount[s.charAt(i) - 'a'] ++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            letterCount[t.charAt(i) - 'a']--;
//        }
//        for (int i : letterCount) {
//            if (i != 0){
//                return false;
//            }
//        }
//
//        return true;
//    }
//}

//判断回文字符串
//class Solution {
//    public boolean isPalindrome(String s) {
//        if (s.length() == 0){
//            return true;
//        }
//        int left = 0 ; int right = s.length()-1;
//        //Java Character isLetterOrDigit()方法
//        //
//        //java.lang.Character.isLetterOrDigit(int codePoint) 确定指定字符(Unicode代码点)是一个字母或数字。
//        //
//        //字符被确定是字母或数字，如果不是isLetter(codePoint) 也不是 isDigit(codePoint) 的字符，则返回true。
//        while (left < right){
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
//                left++;
//            };
//            while (right > left && !Character.isLetterOrDigit(s.charAt(right))){
//                right--;
//            };
////            Character.toLowerCase()字符串变为小写字母
//            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}


//class Solution {
//    public int myAtoi(String s) {
//        char[] chars = s.toCharArray();
//        int length = chars.length;
//        int index = 0;
//        while (index < length && chars[index] == ' '){
//            index++;
//        }
//        if (index >= length){
//            return 0;
//        }
//        int sign  = 1;
//        if (chars[index] == '-' || chars[index] == '+'){
//            if (chars[index] == '-'){
//                sign = -1;
//            }
//            index++;
//        }
//        int result = 0;
//        int temp = 0;
//        while (index < length){
//            int num = chars[index] - '0';
//            if (num > 9 || num < 0){
//                break;
//            }
//            temp = result;
//            result = result*10 + num;
//            if (result/10 != temp){
//                if(sign > 0){
//                    return Integer.MAX_VALUE;
//                }else {
//                    return Integer.MIN_VALUE;
//                }
//            }
//            index++;
//        }
//        return result * sign;
//    }
//}

//class Solution {
//    public int strStr(String haystack, String needle) {
//        if (needle.length() == 0){
//            return 0;
//        }
//        int i = 0;
//        int j = 0;
//        int[] next = new int[needle.length()];
//        getNext(needle,next);
//        while (i < haystack.length() && j < needle.length()){
//            if (j == -1 || haystack.charAt(i) == needle.charAt(i)){
//                i++;
//                j++;
//            }else {
//                j = next[j];
//            }
//            if (j == needle.length()){
//                return i-j;
//            }
//        }
//        return -1;
//    }
//    private void getNext(String p , int[] next){
//        int len = p.length();
//        int i = 0;
//        int j = -1;
//        next[0] = -1;
//        while (i<len-1){
//            if (j == -1 || p.charAt(i) == p.charAt(j)){
//                i++;
//                j++;
//                next[i] = j;
//            }else {
//                j = next[j];
//            }
//        }
//    }
//}
//外观数列
//class Solution {
//    public String countAndSay(int n) {
//        if (n == 1){
//            return "1";
//        }
//        String s1 = countAndSay(n-1);
//        StringBuilder result = new StringBuilder();
//        char local = s1.charAt(0);
//        int count = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) == local){
//                count++;
//            }else {
//                result.append(count);
//                result.append(local);
//                count = 1;
//                local = s1.charAt(i);
//            }
//        }
//        result.append(count);
//        result.append(local);
//        return result.toString();
//    }
//}

//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0){
//            return "";
//        }
//        String pre = strs[0];
//        int i = 1 ;
//        while ( i < strs.length){
//            while (strs[i].indexOf(pre) != 0){
//                pre = pre.substring(0,pre.length()-1);
//            }
//            i++;
//        }
//        return pre;
//    }
//}


//class Solution {
//    public void deleteNode(ListNode node) {
//        node.val = node.next.val;
//        node.next = node.next.next;
//    }
//}

//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode fast = head;
//        ListNode slow = head;
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//        if (fast == null){
//            return head.next;
//        }
//        while (fast.next != null){
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//        return head;
//    }
//}

//class Solution {
//    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> listNodes = new Stack<>();
//        while (head != null){
//            listNodes.push(head);
//            head = head.next;
//        }
//        if (listNodes.isEmpty()){
//            return null;
//        }
//        ListNode node = listNodes.pop();
//        head = node;
//        while (!listNodes.isEmpty()){
//            ListNode pop = listNodes.pop();
//            node.next = pop;
//            node = node.next;
//        }
//        node.next = null;
//        return head;
//    }
//}

//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode newHead = null;
//        while (head != null){
//            ListNode temp = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = temp;
//        }
//        return newHead;
//    }
//}


//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null){
//            return l2;
//        }
//        if (l2 == null){
//            return l1;
//        }
//        ListNode dummy = new ListNode(0);
//        ListNode curr = dummy;
//
//        while (l1!= null && l2!=null){
//            if (l1.val <= l2.val){
//                curr.next = l1;
//                l1 = l1.next;
//            }else {
//                curr.next = l2;
//                l2 = l2.next;
//            }
//            curr = curr.next;
//        }
//        curr.next = l1 == null?l2:l1;
//        return dummy.next;
//    }
//}

//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        ListNode fast = head,slow = head;
//        while (fast != null && fast.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        if (fast != null){
//            slow = slow.next;
//        }
//        ListNode reverse = reverse(slow);
//        fast = head;
//        while (reverse != null){
//            if (fast.val != reverse.val){
//                return false;
//            }
//            fast = fast.next;
//            reverse = reverse.next;
//        }
//        return true;
//    }
//
//    private ListNode reverse(ListNode slow) {
//        ListNode prev = null;
//        while (slow != null){
//            ListNode next = slow.next;
//            slow.next = prev;
//            prev = slow;
//            slow = next;
//        }
//        return prev;
//    }
//}
//

//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        if (head == null){
//            return false;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if (fast == slow){
//                return true;
//            }
//        }
//        return false;
//    }
//}


//class Solution {
//    public int maxDepth(TreeNode root) {
//        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
//    }
//}


//class Solution {
//    TreeNode prev;
//    public boolean isValidBST(TreeNode root) {
//        if (root == null){
//            return true;
//        }
//        if (!isValidBST(root.left)){
//            return false;
//        }
//        if (prev!=null && prev.val >= root.val){
//            return false;
//        }
//        prev = root;
//        if (!isValidBST(root.right)){
//            return false;
//        }
//        return true;
//    }
//}


//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null){
//            return true;
//        }
//        return  isSymmetricHelper(root.left,root.right);
//    }
//    private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
//        if (left == null && right == null){
//            return true;
//        }
//        if (left == null || right == null || left.val != right.val){
//            return false;
//        }
//        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
//    }
//}


//class Solution {
//    public int longestConsecutive(int[] nums) {
//        Set<Integer> set = new HashSet();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int maxSize = 0;
//        for (Integer integer : nums) {
//            if (set.remove(integer)){
//                int size = 1;
//                int current = integer;
//                while (set.remove(current - 1)){
//                    current--;
//                    size+=1;
//                }
//                int current2 = integer;
//                while (set.remove(current2 + 1)){
//                    current2++;
//                    size+=1;
//                }
//                maxSize = Math.max(maxSize,size);
//            }
//
//        }
//        return maxSize;
//    }
//}
//
//class Solution {
//    public int singleNumber(int[] nums) {
//        int num1 = 1;
//        for (int num : nums) {
//            num1 = num1^num;
//        }
//        return num1;
//    }
//}

//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        int n = s.length();
//        boolean[] memo = new boolean[n+1];
//        memo[0] = true;
//        for (int i = 0; i <= s.length(); i++) {
//            for (int j = 0; j < i; j++) {
//                if (memo[j]  && wordDict.contains(s.substring(j,i))){
//                    memo[i] = true;
//                    break;
//                }
//            }
//        }
//        return memo[n];
//    }
//}

//class Solution {
//    public int maxProduct(int[] nums) {
//        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0 ){
//                int temp  = imax;
//                imax = imin;
//                imin = temp;
//            }
//            imax = Math.max(imax * nums[i],nums[i]);
//            imin = Math.min(imin * nums[i],nums[i]);
//            max = Math.max(max,imax);
//        }
//        return imax;
//    }
//}

//class MinStack {
//
//    private final int INIT_SIZE = 100;
//    private int[]  elements  ;
//    private int size  = 0;
//
//    private int min;
//
//    public MinStack() {
//        elements = new int[INIT_SIZE];
//        min = Integer.MAX_VALUE;
//    }
//
//    public void push(int val) {
//        ensureCapacity();
//        if (val <= min) {
//            elements[size++] = min;
//           min = val;
//        }
//        elements[size++] = val;
//    }
//
//    public void pop() {
//        if (elements[--size] == min){
//            min = elements[--size];
//        }
//    }
//
//    public int top() {
//        return elements[size - 1];
//    }
//
//    public int getMin() {
//        return min;
//    }
//
//    private void ensureCapacity(){
//        if (size >= elements.length - 1){
//            elements = Arrays.copyOf(elements, size * 2);
//        }
//    }
//}

/**
 * 方法二：双指针
 *
 * 思路和算法
 *
 * 使用双指针的方法，可以将空间复杂度降至 O(1)O(1)O(1)。
 *
 * 只有当链表 headA\textit{headA}headA 和 headB\textit{headB}headB 都不为空时，两个链表才可能相交。因此首先判断链表 headA\textit{headA}headA 和 headB\textit{headB}headB 是否为空，如果其中至少有一个链表为空，则两个链表一定不相交，返回 null\text{null}null。
 *
 * 当链表 headA\textit{headA}headA 和 headB\textit{headB}headB 都不为空时，创建两个指针 pA\textit{pA}pA 和 pB\textit{pB}pB，初始时分别指向两个链表的头节点 headA\textit{headA}headA 和 headB\textit{headB}headB，然后将两个指针依次遍历两个链表的每个节点。具体做法如下：
 *
 *     每步操作需要同时更新指针 pA\textit{pA}pA 和 pB\textit{pB}pB。
 *
 *     如果指针 pA\textit{pA}pA 不为空，则将指针 pA\textit{pA}pA 移到下一个节点；如果指针 pB\textit{pB}pB 不为空，则将指针 pB\textit{pB}pB 移到下一个节点。
 *
 *     如果指针 pA\textit{pA}pA 为空，则将指针 pA\textit{pA}pA 移到链表 headB\textit{headB}headB 的头节点；如果指针 pB\textit{pB}pB 为空，则将指针 pB\textit{pB}pB 移到链表 headA\textit{headA}headA 的头节点。
 *
 *     当指针 pA\textit{pA}pA 和 pB\textit{pB}pB 指向同一个节点或者都为空时，返回它们指向的节点或者 null\text{null}null。
 *
 * 证明
 *
 * 下面提供双指针方法的正确性证明。考虑两种情况，第一种情况是两个链表相交，第二种情况是两个链表不相交。
 *
 * 情况一：两个链表相交
 *
 * 链表 headA\textit{headA}headA 和 headB\textit{headB}headB 的长度分别是 mmm 和 nnn。假设链表 headA\textit{headA}headA 的不相交部分有 aaa 个节点，链表 headB\textit{headB}headB 的不相交部分有 bbb 个节点，两个链表相交的部分有 ccc 个节点，则有 a+c=ma+c=ma+c=m，b+c=nb+c=nb+c=n。
 *
 *     如果 a=ba=ba=b，则两个指针会同时到达两个链表相交的节点，此时返回相交的节点；
 *
 *     如果 a≠ba \ne ba​=b，则指针 pA\textit{pA}pA 会遍历完链表 headA\textit{headA}headA，指针 pB\textit{pB}pB 会遍历完链表 headB\textit{headB}headB，两个指针不会同时到达链表的尾节点，然后指针 pA\textit{pA}pA 移到链表 headB\textit{headB}headB 的头节点，指针 pB\textit{pB}pB 移到链表 headA\textit{headA}headA 的头节点，然后两个指针继续移动，在指针 pA\textit{pA}pA 移动了 a+c+ba+c+ba+c+b 次、指针 pB\textit{pB}pB 移动了 b+c+ab+c+ab+c+a 次之后，两个指针会同时到达两个链表相交的节点，该节点也是两个指针第一次同时指向的节点，此时返回相交的节点。
 *
 * 情况二：两个链表不相交
 *
 * 链表 headA\textit{headA}headA 和 headB\textit{headB}headB 的长度分别是 mmm 和 nnn。考虑当 m=nm=nm=n 和 m≠nm \ne nm​=n 时，两个指针分别会如何移动：
 *
 *     如果 m=nm=nm=n，则两个指针会同时到达两个链表的尾节点，然后同时变成空值 null\text{null}null，此时返回 null\text{null}null；
 *
 *     如果 m≠nm \ne nm​=n，则由于两个链表没有公共节点，两个指针也不会同时到达两个链表的尾节点，因此两个指针都会遍历完两个链表，在指针 pA\textit{pA}pA 移动了 m+nm+nm+n 次、指针 pB\textit{pB}pB 移动了 n+mn+mn+m 次之后，两个指针会同时变成空值 null\text{null}null，此时返回 null\text{null}null。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/xiang-jiao-lian-biao-by-leetcode-solutio-a8jn/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
//class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null ){
//            return null;
//        }
//        ListNode pA = headA, pB = headB;
//        while (pA != pB){
//            pA = pA == null ? headB:pA.next;
//            pB = pB == null ? headA:pB.next;
//        }
//        return pA;
//    }
//}
//class Solution {
//    public int majorityElement(int[] nums) {
//        int count = 1;
//        int wang = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (wang == nums[i]){
//                count++;
//            }else {
//                count--;
//                if (count == 0){
//                    wang = nums[i+1];
//                }
//            }
//        }
//        return wang;
//    }
//}

//class Solution {
//    public int numIslands(char[][] grid) {
//        int islandomNum = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == '1'){
//                    infect(grid,i,j);
//                    islandomNum++;
//                }
//            }
//        }
//        return islandomNum;
//    }
//
//    private void infect(char[][] grid, int i, int j) {
//        if (i < 0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] != '1'){
//            return;
//        }
//        grid[i][j] = '2';
//        infect(grid,i+1,j);
//        infect(grid, i-1, j);
//        infect(grid, i, j+1);
//        infect(grid, i, j-1);
//    }
//}

//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null){
//            ListNode nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }
//        return prev;
//    }
//}

//class Solution {
//    List<List<Integer>> edges;
//    int[] visited;
//    boolean valid = true;
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        edges = new ArrayList<List<Integer>>();
//        for (int i = 0; i < numCourses; i++) {
//            edges.add(new ArrayList<Integer>());
//        }
//        visited = new int[numCourses];
//        for (int[] prerequisite : prerequisites) {
//            edges.get(prerequisite[1]).add(prerequisite[0]);
//        }
//        for (int i = 0; i < numCourses && valid; i++) {
//            if (visited[i] == 0){
//                dfs(i);
//            }
//        }
//        return valid;
//    }
//
//    private void dfs(int u) {
//        visited[u] = 1;
//        for (int v: edges.get(u)) {
//            if (visited[v] == 0){
//                dfs(v);
//                if (! valid){
//                    return;
//                }
//            }else if (visited[v] == 1){
//                valid = false;
//                return;
//            }
//        }
//        visited[u] = 2;
//    }
//}

//class Trie {
//
//    private Trie[] children;
//    private boolean isEnd;
//
//    /** Initialize your data structure here. */
//    public Trie() {
//        children = new Trie[26];
//        isEnd = false;
//    }
//
//    /** Inserts a word into the trie. */
//    public void insert(String word) {
//        Trie node = this;
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            int index  = ch - 'a';
//            if (node.children[index] == null){
//                node.children[index] = new Trie();
//            }
//            node = node.children[index];
//        }
//        node.isEnd = true;
//    }
//
//    /** Returns if the word is in the trie. */
//    public boolean search(String word) {
//        Trie node = searchPrefix(word);
//        return node != null && node.isEnd;
//    }
//
//    private Trie searchPrefix(String word) {
//        Trie node = this;
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            int index = ch - 'a';
//            if (node.children[index] == null){
//                return null;
//            }
//            node = node.children[index];
//        }
//        return node;
//    }
//
//    /** Returns if there is any word in the trie that starts with the given prefix. */
//    public boolean startsWith(String prefix) {
//        return searchPrefix(prefix) != null;
//    }
//}
//
///**
// * Your Trie object will be instantiated and called as such:
// * Trie obj = new Trie();
// * obj.insert(word);
// * boolean param_2 = obj.search(word);
// * boolean param_3 = obj.startsWith(prefix);
// */

//class Solution {
//    Map<Integer,TreeNode> parent = new HashMap<Integer, TreeNode>();
//    Set<Integer> visited = new HashSet<>();
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        dfs(root);
//        while ( p != null){
//            visited.add(p.val);
//            p = parent.get(p.val);
//        }
//        while ( q != null ){
//            if (visited.contains(q.val)){
//                return q;
//            }
//            q = parent.get(q.val);
//        }
//        return  null;
//    }
//
//    private void dfs(TreeNode root) {
//        if (root.left != null){
//            parent.put(root.left.val,root);
//            dfs(root.left);
//        }
//        if (root.right != null){
//            parent.put(root.right.val,root);
//            dfs(root.right);
//        }
//    }
//}

//class Solution {
//    public int[][] merge(int[][] intervals) {
//        if (intervals.length == 0){
//            return new int[0][2];
//        }
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//
//        ArrayList<int[]> merged = new ArrayList<>();
//        for (int i = 0; i < intervals.length; i++) {
//            int L = intervals[i][0] , R = intervals[i][1];
//            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L){
//                merged.add(new int[]{L,R});
//            }else {
//                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1],R);
//            }
//        }
//        return merged.toArray(new int[merged.size()][]);
//    }
//}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
//    public void flatten(TreeNode root) {
//        ArrayList<TreeNode> treeNodes = new ArrayList<>();
//        preorderTraversal(root,treeNodes);
//        int size = treeNodes.size();
//        for (int i = 1; i < size; i++) {
//            TreeNode prev = treeNodes.get(i - 1),curr = treeNodes.get(i);
//            prev.left = null;
//            prev.right = curr;
//        }
//    }
//
//    private void preorderTraversal(TreeNode root, ArrayList<TreeNode> treeNodes) {
//        if (root != null){
//            treeNodes.add(root);
//            preorderTraversal(root.left,treeNodes);
//            preorderTraversal(root.right, treeNodes);
//        }
//    }
//}


//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if(matrix == null || matrix.length == 0) {
//            return false;
//        }
//        int  m = 0;
//        int n = matrix[0].length - 1;
//        while (m < matrix.length && n >= 0){
//            if (matrix[m][n] == target){
//                return true;
//            }else if (matrix[m][n] > target){
//                n--;
//            }else {
//                m++;
//            }
//        }
//        return false;
//    }
//}

//class Solution {
//    public int numSquares(int n) {
//        int[] f = new int[n + 1];
//        for (int i = 1; i <= n ; i++) {
//            int minn = Integer.MAX_VALUE;
//            for (int j = 1; j*j <= i; j++) {
//                minn = Math.min(minn,f[i - j * j]);
//            }
//            f[i] = minn + 1;
//        }
//        return f[n];
//    }
//}

//class Solution {
//    public int lengthOfLIS(int[] nums) {
//        if (nums.length == 0){
//            return 0;
//        }
//        int[] dp = new int[nums.length];
//        dp[0] = 1;
//        int maxans = 1;
//        for (int i = 1; i < nums.length ; i++) {
//            dp[i] = 1;
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]){
//                    dp[i] = Math.max(dp[i],dp[j]+1);
//                }
//            }
//            maxans = Math.max(maxans,dp[i]);
//        }
//        return maxans;
//    }
//}

//class Solution {
//    public int coinChange(int[] coins, int amount) {
//        if (amount == 0){
//            return 0;
//        }
//
//        int max = amount + 1;
//        int dp[] = new int[amount + 1];
//        Arrays.fill(dp,max);
//        dp[0] = 0;
//
//        for (int i = 1; i <= amount ; i++) {
//            for (int j = 0; j < coins.length; j++) {
//                if (coins[j] <= i){
//                    dp[i] = Math.min(dp[i],dp[i - coins[j]] + 1);
//                }
//            }
//        }
//        return dp[amount] > amount ?-1:dp[amount];
//    }
//}


//class Solution {
//    int ptr;
//    public String decodeString(String s) {
//        LinkedList<String> stk = new LinkedList<>();
//        ptr = 0;
//        while(ptr < s.length()){
//            char cur = s.charAt(ptr);
//            if (Character.isDefined(cur)){
//                String digits = getDigits(s);
//                stk.addLast(digits);
//            }else if (Character.isLetter(cur) || cur == '['){
//                stk.addLast(String.valueOf(s.charAt(ptr++)));
//            }else {
//                ++ptr;
//                LinkedList<String> sub = new LinkedList<>();
//                while (!"[".equals(stk.peekLast())) {
//                    sub.addLast(stk.removeLast());
//                }
//                Collections.reverse(sub);
//                stk.removeLast();
//                int repTime = Integer.parseInt(stk.removeLast());
//                StringBuffer t = new StringBuffer();
//                String o = getString(sub);
//                while (repTime-- > 0){
//                    t.append(o);
//                }
//                stk.addLast(t.toString());
//            }
//        }
//        return getString(stk);
//    }
//
//    private String getString(LinkedList<String> sub) {
//        StringBuffer ret = new StringBuffer();
//        for (String s : sub) {
//            ret.append(s);
//        }
//        return ret.toString();
//    }
//
//    private String getDigits(String s) {
//        StringBuffer ret = new StringBuffer();
//        while (Character.isDigit(s.charAt(ptr))){
//            ret.append(s.charAt(ptr++));
//        }
//        return ret.toString();
//    }
//}


//class Solution {
//    public int pathSum(TreeNode root, int targetSum) {
//        if (root == null){
//            return 0;
//        }
//        int ret = rootSum(root,targetSum);
//        ret += pathSum(root.left,targetSum);
//        ret += pathSum(root.right,targetSum);
//        return ret;
//    }
//
//    private int rootSum(TreeNode root, int targetSum) {
//        int ret = 0;
//        if (root == null){
//            return 0;
//        }
//
//        int val = root.val;
//        if (val == targetSum){
//            ret++;
//        }
//        ret += rootSum(root.left,targetSum - val);
//        ret += rootSum(root.right,targetSum - val);
//        return ret;
//    }
//}

//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        int n = s.length(), m = p.length();
//        List<Integer> res = new ArrayList<>();
//        if ( n < m ){
//            return res;
//        }
//        int[] pCnt = new int[26];
//        int[] sCnt = new int[26];
//
//        for (int i = 0; i < m ; i++) {
//            pCnt[p.charAt(i) - 'a']++;
//            sCnt[s.charAt(i) - 'a']++;
//        }
//
//        if (Arrays.equals(sCnt,pCnt)){
//            res.add(0);
//        }
//        for (int i = m; i < n; i++) {
//            sCnt[s.charAt(i - m) - 'a'] --;
//            sCnt[s.charAt(i) - 'a']++;
//            if (Arrays.equals(sCnt,pCnt)){
//                res.add(i - m + 1);
//            }
//        }
//        return res;
//    }
//}

//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        int n = nums.length;
//        for (int num : nums) {
//            int x = (num - 1) % n;
//            nums[x] += n;
//        }
//        ArrayList<Integer> ret = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (nums[i] <= n){
//                ret.add(i+1);
//            }
//        }
//        return ret;
//    }
//}

//class Solution {
//    public int hammingDistance(int x, int y) {
//        int s = x^y,ret = 0;
//        while (s != 0){
//            ret += s & 1;
//            s >>= 1;
//        }
//        return ret;
//    }
//}


//
//class Solution {
//    public int maxDistance(int[] colors) {
//        HashMap<Integer,Integer> minMap = new HashMap<Integer,Integer>();
//        HashMap<Integer,Integer> maxMap = new HashMap<Integer,Integer>();
//        for (int i = 0; i < colors.length; i++) {
//            if (!minMap.containsKey(colors[i])){
//                minMap.put(colors[i],i);
//            }
//        }
//        for (int i = colors.length - 1; i > 0 ; i--) {
//            if (!maxMap.containsKey(colors[i])){
//                maxMap.put(colors[i],i);
//            }
//        }
//        int max = 0;
//        for (int k: minMap.keySet()) {
//            for (int n : maxMap.keySet()) {
//                if (k!=n){
//                    max = Math.max(max,Math.abs(maxMap.get(n) - minMap.get(k)) );
//                }
//            }
//        }
//        return max;
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        int[] a = new int[]{2,2,3,3};
//        int cap = 5;
//        Solution solution = new Solution();
//        solution.wateringPlants(a,cap);
//    }
//    public int wateringPlants(int[] plants, int capacity) {
//        int shengyu = capacity, bushu = 0;
//        for (int i = 0; i < plants.length; i++) {
//            if (shengyu < plants[i]){
//                shengyu = capacity;
//                bushu += i*2;
//            }
//            shengyu = shengyu - plants[i];
//            bushu += 1;
//        }
//        return bushu;
//    }
//}

//class RangeFreqQuery {
//    int[]arr ;
//    HashMap<Integer,TreeMap<Integer,Integer>> m = new HashMap<>();
//    public RangeFreqQuery(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (m.containsKey(arr[i])){
//                TreeMap<Integer,Integer> t = m.get(arr[i]);
//                t.put(i,t.get(t.lowerKey(i)) + 1);
//            }else {
//                m.put(arr[i],new TreeMap<>());
//                m.get(arr[i]).put(i,1);
//            }
//        }
//    }
//    public int query(int left, int right, int value) {
//        if(m.containsKey(value)){
//            TreeMap<Integer, Integer> t = m.get(value);
//            Integer r = t.floorKey(right);
//            Integer l = t.lowerKey(left);
//            if(r == null) {
//                return 0;
//            }
//            if(l == null) {
//                return t.get(r);
//            }
//            return t.get(r) - t.get(l);
//        }
//        return 0;
//    }
//}



/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */


//class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        solution.kMirror(3,7);
//    }
//    public long kMirror(int k, int n) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        int count = 0; int  i = 1;
//        while (count <  n){
//            String aSwitch = Switch(k, i);
//            boolean string = isString(aSwitch);
//            boolean string2 = isString(String.valueOf(i));
//            if (string && string2){
//                count++;
//                integers.add(i);
//                i++;
//            }else {
//                i++;
//            }
//        }
//        int sum = 0;
//        for (Integer integer : integers) {
//            sum+=integer;
//        }
//        return sum;
//    }
//
//    public static boolean isString(String aSwitch){
//        int left = 0 ; int right = aSwitch.length() - 1;
//        while (left < right){
//
//
//            if (aSwitch.charAt(left) != aSwitch.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//    public static String Switch(int n,int num) {
//        // n 表示目标进制, num 要转换的值
//        String str= "";
//        int yushu ;      // 保存余数
//        int shang = num;      // 保存商
//        while (shang>0) {
//            yushu = shang %n;
//            shang = shang/n;
//
//            // 10-15 -> a-f
//            if(yushu>9) {
//                str =(char)('a'+(yushu-10)) + str;
//            }else {
//                str = yushu+str;
//            }
//        }
//
//        return str;
//    }
//}


//class Solution {
//    int ans ;
//    public int diameterOfBinaryTree(TreeNode root) {
//        ans = 1;
//        depth(root);
//        return ans - 1;
//    }
//
//    private int depth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//        int L = depth(root.left);
//        int R = depth(root.right);
//        ans  = Math.max(ans,L+R+1);
//        return Math.max(L,R) + 1;
//    }
//}

//class Solution {
//    public int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for (int start = 0; start < nums.length; start++) {
//            int sum = 0;
//            for (int end = start; end >= 0  ; -- end) {
//                sum += nums[end];
//                if (sum == k){
//                    count++;
//                    break;
//                }
//                if (sum > k){
//                    break;
//                }
//            }
//        }
//        return count;
//    }
//}

//class Solution {
//    public int findUnsortedSubarray(int[] nums) {
//        int n = nums.length;
//        int maxn = Integer.MIN_VALUE , right = -1;
//        int minn = Integer.MAX_VALUE , left = -1;
//        for (int i = 0; i < n; i++) {
//            if (maxn > nums[i]){
//                right = i;
//            }else {
//                maxn = nums[i];
//            }
//            if (minn < nums[n - i - 1]){
//                left = n - i - 1;
//            }else {
//                minn = nums[n - i - 1];
//            }
//        }
//        return right == -1 ? 0 : right - left + 1;
//    }
//}

//class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int length = temperatures.length;
//        int[] ans = new int[length];
//        Deque<Integer> stack = new LinkedList<Integer>();
//        for (int i = 0; i < length; i++) {
//            int temperature = temperatures[i];
//            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
//                int prevIndex = stack.pop();
//                ans[prevIndex] = i - prevIndex;
//            }
//            stack.push(i);
//        }
//        return ans;
//    }
//}

//class Solution {
//    public int myAtoi(String s) {
//        Automaton automaton = new Automaton();
//        int length = s.length();
//        for (int i = 0; i < length; i++) {
//            automaton.get(s.charAt(i));
//        }
//        return (int) (automaton.sign * automaton.ans);
//    }
//}
//class Automaton{
//    int sign = 1;
//    long ans = 0;
//    private String state = "start";
//
//    private Map<String,String[]> table = new HashMap<String,String[]>(){{
//        put("start",new String[] {"start","signed","in_number","end"});
//        put("signed",new String[] {"end","end","in_number","end"});
//        put("in_number",new String[] {"end","end","in_number","end"});
//        put("end",new String[] {"end","end","end","end"});
//    }};
//
//    void get(char c){
//        state  = table.get(state)[getCol(c)];
//        if ("in_number".equals(state)){
//            ans = ans * 10 + c -'0';
//            ans = sign == 1?Math.min(ans,(long) Integer.MAX_VALUE) :Math.min(ans, -(long) Integer.MIN_VALUE);
//        }else if ("signed".equals(state)){
//            sign = c == '+' ? 1: -1;
//        }
//    }
//
//    private int getCol(char c) {
//        if (c == ' '){
//            return 0;
//        }
//        if (c == '+' || c == '-'){
//            return 1;
//        }
//        if (Character.isDigit(c)){
//            return 2;
//        }
//        return 3;
//    }
//}

//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int leftIdx = binarySearch(nums,target,true);
//        int rightIdx = binarySearch(nums,target,false) - 1;
//        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target
//                && nums[rightIdx] == target){
//            return new int[] {leftIdx,rightIdx};
//        }
//        return new int[]{-1,-1};
//    }
//
//    private int binarySearch(int[] nums, int target, boolean lower){
//        int left = 0 , right = nums.length - 1,ans = nums.length;
//        while (left  <=  right){
//            int mid = (left + right) / 2;
//            if (nums[mid] > target || (lower && nums[mid] >= target )){
//                right = mid - 1;
//                ans = mid;
//            }else {
//                left = mid+1;
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public int search(int[] nums, int target) {
//        int n = nums.length;
//        if (n == 0) {
//            return -1;
//        }
//        if (n == 1) {
//            return nums[0] == target ? 0 : -1;
//        }
//        int l = 0 ,r = n-1;
//        while (l <= r){
//            int mid = (l+r)/2;
//            if (nums[mid] == target){
//                return mid;
//            }
//            if (nums[0] <= nums[mid]){
//                if (nums[0] <= target && target < nums[mid]){
//                    r = mid - 1;
//                }else {
//                    l = mid + 1;
//                }
//            }else {
//                if (nums[mid] < target && target <= nums[n - 1] ){
//                    l = mid + 1;
//                }else {
//                    r = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
//}

//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int columns = matrix.length - 1, rows = 0;
//        while (columns >= 0 && rows < matrix[0].length) {
//            int num = matrix[columns][rows];
//            if (num == target) {
//                return true;
//            } else if (num > target) {
//               columns--;
//            } else {
//                rows++;
//            }
//        }
//        return false;
//    }
//}

//class Solution {
//    public List<Integer> targetIndices(int[] nums, int target) {
//        Arrays.sort(nums);
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (target == nums[i]){
//                list.add(i);
//            }
//        }
//        return list;
//    }
//}



//class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] a = new int[]{7,4,3,9,1,8,5,2,6};
//        int[] averages = solution.getAverages(a, 3);
//        for (int average : averages) {
//            System.out.print(average);
//        }
//    }
//    public int[] getAverages(int[] nums, int k) {
//         int index = 0;
//        int[] ints = new int[nums.length];
//        long  sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if ((i - k) < 0 || ( i + k ) > nums.length-1){
//                ints[index] = -1;
//                index+=1;
//                continue;
//            }
//           if (sum == 0){
//               for (int j = i-k; j <= i+k; j++) {
//                   sum += nums[j];
//               }
//           }else {
//               sum =  sum - nums[i-k-1] + nums[i+k];
//           }
//            ints[index] = (int) (sum / (k*2+1));
//            index++;
//        }
//        return ints;
//    }
//}




//class Solution {
//    public static void main(String[] args) {
//                Solution solution = new Solution();
//        int[] a = new int[]{2,10,7,5,4,1,8,6};
//        solution.minimumDeletions(a);
//
//    }
//    public int minimumDeletions(int[] nums) {
//
//        if (nums.length == 1){
//            return 1;
//        }
//        int minInt = Integer.MIN_VALUE; int m = 0;  //m 最大值
//        int maxInt = Integer.MAX_VALUE; int n = 0;  // n 最小值
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > minInt){
//                minInt = nums[i];
//                m = i;
//            }
//            if (nums[i] < maxInt){
//                maxInt = nums[i];
//                n = i;
//            }
//        }
//        int left = 0, right=  0;
//        if  (m > n){
//            right = m;
//            left = n;
//        }else {
//            right = n;
//            left = m;
//        }
//        int r = right +1;
//        int l = nums.length - left;
//        int o = left+1 + (nums.length  - right);
//        int[] ints = new int[3];
//        ints[0] = r;  ints[1] = l;  ints[2] = o;  int mina = Integer.MAX_VALUE;
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] < mina){
//                mina = ints[i];
//            }
//        }
//        return mina ;
//    }
//}


//class Solution {
//    public int findMin(int[] nums) {
//        int low = 0;
//        int high = nums.length -1;
//        while (low < high){
//            int pivot = low + (high - low) / 2;
//            if (nums[pivot] < nums[high]){
//                high = pivot;
//            }else {
//                low = pivot + 1;
//            }
//        }
//        return nums[low];
//    }
//}


//class Solution {
//    public int findPeakElement(int[] nums) {
//        int n = nums.length;
//        int left = 0 , right =  n - 1  ,ans = -1;
//        while (left <= right){
//            int mid = (left + right ) /2;
//            if (compare(nums,mid -1 ,mid) < 0 && compare(nums,mid,mid + 1) > 0){
//                ans = mid;
//                break;
//            }
//            if (compare(nums,mid,mid+1) < 0){
//                left = mid + 1;
//            }else {
//                right = mid -1;
//            }
//        }
//        return ans;
//    }
//
//    private int compare(int[] nums, int i, int mid) {
//        int[] nums1 = get(nums,i);
//        int[] nums2 = get(nums,mid);
//        if (nums1[0] != nums2[0]){
//            return nums1[0] > nums2[0] ? 1:-1;
//        }
//        if (nums1[1] == nums2[1]) {
//            return 0;
//        }
//        return nums1[1] > nums2[1] ? 1 : -1;
//    }
//
//    private int[] get(int[] nums, int i) {
//        if (i == -1 || i == nums.length){
//            return new  int[]{0,0};
//        }
//        return new int[]{1,nums[i]};
//    }
//}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null){
//            return head;
//        }
//        ListNode dummy = new ListNode(0, head);
//        ListNode cur = dummy;
//        while (cur.next != null && cur.next.next != null){
//            if (cur.next.val == cur.next.next.val){
//                int x = cur.next.val;
//                while (cur.next != null && cur.next.val == x){
//                    cur.next = cur.next.next;
//                }
//            }else {
//                cur = cur.next;
//            }
//        }
//        return dummy.next;
//    }
//}

//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        // 枚举 a
//        for (int first = 0; first < n; ++first) {
//            // 需要和上一次枚举的数不相同
//            if (first > 0 && nums[first] == nums[first - 1]) {
//                continue;
//            }
//            // c 对应的指针初始指向数组的最右端
//            int third = n - 1;
//            int target = -nums[first];
//            // 枚举 b
//            for (int second = first + 1; second < n; ++second) {
//                // 需要和上一次枚举的数不相同
//                if (second > first + 1 && nums[second] == nums[second - 1]) {
//                    continue;
//                }
//                // 需要保证 b 的指针在 c 的指针的左侧
//                while (second < third && nums[second] + nums[third] > target) {
//                    --third;
//                }
//                // 如果指针重合，随着 b 后续的增加
//                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
//                if (second == third) {
//                    break;
//                }
//                if (nums[second] + nums[third] == target) {
//                    List<Integer> list = new ArrayList<Integer>();
//                    list.add(nums[first]);
//                    list.add(nums[second]);
//                    list.add(nums[third]);
//                    ans.add(list);
//                }
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        String s = "ab#c", t = "ad#c";
//        Solution solution = new Solution();
//        boolean b = solution.backspaceCompare(s, t);
//        System.out.println(b);
//    }
//    public boolean backspaceCompare(String s, String t) {
//        StringBuffer a = new StringBuffer();
//        StringBuffer b = new StringBuffer();
//        String f = Cut(s,a);
//        String m = Cut(t,b);
//        // == 判断地址空间     equals 判断值是否相等
//        return f.equals(m);
//    }
//
//    private String Cut(String s, StringBuffer a) {
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != '#'){
//                a.append(s.charAt(i));
//            }else {
//                if (a.length() != 0){
//                    a.deleteCharAt(a.length()-1);
//                }
//            }
//        }
//        return a.toString();
//    }
//}


//class Solution {
//    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
//        List<int[]> ans = new ArrayList<>();
//        int i = 0, j = 0;
//        while (i < firstList.length && j<secondList.length){
//            int lo = Math.max(firstList[i][0],secondList[j][0]);
//            int hi = Math.min(firstList[i][1],secondList[j][1]);
//            if (lo<=hi){
//                ans.add(new int[]{lo,hi});
//            }
//
//            if (firstList[i][1] < secondList[j][1]){
//                i++;
//            }else {
//                j++;
//            }
//        }
//        return ans.toArray(new int[ans.size()][]);
//    }
//}


//class Solution {
//    public int maxArea(int[] height) {
//        int left = 0 , right = height.length -1; int ans = 0;
//        while (left < right){
//            if (height[left] < height[right]){
//                ans = Math.max(ans,(right - left) * height[left]);
//                left++;
//            }else {
//                ans = Math.max(ans , (right - left) * height[right]);
//                right--;
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        int slen = s.length(),pLen = p.length();
//        if (slen<pLen){
//            return new ArrayList<Integer>();
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        int[] sCount = new int[26];
//        int[] pCount = new int[26];
//        for (int i = 0; i < pLen; i++) {
//            ++sCount[s.charAt(i) - 'a'];
//            ++pCount[p.charAt(i) - 'a'];
//        }
//
//        if (Arrays.equals(sCount,pCount)){
//            ans.add(0);
//        }
//
//        for (int i = 0; i < slen - pLen; i++) {
//            --sCount[s.charAt(i) - 'a'];
//            ++sCount[s.charAt(i + pLen) - 'a'];
//            if (Arrays.equals(sCount,pCount)){
//                ans.add(i+1);
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        solution.numSubarrayProductLessThanK(new int[]{10,5,2,6},100);
//    }
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        if (k <= 1){
//            return 0;
//        }
//        int prod = 1 ,ans  = 0 , left = 0;
//        for (int right = 0; right < nums.length; right++) {
//            prod*=nums[right];
//            while (prod >= k){
//                prod /= nums[left];
//                left++;
//            }
//            ans += right -left +1;
//        }
//        return ans;
//    }
//}


//class Solution {
//    public int minSubArrayLen(int target, int[] nums) {
//        int n = nums.length;
//        if (n==0){
//            return 0;
//        }
//
//        int ans =Integer.MAX_VALUE;
//        int start = 0 , end = 0;
//        int  sum = 0;
//        for (end = 0; end < nums.length; end++) {
//            sum+=nums[end];
//            while (sum >= target){
//                ans = Math.min(ans ,end - start + 1);
//                sum -= nums[start];
//                start++;
//            }
//            end++;
//        }
//        return ans == Integer.MAX_VALUE ?0 :ans;
//    }
//}

//class Solution {
//    public int numIslands(char[][] grid) {
//        int count = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == '1'){
//                    inject(grid,i,j);
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    private void inject(char[][] grid, int i, int j) {
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
//            return;
//        }
//        grid[i][j] = '2';
//        inject(grid,i-1,j);
//        inject(grid,i+1,j);
//        inject(grid,i,j-1);
//        inject(grid,i,j+1);
//
//    }
//}

//class Solution {
//    public int findCircleNum(int[][] isConnected) {
//        int provinces = isConnected.length;
//        boolean[] visited  = new boolean[provinces];
//        int circles = 0;
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0; i < provinces; i++) {
//            if (!visited[i]){
//                queue.offer(i);
//                while (!queue.isEmpty()){
//                    int j = queue.poll();
//                    visited[j] = true;
//                    for (int k = 0; k < provinces; k++) {
//                        if (isConnected[j][k] == 1 && !visited[k]){
//                            queue.offer(k);
//                        }
//                    }
//                }
//                circles++;
//            }
//        }
//        return circles;
//    }
//}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

//class Solution {
//    public Node connect(Node root) {
//        if (root == null){
//            return null;
//        }
//        LinkedList<Node> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            Node last = null;
//            for (int i = 0; i < size ; i++) {
//                Node poll = queue.poll();
//                if (poll.left != null){
//                    queue.offer(poll.left);
//                }
//                if (poll.right != null){
//                    queue.offer(poll.right);
//                }
//                if ( i != 0){
//                    last.next = poll;
//                }
//                last = poll;
//            }
//        }
//        return root;
//    }
//}

//class Solution {
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        return dfs(root,subRoot);
//    }
//
//    private boolean dfs(TreeNode root, TreeNode subRoot) {
//        if (root == null){
//            return false;
//        }
//        return check(root,subRoot) || dfs(root.left,subRoot) || dfs(root.right,subRoot);
//    }
//
//    private boolean check(TreeNode root, TreeNode subRoot) {
//        if (root == null && subRoot == null){
//            return true;
//        }
//        if (root == null || subRoot == null || root.val != subRoot.val){
//            return false;
//        }
//        return check(root.left,subRoot.left) && check(root.right, subRoot.right);
//    }
//}

//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        int n = s.length();
//        boolean[] memo = new boolean[n+1];
//        memo[0] = true;
//        for (int i = 0; i <= s.length(); i++) {
//            for (int j = 0; j < i; j++) {
//                if (memo[j] && wordDict.contains(s.substring(j,i))){
//                    memo[i] = true;
//                    break;
//                }
//            }
//        }
//        return memo[n];
//    }
//}



