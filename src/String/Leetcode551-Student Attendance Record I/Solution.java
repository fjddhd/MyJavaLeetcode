class Solution {
    public boolean checkRecord(String s) {
        int len=s.length(),marka=0,markl=0;
        for(int i=0;i<len;++i){
            char c=s.charAt(i);
            if(c=='A')
                marka++;
            if(marka==2)
                return false;
            if(c=='L')
                markl++;
            if(markl==3)
                return false;
            if(c!='L' && markl!=0)
                markl=0;
        }
        return true;
    }
}