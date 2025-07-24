 class stockbuysell{
    public static void main(String[] args){
        int[] stock = {7,1,5,3,6,4};

       int result = maxProfit(stock);
       System.out.print(result);
    }
    static int maxProfit(int[] stock){
        int maxProfit = 0;
        int minPrice = stock[0];

        for(int i=1;i<stock.length;i++){
            if(stock[i]<minPrice){
                minPrice = stock[i];
            }else{
                int profit = stock[i] - minPrice;
                if(maxProfit<profit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}