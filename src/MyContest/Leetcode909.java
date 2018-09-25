import java.util.ArrayList;

public class Leetcode909 {//某个测试例不对
    public int snakesAndLadders(int[][] board) {
        ArrayList<Integer> al=new ArrayList<>();
        boolean orderIsOk=true;
        for (int i=board.length-1;i>=0;--i){
            if (orderIsOk){
                for (int j=0;j<board.length;++j){
                    al.add(board[i][j]);
                }
                orderIsOk=!orderIsOk;
            }
            else {
                for (int j=board.length-1;j>=0;--j){
                    al.add(board[i][j]);
                }
                orderIsOk=!orderIsOk;
            }
        }
        int stepladder=0;
        for (int i=0;i<al.size();++i){
            if (al.get(i)==-1){
                continue;
            }
            else {
                i=al.get(i)-1;
                stepladder++;
            }
            if(stepladder>al.size())//冗杂防无限循环
                return -1;
        }
        stepladder++;
        return stepladder;
    }
}
