public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        int len=Integer.toBinaryString(n).length(),mark=0,temp;
        for (int i=len-1;i>=0;i--) {
            temp= (n>>i)%2;//取位值
            if (n%2==1) {
                if (temp == 1 && i % 2 == 1) {
                    mark = 1;
                }
                if (temp == 0 && i % 2 == 0) {
                    mark = 1;
                }
            }
            else {
                if (temp == 1 && i % 2 == 0) {
                    mark = 1;
                }
                if (temp == 0 && i % 2 == 1) {
                    mark = 1;
                }
            }
            System.out.println(5>>2);
            System.out.println(temp);
        }
        if (mark==0)
            return true;
        else
            return false;
    }
}
