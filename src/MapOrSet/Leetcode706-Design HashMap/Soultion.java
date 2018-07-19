class MyHashMap {
    int[] val;
    /** Initialize your data structure here. */
    public MyHashMap() {
        val=new int[1000000];
    }
    
    /** value will always be positive. */
    public void put(int key, int value) {
        val[key]=value;
        if(value==0)
            val[key]=-1;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(val[key]==0)
            return -1;
        else if(val[key]==-1)
            return 0;
        else
            return val[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        val[key]=0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */