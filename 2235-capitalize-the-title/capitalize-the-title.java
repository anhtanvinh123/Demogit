class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];

            // nếu độ dài <= 2 → viết thường hết
            if (w.length() <= 2) {
                result.append(w.toLowerCase());
            } 
            else {
                // viết hoa chữ đầu, còn lại viết thường
                result.append(Character.toUpperCase(w.charAt(0)));
                result.append(w.substring(1).toLowerCase());
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}