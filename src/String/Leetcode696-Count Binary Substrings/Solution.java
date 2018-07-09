class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<Integer> al=new ArrayList();
        int count=1,res=0;
        if(s.length()==0)
            return 1;
        for(int i=1;i<s.length();++i){
            if(s.charAt(i)==s.charAt(i-1))
                count++;
            else{
                al.add(count);
                count=1;
            }
        }
        al.add(count);
        for(int i=1;i<al.size();++i){
            res+=Math.min(al.get(i-1),al.get(i));
        }
        return res;
    }
}