class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(0 < j && j < i) {
                    int sum = answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j);
                    list.add(sum);
                } else {
                    list.add(1);
                }
            }
            answer.add(list);
        }
        return answer;
    }
}