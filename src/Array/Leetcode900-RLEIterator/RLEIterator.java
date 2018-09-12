class RLEIterator {//不能采用暴力法创建数组，否则大数测试不能通过

    int len=0;
    int[] arr;
    public RLEIterator(int[] A) {
        len=A.length;
        arr=A;
    }
    public int next(int n) {
        int asist=-1,temp=n;
        for (int i=0;i<len;i+=2){
            if (arr[i]!=0 && arr[i]>=temp){
                asist=arr[i+1];
                arr[i]=arr[i]-temp;
//                temp=0;
                break;
            }
            else if (arr[i]<temp){
                temp=temp-arr[i];
                arr[i]=0;
                continue;
            }
        }
        return asist;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */
