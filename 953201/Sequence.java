import java.util.Scanner;

class Sequence{
  public static void main(String[]args){
   Scanner in = new Scanner(System.in);
   System.out.print("S: ");
   int result = in.nextInt();
   System.out.print("N: ");
   int consecutive = in.nextInt();
   System.out.print("A: ");
   int n = in.nextInt();
   int[] arr = new int[n];
   System.out.print("number A: ");
   for(int i=0;i<n;i++){
     arr[i] = in.nextInt();
   }
   int count=0;
   int answer=0;
   for(int i=0;i<(n+1)-consecutive;i++){
     int sum=0;
     for(int j=i;j<consecutive+count;j++){
       sum = sum + arr[j];
       System.out.print(arr[j]);
     }
     System.out.println();
     if(sum == result){
       answer++;
     }
     count++;
   }
   System.out.println(answer);
  }
}
