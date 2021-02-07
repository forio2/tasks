import java.util.Scanner;

class BuyAndSellStock{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int prices[] = new int[n];
    for(int i=0;i<n;i++){
      prices[i] = in.nextInt();
    }
    int max = 0;
    int change = 0;
    for(int i=1;i<n;i++){
      int result = prices[i] - prices[change];
      if(result > max){
        max = result;
      }
      if(prices[i] < prices[change]){
        j = i;
      }
    }
  }
}
