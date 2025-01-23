class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<String>();
        recurse(answer, 0, 0, "", n);
        return answer;
    }

    public void recurse(List<String> answer, int left, int right, String s, int n) {
        if(s.length() == n * 2) {
            answer.add(s);
            return;
        }
        if(left < n) recurse(answer, left+1, right, s + "(", n);
        if(right < left) recurse(answer, left, right+1, s + ")", n);
    }
}