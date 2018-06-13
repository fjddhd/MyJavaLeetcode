class Solution {
    public char findTheDifference(String s, String t) {
        int ans = 0, i, lens = s.length(), lent = t.length();
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        for(i = 0; i < lens; i++)
            ans ^= (cs[i] - 'a');
        for(i = 0; i < lent; i++)
            ans ^= (ct[i] - 'a');
        return (char)('a' + ans);
    }
}