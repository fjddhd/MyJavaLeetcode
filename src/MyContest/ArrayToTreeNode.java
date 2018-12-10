import java.util.ArrayList;

/**
 * 0、先导入Solution.class
 * 1、如果使用ArrayList作为参数，直接调用change(你的Arraylist)方法,但要注意：
 * 第一个节点（下标为0）不使用,可以先添加-999或其他数
 * 空节点用-1元素表示
 *
 * 2、如果使用int 数组，请调用change(ArrayToTreeNode.arrayToList(你的数组))：
 * 第一个节点（下标为0）使用，直接从根节点开始填就好了
 *
 * */
public class ArrayToTreeNode {
    public static TreeNode change(ArrayList<Integer> al){
        ArrayList<TreeNode> treeAl=new ArrayList<>();
        treeAl.add(null);//第一个节点不用
        for (int i=1;i<al.size();++i){
            if (al.get(i)>=0) {
                treeAl.add(new TreeNode(al.get(i)));
            }
            else {//空节点
                treeAl.add(null);
            }
        }
        int sizeOfNode=treeAl.size()-1;

        for (int i=sizeOfNode/2;i>=1;--i){
            if (treeAl.get(i)==null){
                continue;
            }
            treeAl.get(i).left=treeAl.get(2*i);
            if (i==sizeOfNode/2 && sizeOfNode%2==0){//偶数个节点,第一个节点时
                continue;
            }
            treeAl.get(i).right=treeAl.get(2*i+1);
        }
        return treeAl.get(1);
    }


    public static ArrayList<Integer> arrayToList(int a[]){
        ArrayList<Integer> res=new ArrayList<>();
        res.add(-999);
        for (int i=0;i<a.length;++i){
            res.add(a[i]);
        }
        return res;
    }



    /*
    * 测试生成树是否有效
    * */
    public static void ft(TreeNode tn){//前序
        if (tn==null)
            return;
        System.out.print(tn.val+"  ");
        ft(tn.left);
        ft(tn.right);
    }
    public static void it(TreeNode tn){//中序
        if (tn==null)
            return;
        it(tn.left);
        System.out.print(tn.val+"  ");
        it(tn.right);
    }
}
