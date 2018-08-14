import java.util.ArrayList;

public class Leetcode889 {//方向每次都变，为c+,r+,c-,r-       每次移动步数每两次移动加一步，前两次为1
    public static int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] res=new int[R*C][2];
        ArrayList<Integer> al=new ArrayList<>();
        al.add(r0);al.add(c0);//加起始点进去

        int count=1,orien=1,step=1;//orien1230分别对应c+,r+,c-,r-
        for (;al.size()<R*C*2;++count){
            orien=count%4;
            step=1+(count-1)/2;
            if (orien==1){
                for (int i=0;i<step;++i){
                    c0++;
                    if (r0<R && c0<C && r0>=0 && c0>=0){
                        al.add(r0);
                        al.add(c0);
                    }
                }
            }
            else if (orien==2){
                for (int i=0;i<step;++i){
                    r0++;
                    if (r0<R && c0<C && r0>=0 && c0>=0){
                        al.add(r0);
                        al.add(c0);
                    }
                }
            }
            else if (orien==3){
                for (int i=0;i<step;++i){
                    c0--;
                    if (r0<R && c0<C && r0>=0 && c0>=0){
                        al.add(r0);
                        al.add(c0);
                    }
                }
            }
            else if (orien==0){
                for (int i=0;i<step;++i){
                    r0--;
                    if (r0<R && c0<C && r0>=0 && c0>=0){
                        al.add(r0);
                        al.add(c0);
                    }
                }
            }
        }
        for (int i=0;i<=al.size()-2;i+=2){
            res[i/2]=new int[]{al.get(i),al.get(i+1)};
        }

        return res;
    }
}
