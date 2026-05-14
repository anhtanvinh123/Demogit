import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Đưa banned vào HashSet để kiểm tra nhanh
        HashSet<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        // Chuyển về chữ thường và thay dấu câu bằng khoảng trắng
        paragraph = paragraph.toLowerCase().replaceAll("[!?',;.]", " ");

        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        String result = "";
        int maxCount = 0;

        for (String word : words) {
            // Bỏ qua từ bị cấm
            if (!bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);

                if (map.get(word) > maxCount) {
                    maxCount = map.get(word);
                    result = word;
                }
            }
        }

        return result;
    }
}