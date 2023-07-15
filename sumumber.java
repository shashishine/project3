package Dynamic;

public class sumumber {
 static int num(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum = sum+rem*rem;
		no=no/10;
	}
	return sum;
}
 public static void main(String[] args) {
	int no=628;
	no=num(no);
	System.out.println(no);
}
}
