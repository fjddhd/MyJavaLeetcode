import java.util.ArrayList;

public class Solution869 {
    static ArrayList<String> al=new ArrayList<>();
    public static void Mypermutate(String input){
        if(input == null)
            throw new IllegalArgumentException();
        char[] data = input.toCharArray();
        Mypermutate(data, 0);
    }

    public static void Mypermutate(char[] data, int begin){
        int length = data.length;
        if(begin == length)
            al.add(new String(data));
        for(int i = begin ; i < length; i++) {
            if(isUnique(data, begin, i)){
                swap(data, begin, i);
                Mypermutate(data, begin + 1);
                swap(data, begin, i);
            }
        }
    }

    private static boolean isUnique(char[] data, int begin, int end){
        for(int i = begin; i < end; i++)
            if(data[i] == data[end])
                return false;
        return true;
    }

    private static void swap(char[] data, int left, int right) {
        char temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
    //以上为全排序逻辑

    public boolean reorderedPowerOf2(int N) {
        String s=String.valueOf(N);
        Mypermutate(s);
        for (int i=0;i<al.size();++i){
            int temp=Integer.parseInt(al.get(i));
            if (al.get(i).charAt(0)=='0')//前导数为0
                continue;
            if (isRight(temp))
                return true;
        }
        return false;
    }
    public static boolean isRight(int k){
        double a=Math.log(k)/Math.log(2);
        if (a==(int)a)
            return true;
        else
            return false;
    }

}
