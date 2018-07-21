public class Solution {
    public String addStrings(String num1, String num2) {
        int len1=num1.length(),len2=num2.length(),addZeroNum=0,mark=0;
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (int i=len1-1;i>=0;--i){
            sb1.append(num1.charAt(i));
        }
        num1=sb1.toString();
        for (int i=len2-1;i>=0;--i){
            sb2.append(num2.charAt(i));
        }
        num2=sb2.toString();
        if (len1-len2<0){
            for (int i=0;i<len2-len1;++i)
                sb1.append('0');
            num1=sb1.toString();
        }
        else {
            for (int i=0;i<len1-len2;++i)
                sb2.append('0');
            num2=sb2.toString();
        }
        System.out.println(num1);
        System.out.println(num2);

        StringBuilder res_re=new StringBuilder();
        for (int i=0;i<Math.max(len1,len2);++i){
            int temp1=num1.charAt(i)-'0';
            int temp2=num2.charAt(i)-'0';
            int sum;
            if (mark==0)
                sum=temp1+temp2;
            else{
                sum=temp1+temp2+mark;
            }
            mark=(sum)/10;
            res_re.append((sum)%10);
        }
        if (mark!=0)
            res_re.append('1');

        return res_re.reverse().toString();


    }
}
