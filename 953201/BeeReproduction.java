class BeeReproduction{
	public static void main(String[] args){
		int n = 4;
		int q = 1;
		int s = 0;
		int w = 1;
		for(int i=0;i<n;i++){
			int change = 0;
			change = change + w;
			w = w + 1;
			if(s != 0){
				w = w + s;
				s = 0;
			}
			if(w != 0){
				s = s + change; 
			}
		}
		System.out.println("Queen: " + q + " Soldier: " + s + " Worker: " + w);
	}
}	

