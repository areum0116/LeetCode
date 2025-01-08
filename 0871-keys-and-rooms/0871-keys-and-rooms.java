class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        HashSet<Integer> seen = new HashSet<>();
        seen.add(0);

        while (!queue.isEmpty()) {
            Integer q = queue.poll();
            for (Integer i : rooms.get(q)) {
                if (!seen.contains(i)) {
                    queue.offer(i);
                    seen.add(i);
                }
                if(rooms.size() == seen.size()) return true;
            }
        }
        return rooms.size() == seen.size();
    }
}