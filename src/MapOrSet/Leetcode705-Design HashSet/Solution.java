class MyHashSet {

    int[] asist;
    /** Initialize your data structure here. */
    public MyHashSet() {
        asist=new int[1000000];
    }
    
    public void add(int key) {
        asist[key]=1;
    }
    
    public void remove(int key) {
        asist[key]=0;
    }
    
    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
        if(asist[key]==1)
            return true;
        else
            return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */