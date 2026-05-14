import java.util.*;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        // Đếm tần suất words1
        for (String w : words1) {
            map1.put(w, map1.getOrDefault(w, 0) + 1);
        }

        // Đếm tần suất words2
        for (String w : words2) {
            map2.put(w, map2.getOrDefault(w, 0) + 1);
        }

        int count = 0;

        // Kiểm tra những từ xuất hiện đúng 1 lần ở cả 2 mảng
        for (String key : map1.keySet()) {
            if (map1.get(key) == 1 && map2.getOrDefault(key, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}