import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Leetcode890 {//遍历dislikes，删除每个元素中存在重复的数字，依次遍历，最后都删除掉了就false，否则true（错误！）
    public static boolean possibleBipartition(int N, int[][] dislikes) {
        if (dislikes.length==0)
            return true;
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for (int i=0;i<dislikes.length;++i){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(dislikes[i][0]);
            temp.add(dislikes[i][1]);
            al.add(temp);
        }
        int hadDelete;
        while(al.size()!=0){
            hadDelete=0;
            int needToDelete=al.get(0).get(0);
            for (int i=0;i<al.size();++i){
                if (al.get(i).contains(needToDelete)){
                    hadDelete++;
                    Iterator<Integer> iterator = al.get(i).iterator();
                    while (iterator.hasNext()){
                        if (iterator.next()==needToDelete){
                            iterator.remove();
                        }
                    }
                    if (al.get(i).size()==0){
                        al.remove(i--);
                    }
                }
            }
            if (hadDelete==1)//第一个数肯定要remove一次
                return true;
        }
        return false;
    }
}
