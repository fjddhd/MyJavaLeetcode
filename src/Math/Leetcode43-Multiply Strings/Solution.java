import java.util.ArrayList;

class Solution {//注：0的ascii为48
    public String multiply(String num1, String num2) {
        char[] c0_num1=num1.toCharArray(),c0_num2=num2.toCharArray();
        int len1=c0_num1.length,len2=c0_num2.length;
        char[] c_num1=new char[len1],c_num2=new char[len2];
        for (int i=0;i<len1;++i){//逆转原数组
            c_num1[i]=c0_num1[len1-1-i];
        }
        for (int i=0;i<len2;++i){//逆转原数组
            c_num2[i]=c0_num2[len2-1-i];
        }
        ArrayList<ArrayList<Integer>> all=new ArrayList<>();
        for (int i=0;i<len2;++i){
            all.add(new ArrayList<Integer>());
            for (int k=0;k<i;++k)//每行填充i个0
                all.get(i).add(0);
            int temp=c_num2[i]-48,carry=0;//设定和初始化被乘数对应被乘位值和进位值
            for (int j=0;j<len1;++j){
                int result=temp*(c_num1[j]-48);
                if (carry!=0){//result如果需要进位就先进位
                    result+=carry;
                    carry=0;
                }
                if ((result/10)!=0){//result大于10，设定下一乘数进位值,把应存的result保留其个位数值
                    carry=result/10;
                    result=result%10;
                }

                all.get(i).add(i+j,result);
            }
            if (carry!=0){//此时还有进位值
                all.get(i).add(carry);
            }
        }


        int max=0;//最长行的元素个数
        for (int i=0;i<all.size();++i){
            max=Math.max(max,all.get(i).size());
        }
        for (int i=0;i<all.size();++i){
            int size=all.get(i).size();
            if (size<max)
                for (int j=0;j<max-size;++j){
                    all.get(i).add(0);
                }
        }
        ArrayList<Integer> fin_int_version=new ArrayList<>();
        int sum,carry=0;
        for (int i=0;i<max;++i){
            sum=0;
            for (int j=0;j<all.size();++j) {
                sum += all.get(j).get(i);
            }
            if (carry!=0){
                sum+=carry;
                carry=0;
            }
            if (sum/10!=0){
                carry=sum/10;
                sum=sum%10;
            }
            fin_int_version.add(sum);
        }
        if (carry!=0){
            fin_int_version.add(carry);
        }

        StringBuffer sb=new StringBuffer();
        for (int i=fin_int_version.size()-1;i>=0;--i){
            sb.append(fin_int_version.get(i));
        }

        String s=sb.toString();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;++i){
            if(c[i]!=48)
                return s;
        }
        s="0";
        return s;
    }
}