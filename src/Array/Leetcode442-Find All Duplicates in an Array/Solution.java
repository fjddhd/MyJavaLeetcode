class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len=nums.length,i=0;
        List<Integer> res=new ArrayList();
        while(i<len){
            if(nums[i]!=i+1){
                int temp=nums[i];
                if(temp==nums[temp-1]){
                    res.add(temp);
                    i++;
                    continue;
                }
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
            else
                ++i;
        }
        HashSet hs=new HashSet();
        for(int k=0;k<res.size();++k){
            hs.add(res.get(k));
        }
        res.clear();
        res.addAll(hs);
        return res;
    }
}