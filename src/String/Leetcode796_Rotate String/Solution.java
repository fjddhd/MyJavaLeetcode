class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length())
            return false;
        if(A.length()==0)
            return true;
        StringBuilder sb1=new StringBuilder(A);
        StringBuilder sb2=new StringBuilder(B);
        for (int i=0;i<A.length();++i){
            round(sb1);
            if (sb1.toString().equals(sb2.toString()))
                return true;
        }
        return false;

    }
    void round(StringBuilder ssbb){
        char temp=ssbb.charAt(0);
        ssbb.delete(0,1);
        ssbb.append(temp);
    }
}
