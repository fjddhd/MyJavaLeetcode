import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers1(int[] nums) {
        int length=nums.length;
        HashMap<Integer,Integer> al_nums= new HashMap<>();
        ArrayList<Integer> result=new ArrayList();
        for(int i=0;i<length;++i){
            al_nums.put(i+1,nums[i]);
        }
        for (int i=1;i<length+1;++i){
            if (!al_nums.containsValue(i))
                result.add(i);
        }
        return result;
    }
    public List<Integer> findDisappearedNumbers(int[] nums){
        int length=nums.length;
        ArrayList<Integer> result=new ArrayList();
        int[] asist=new int[length+1];
        for (int i=0;i<=length;++i){
            asist[i]=0;
        }
        for (int i=0;i<length;++i){
            asist[nums[i]]=1;
        }
        for (int i=1;i<length;++i){
            if (asist[i]==0){
                result.add(nums[i-1]);
            }
        }
        return result;
    }
}
