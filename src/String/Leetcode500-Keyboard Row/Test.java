public class Test {
    public static void main(String[] args){
        String[] s=new String[]{"Hello","Alaska","Dad","Peace"};
        String[] re=Solution2.findWords(s);
        System.out.println("ok");
        for (int i=0;i<re.length;++i){
            System.out.println(re[i]);
        }
    }
}
