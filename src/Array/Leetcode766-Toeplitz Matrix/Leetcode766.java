public class Leetcode766 {
    public static void main(String[] args){
        Solution766 S=new Solution766();
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean a=S.isToeplitzMatrix(matrix);
        System.out.println(a);
    }
}
