class Solution {
    public int numTeams(int[] rating) {
        int answer = 0;
        int n = rating.length;

        for(int i = 1; i < n - 1; i++) {
            int smaller[] = new int[2], bigger[] = new int[2];
            for(int j = 0; j < n; j++) {
                if(rating[i] < rating[j]) smaller[j > i ? 1:0]++;
                if(rating[i] > rating[j]) bigger[j > i ? 1:0]++;
            }
            answer += smaller[0] * bigger[1] + bigger[0] * smaller[1];
        }
        return answer;
    }
}