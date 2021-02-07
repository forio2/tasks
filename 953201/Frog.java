class Frog{
  public static void main(String[]args){
    int n = 4;
    int result = 1;
    int count = 0;
    for(int i = 0;i<n;i++){
      if(i > 0){
        count = result - count;
      }
      result = result + count;
    }
    System.out.println(result);
  }
}
