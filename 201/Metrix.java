import java.util.Scanner;

class Metrix{
  public static void main(String[]args){
   Scanner in = new Scanner(System.in);
   int column = in.nextInt();
   int row = in.nextInt();
   int arr[][] = new int[column][row];
   for(int i=0;i<column;i++){
     for(int j=0;j<row;j++){
       arr[i][j] = in.nextInt();
     }
   }

   for(int i=0;i<column;i++){
     for(int j=0;j<row;j++){
       System.out.print(arr[i][j] + " ");
     }
     System.out.println();
   }
  }
}
