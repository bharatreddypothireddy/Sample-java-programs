package bharat;

public class Prime10001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int count=0;
int y=0;
for(int x=2;count<10001;x++) {
	if(prime(x)) {
		count=count+1;}
	if(count==10001) {
		y=x;
		break;}
	
	
}
System.out.println(y);
}
	static boolean prime(int i) {
		int k=i;
		boolean b = true;
		for(int j=2;j<k;j++) {
		if(k%j==0) {
			b=false;
            break;
		
		}
		}
		return b;
	}
}