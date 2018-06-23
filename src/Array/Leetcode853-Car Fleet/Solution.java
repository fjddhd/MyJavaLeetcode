/**
 * 先把position的值换成与target的距离
 * 再同时对position以及相对应的speed从小到大排序
 * 创建新的数组保存每辆车到达终点的时间
 * 遍历时间数组，如果位置靠后的车所用时间小于等于前车，那么这两个车会组成一个车队，跳过继续遍历，如果遇到后面的车所用时间大于前车，则会组成下一个车队，车队数+1，待比较的前车值也替换成这个慢的
 * **/
public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len=position.length,count=0;
        double[] time=new double[len];
        if (len==0)
            return 0;
        for (int i=0;i<len;++i){
            position[i]=target-position[i];
        }
        for (int i=0;i<len;++i){
            for (int j=i+1;j<len;++j){
                if (position[i]>position[j]){
                    int temp=position[i];
                    position[i]=position[j];
                    position[j]=temp;

                    int temps=speed[i];
                    speed[i]=speed[j];
                    speed[j]=temps;
                }
            }
        }
        for (int i=0;i<len;++i){
            time[i]=1.0*position[i]/speed[i];
        }
        double first=time[0];
        for (int i=1;i<time.length;++i){
            if (first>=time[i]){
                continue;
            }
            else {
                count++;
                first=time[i];
            }
        }
        count++;
        return count;
    }
}
