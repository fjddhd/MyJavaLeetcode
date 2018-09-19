class StockSpanner {

    Stack<Integer> prices, weights;

    public StockSpanner() {
        prices = new Stack();
        weights = new Stack();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            w += weights.pop();
        }

        prices.push(price);
        weights.push(w);
        return w;
    }
    
}
    
    
// // 之前超时做法   
//     ArrayList<Integer> al;
//     public StockSpanner() {
//         al=new ArrayList<>();
//     }

//     public int next(int price) {
//         int max=0;
//         al.add(price);
//         for (int i=al.size()-1;i>=0;--i){
//             if (al.get(i)<=price){
//                 max++;
//             }
//             else {
//                 break;
//             }
//         }
//         return max;
//     }
// }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */