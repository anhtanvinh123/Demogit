import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);
        
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        
        for (int x : set1) {
            if (!set2.contains(x)) {
                res1.add(x);
            }
        }
        
        for (int x : set2) {
            if (!set1.contains(x)) {
                res2.add(x);
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(res1);
        ans.add(res2);
        
        return ans;
    }
}