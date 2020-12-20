import java.util.Scanner;

public class main{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int dice = in.nextInt();
    for(int i=0;i<dice;i++){
      int top=1, front=2, left=3, right=4, back=5, bottom=6, temp;
      String direct = in.next();
      for(int j=0;j<direct.length();j++){
        if(direct.charAt(j) == 'F'){
          temp = front; //2
          front = top; //1
          top = back; //5
          back = bottom; //6
          bottom = temp; //2
        }
        if(direct.charAt(j) == 'B'){
          temp = back; //5
          back = top; //1
          top = front; //2
          front = bottom; //6
          bottom = temp; //5
        }
        if(direct.charAt(j) == 'L'){
          temp = left; //3
          left = top; //1
          top = right; //4
          right = bottom; //6
          bottom = left; //3
        }
        if(direct.charAt(j) == 'R'){
          temp = right; //4
          right = top; //1
          top = left; //3
          left = bottom; //6
          bottom = temp; //4
        }
        if(direct.charAt(j) == 'C'){
          temp = right; //4
          right = back; //5
          back = left; //3
          left = front; //2
          front = temp; //4
        }
        if(direct.charAt(j) == 'D'){
          temp = left; //3
          left = back; //5
          back = right; //4
          right = front; //2
          front = temp; //3
        }
        if(j == direct.length()-1){
          System.out.println(front);
        }
      }
    }
  }
}
