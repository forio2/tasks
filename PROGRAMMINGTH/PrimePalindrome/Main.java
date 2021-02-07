import java.util.Scanner;

class Main{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for(int i=n;i<100;i++){
			if(i==2){
				count++;
			}else{
				int fac = 0;
				for(int j=2;j<i;j++){
					if(i%j==0){
						fac++;
					}
				}
				String s = Integer.toString(i);
				int correct = 0;
				for(int k=0; k<s.length();k++){
					if(s.length()%2==0){
						if(s.charAt(k) == s.charAt(s.length()-1)){
							correct = correct + 1;
							System.out.println(s);
							System.out.println(s.charAt(k) + " vs " + s.charAt(s.length()-1));
						}
					}
				}
				if(fac == 0 && i!=1 && correct%2!=0){
					count++;
					System.out.println(correct );
					System.out.println(i + " prime number");
				}
			}
		}
		System.out.println(count + "count");

	}
}
