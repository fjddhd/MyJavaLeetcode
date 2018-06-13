public class Solution766 {
    private int mark=0;
    private int mark1=0;

    public boolean isToeplitzMatrix(int[][] matrix) {
        System.out.println("列数为"+matrix[0].length);
        System.out.println("行数为"+matrix.length);
        check_horizon(matrix);
        check_vertical(matrix);

        if (mark==0 && mark1==0)
            return true;
        else
            return false;

    }

    public void check_horizon(int[][] matrix){
        for (int i=0;i<matrix[0].length;i++){
            int wait_to_compare=matrix[0][i];
            if (mark==0)
                for (int j=0;j<matrix.length;j++){
//                    System.out.println("h上待比较数和比较数： "+wait_to_compare+" "+matrix[0+j][i+j]);
                    if (0+j<matrix.length && i+j<matrix[0].length)
                        if (wait_to_compare!=matrix[0+j][i+j]){
                            System.out.println("完蛋了h  "+i+" "+j);
                            mark=1;
                            break;
                        }
                }
        }
    }

    public void check_vertical(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            int wait_to_compare=matrix[i][0];
            if (mark1==0)
                for (int j=0;j<matrix[0].length;j++){
//                System.out.println("v上待比较数和比较数： "+wait_to_compare+" "+matrix[i+j][0+j]);
                    if (i+j<matrix.length && 0+j<matrix[0].length)
                        if (wait_to_compare!=matrix[i+j][0+j]){
                            System.out.println("完蛋了v "+i+" "+j);
                            mark1=1;
                            break;
                        }
                }
        }
    }
}
