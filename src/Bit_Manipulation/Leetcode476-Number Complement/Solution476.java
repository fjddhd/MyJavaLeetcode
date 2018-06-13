/*使用异或
a异或a=0
a异或b=1
* */
public class Solution476 {
    public int findComplement(int num) {
        String Binary_num_s=Integer.toBinaryString(num);//10进制转2进制
        int len=Binary_num_s.length(),temp,temp1;
        temp=Integer.valueOf(Binary_num_s);
        StringBuffer SB=new StringBuffer();
//        for(int i=0;i<Binary_num_s.length();++i){
//            SB.append(1);
//        }
        System.out.println(Binary_num_s+"  "+len);
        for (int i=len;i>=0;--i){
            temp1= (int) (temp/Math.pow(10,i));
            System.out.println(temp1);
            SB.append(temp^1);
        }
//        int Binary_num=Integer.parseInt(Binary_num_s);
        int temp_int=Integer.parseInt(SB.toString());
//        int Binary_result=Binary_num^temp_int;
        int result=0;
        result=Integer.valueOf(new Integer(temp_int).toString(),2);//2进制转10进制
        return result;
    }
}
