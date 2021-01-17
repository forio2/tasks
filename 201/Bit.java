import java.util.Scanner;

class Bits{  
  public static void main(String[]args){
    long start = System.currentTimeMillis();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int loop = 1;
    for(int i=0;i<n;i++){
      loop = 2 * loop;
    }
    for(int i=0;i<loop;i++){
      int pow = loop;
      int count = 2;
      int ans = 0;
      for(int j=0;j<n;j++){
        pow = pow / count;
        if(pow <= i){
          ans = ans + pow;
          arr[j] = 1;
        }
        if(ans > i){
          arr[j] = 0;
          ans = ans - pow;
        }
        System.out.print(arr[j] + " ");
      }
      System.out.println();
    }
    long end = System.currentTimeMillis();
    System.out.println("Execution time was "+(end-start)+" ms.");
  }
}
