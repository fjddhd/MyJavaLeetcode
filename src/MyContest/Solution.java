import java.util.ArrayList;

public class Solution {
    public int[][] transpose(int[][] A) {
        int row=A.length,line=A[0].length;
        int[][] res=new int[line][row];
        for (int i=0;i<row;++i){
            for (int j=0;j<line;++j){
                res[j][i]=A[i][j];
            }
        }
        return res;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        ArrayList<ArrayList<Double>> L=new ArrayList<>();
        int front=-1,rear=-1;
        ArrayList<TreeNode> queue=new ArrayList<>();
        ArrayList<Double> al1=new ArrayList<>();
        rear++;queue.add(root);//根节点入队
        rear++;queue.add(null);
        while(front!=rear){
            front++;TreeNode tn=queue.get(front);//出队一个节点
            if (tn!=null){
                al1.add((double) tn.val);
                if (tn.left!=null){
                    rear++;queue.add(tn.left);
                }
                if (tn.right!=null){
                    rear++;queue.add(tn.right);
                }
            }
            else {
                if (!al1.isEmpty()){
                    rear++;queue.add(null);
                    L.add(al1);
                    al1=new ArrayList<>();
                }
            }
        }
        Double temp=L.get(L.size()-1).get(0);
        int mark=0;
        if(L.get(L.size()-1).size()==1)
            mark=1;

        front=-1;rear=-1;
        queue=new ArrayList<>();
        rear++;queue.add(root);//根节点入队
        while(front!=rear){
            front++;TreeNode tn=queue.get(front);
            if (tn.left!=null){
                rear++;queue.add(tn.left);
                if (tn.left.val==temp && mark==0)
                    return tn;
                else if(tn.left.val==temp && mark==1)
                    return tn.left;
            }
            if (tn.right!=null){
                rear++;queue.add(tn.right);
                if (tn.right.val==temp  && mark==0)
                    return tn;
                else if(tn.right.val==temp  && mark==1)
                    return tn.right;
            }
        }
        return null;
    }

    public int primePalindrome(int N) {
        int i=N+1,sum=0,num,temp=1;
        while(true){
            i=N+1;sum=0;temp=1;
            while(temp>0){
                num=temp%10;
                sum=sum*10+num;
                temp/=10;
            }
            if(sum==i){
                //验证素数
                int k= (int) Math.sqrt(i);
                int j;
                for (j=2;j<k;++j){
                    if (i%j==0)
                        break;
                }
                if (j<=k){
                    continue;
                }
                else{
                    return i;
                }
            }
            i++;
        }
    }
}
