package Dynamic;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("enter");
		int S = x.nextInt();
		int E = x.nextInt();
		int count= 0;
		for(int i = S; i<=E; i++){
			for(int j = 2; j<i; j++){
				if(i%j!=0){
					count++;
				}
				if(S==1){
					System.out.println("count");
				}else{
					System.out.println("count");
				}
			}
		}
	}
}
