import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();

        // Lưu các loại kẹo khác nhau
        for (int candy : candyType) {
            set.add(candy);
        }

        // Số kẹo được ăn tối đa là n / 2
        int maxEat = candyType.length / 2;

        // Kết quả là min(số loại kẹo, số lượng được ăn)
        return Math.min(set.size(), maxEat);
    }
}