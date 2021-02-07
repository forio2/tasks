import java.util.Scanner;

class Metrix{
  public static void main(String[]args){
   Scanner in = new Scanner(System.in);
   int arr[][] = new int[2][3];
   for(int i=0;i<2;i++){
     for(int j=0;j<3;j++){
       arr[i][j] = in.nextInt();
     }
   }

   for(int i=0;i<2;i++){
     for(int j=0;j<3;j++){
       System.out.print(arr[i][2-j] + " ");
     }
     System.out.println();
   }
  }
}
