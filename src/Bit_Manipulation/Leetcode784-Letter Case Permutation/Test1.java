public class Test1 {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("abcde");
        sb.replace(1,2, String.valueOf(Character.toUpperCase(sb.charAt(1))));
        System.out.println(sb.toString());
    }
}
