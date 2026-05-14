class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            // kiểm tra ô hiện tại trống
            if (flowerbed[i] == 0) {
                // kiểm tra bên trái
                int left = (i == 0) ? 0 : flowerbed[i - 1];
                
                // kiểm tra bên phải
                int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

                // nếu trái và phải đều trống thì trồng được
                if (left == 0 && right == 0) {
                    flowerbed[i] = 1; // trồng hoa
                    count++;

                    if (count >= n) {
                        return true;
                    }
                }
            }
        }

        return count >= n;
    }
}