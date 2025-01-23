class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> answer = new LinkedList<>();
        if(digits.isEmpty()) return answer;
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        answer.add("");

        while(answer.peek().length() != digits.length()) {
            String remove = answer.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];
            for(char c : map.toCharArray())
                answer.addLast(remove + c);
        }
        return answer;
    }
}