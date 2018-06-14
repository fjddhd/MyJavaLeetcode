class Solution {
    public int hammingDistance(int x, int y) {
        String xs,ys;
        int xsl,ysl,length,max_length,count=0;
        StringBuffer x_ahead=new StringBuffer("");
        StringBuffer y_ahead = new StringBuffer("");

        xs=Integer.toBinaryString(x);
        ys=Integer.toBinaryString(y);
        xsl=xs.length();
        ysl=ys.length();
        length=Math.abs(xsl-ysl);
        max_length=Math.max(xsl,ysl);
        if(xsl>ysl){//��y���ȱ�xСʱ����0����ǰ�油�䵽��ͬ����
            StringBuffer ysb=new StringBuffer(ys);

            StringBuffer temp=new StringBuffer("0");
            for (int i=0;i<length;++i)
                y_ahead.append(temp);
            y_ahead = y_ahead.append(ysb);
            ys=y_ahead.toString();

        }
        else {//��x���ȱ�yСʱ����Ӧ�ء���
            StringBuffer xsb=new StringBuffer(xs);
            StringBuffer temp=new StringBuffer("0");
            for (int i=0;i<length;++i)
                x_ahead.append(temp);
            x_ahead=x_ahead.append(xsb);
            xs=x_ahead.toString();

        }
        

        for(int j=0;j<max_length;j++){
            if (xs.charAt(j)!=ys.charAt(j)){
                count++;
            }
        }

        return count;

    }
}