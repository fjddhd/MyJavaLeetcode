import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        ArrayList<Integer> ini_location=new ArrayList<>(8);
        ini_location.add(0);ini_location.add(0);ini_location.add(0);ini_location.add(len-1);ini_location.add(len-1);ini_location.add(len-1);ini_location.add(len-1);ini_location.add(0);
        for (int i=0;i<len/2;++i){//n-2轮，每轮处理一圈
            ArrayList<Integer> location=new ArrayList<>(8);
            location.addAll(ini_location);
            for (int j=0;j<len-1-2*i;++j){//每轮n-1-2*i组，每组内四次后换下一组,每轮起始输入点为matrix[len-1-i-j][0+i]
                int next=move(matrix,matrix[len-1-i-j][0+i],location.get(0),location.get(1));
                next=move(matrix,next,location.get(2),location.get(3));
                next=move(matrix,next,location.get(4),location.get(5));
                next=move(matrix,next,location.get(6),location.get(7));
                if (j+1<len-1-2*i) {//最后一组结束后坐标不换组
                    nextGroup(location);
                    System.out.println("第 "+i+"轮 第"+j+"组 开始");
                }
            }
            nextTerm(ini_location,1);//换轮
        }
    }
    private Integer move(int[][] matrix,int from,int x,int y) {
        int saved = matrix[x][y];
        matrix[x][y] = from;
        return saved;
    }
    private void nextGroup(ArrayList<Integer> l){ //0,+1,+1,0,0,-1,-1,0
        l.set(1,l.get(1)+1);
        l.set(2,l.get(2)+1);
        l.set(5,l.get(5)-1);
        l.set(6,l.get(6)-1);
    }
    private void  nextTerm(ArrayList<Integer> l,int term){//+++----+
        l.set(0,l.get(0)+1);
        l.set(1,l.get(1)+1);
        l.set(2,l.get(2)+1);
        l.set(3,l.get(3)-1);
        l.set(4,l.get(4)-1);
        l.set(5,l.get(5)-1);
        l.set(6,l.get(6)-1);
        l.set(7,l.get(7)+1);
    }
}
