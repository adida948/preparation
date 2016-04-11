package startup;
/*3. Say you have the following *sequence* of a stock's prices from yesterday:

stock_prices_yesterday = [10, 7, 5, 8, 11, 9]

Write an efficient function that takes stock_prices_yesterday and returns the best 
profit I could have made from 1 purchase and 1 sale.

Important to note that the sequence above says something like the price was $10 at 10 AM, $7 at 11 AM, $5 at Noon, etc.*/
public class StockPrices {

	
	public static void main(String[]args){
		
		int[] inputArray = {10, 7, 5, 8, 11,1};
		
		System.out.println(getMaxStockProfit(inputArray));
	}
	
	public static int getMaxStockProfit(int[] prices){
        if(prices.length == 0) return 0;

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		int[] diffArray = new int[prices.length];
		
		//Find min value
		for(int i = 0; i < prices.length;i++){
			
			if(prices[i] < minValue){
				minValue = prices[i];
			}
			//Everytime we iterate, we put the min in the diff array
			diffArray[i]=minValue;
			
		}
		
		//Substract minValue array  from original 
		for(int i = 0; i < prices.length; i++){
			prices[i]= prices[i]- diffArray[i];
		}
		
		//fin maximum Sum
		for(int i = 0; i < prices.length; i++){
			if(prices[i]> maxValue){
				maxValue = prices[i];
			}
		}
		
		return maxValue !=0? maxValue: 0;
		
		
	}
	
}
