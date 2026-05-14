class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];

        int give = 1;   // số kẹo sẽ phát ở lượt hiện tại
        int index = 0;  // vị trí người nhận

        while (candies > 0) {
            // Nếu kẹo còn ít hơn số cần phát thì phát hết phần còn lại
            result[index] += Math.min(give, candies);

            candies -= give;

            give++; // lượt sau tăng thêm 1 viên
            index = (index + 1) % num_people; // quay vòng người nhận
        }

        return result;
    }
}