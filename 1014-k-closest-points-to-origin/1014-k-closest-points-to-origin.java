class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<Integer, Double> distance = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            double value = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            distance.put(i, value);
        }

        // sort by value
        List<Integer> keySet = new ArrayList<>(distance.keySet());
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return distance.get(o1).compareTo(distance.get(o2));
            }
        });

        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            answer[i] = points[keySet.get(i)];
        }
        return answer;
    }
}