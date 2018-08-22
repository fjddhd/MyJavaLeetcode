class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String myPatternE=getE(pattern);
        List<String> res=new ArrayList<>();
        for (int i=0;i<words.length;++i){
            String temp=getE(words[i]);
            if (myPatternE.equals(temp)){
                res.add(words[i]);
            }
        }
        return res;
    }
    public String getE(String s){
        ArrayList<Character> aaaa=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int diverCap=0;
        for (int i=0;i<s.length();++i){
            if (!aaaa.contains(s.charAt(i))){
                aaaa.add(s.charAt(i));
                sb.append(diverCap++);
            }
            else {
                sb.append(aaaa.indexOf(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}