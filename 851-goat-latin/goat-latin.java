class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Nếu bắt đầu bằng nguyên âm
            if (vowels.indexOf(word.charAt(0)) != -1) {
                result.append(word);
            } 
            // Nếu bắt đầu bằng phụ âm
            else {
                result.append(word.substring(1));
                result.append(word.charAt(0));
            }

            // Thêm "ma"
            result.append("ma");

            // Thêm số lượng 'a' theo vị trí từ
            for (int j = 0; j <= i; j++) {
                result.append("a");
            }

            // Thêm khoảng trắng nếu chưa phải từ cuối
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}