import java.util.*;

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> startCities = new HashSet<>();

        // Lưu tất cả thành phố xuất phát
        for (List<String> path : paths) {
            startCities.add(path.get(0));
        }

        // Thành phố đích là thành phố không nằm trong startCities
        for (List<String> path : paths) {
            String destination = path.get(1);

            if (!startCities.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}