public class Solution {
    public int removeElement(int[] nums, int val) {
        int length=nums.length,mark=0,i=0;
        while(true){
            if (i+mark==length)
                break;
            if(nums[i]==val){
                nums=delElem(nums,i);
                mark++;
                continue;
            }
            ++i;
        }
        return length-mark;
    }
    public int[] delElem(int[] a,int index){//要注意java中函数对基本数值类型的“引用”实际上是拷贝，不会改变原值
        if(index<a.length){
            for (int i=index;i<a.length-1;++i){
                a[i]=a[i+1];
            }
        }
        return a;
    }
}
