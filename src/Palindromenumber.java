package bharat;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
int y=0;
int rem=0;
int result=0;

for(int i =100;i<=999;i++) {
	for(int j=100;j<=999;j++) {
		int k=i*j;
		y=k;
		while(y/10!=0) {
			rem=y%10;
			y=y/10;
			x=(x+rem)*10;
			if(y<10)
				x=x+y;
		}
		if(x==k && x>result) {
			
			result=x;
			}
		x=0;
}

	}
System.out.println(result);
}}
