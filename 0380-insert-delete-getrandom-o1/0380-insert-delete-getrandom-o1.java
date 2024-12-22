class RandomizedSet {

    private List<Integer> list;
    private Map<Integer, Integer> idxMap;

    public RandomizedSet() {
        list = new ArrayList<>();
        idxMap = new HashMap<>();
    }

    public boolean insert(int val) {
        if(idxMap.containsKey(val)) return false;
        idxMap.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!idxMap.containsKey(val)) return false;
        int idx = idxMap.get(val);
        list.set(idx, list.get(list.size() - 1));
        idxMap.put(list.get(idx), idx);
        
        list.remove(list.size() - 1);
        idxMap.remove(val);
        return true;
    }

    public int getRandom() {
        int idx = (int) (Math.random() * list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */