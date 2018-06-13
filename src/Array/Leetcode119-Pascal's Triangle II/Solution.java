class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> a1=new ArrayList<List<Integer>>();
        switch(rowIndex){
            case 0:{List<Integer> a=new ArrayList<Integer>();a.add(1);a1.add(a);break;}
            case 1:{List<Integer> a=new ArrayList<Integer>();a.add(1);a1.add(a);List<Integer> aa=new ArrayList<Integer>();aa.add(1);aa.add(1);a1.add(aa);break;}
            default:{List<Integer> b=new ArrayList<Integer>();b.add(1);a1.add(b);
                     List<Integer> c=new ArrayList<Integer>();c.add(1);c.add(1);a1.add(c);
                
                     for(int i=1;i<rowIndex;++i){
                        List<Integer> d=new ArrayList<Integer>();
                        d.add(1);
                        for(int j=1;j<i+1;++j)
                            d.add(a1.get(i).get(j-1)+a1.get(i).get(j));
                        d.add(1);
                        a1.add(d);
                     }
                
            }
        }
        return a1.get(rowIndex);
    }
}