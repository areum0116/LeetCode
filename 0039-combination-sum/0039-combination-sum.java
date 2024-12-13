class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, result, curr, 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> curr, int start) {
        if(target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            if(target < candidates[i]) break;
            curr.add(candidates[i]);
            backtrack(candidates, target-candidates[i], result, curr, i);
            curr.remove(curr.size() - 1);
        }
    }
}