package bharat;


public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		 int dev=0;
long req =  600851475143L;
for(long i =2l;i<Math.sqrt(req);i++) {
	if(req%i==0) {
		
	if(prime(i))
		dev=(int)i;
	
	}
	
		
}
System.out.println(dev);
	}

	static boolean prime(long i ) {
		long p =i;
		boolean b=true;
		for(long z=2l;z<p/2l;z++) {
			if(p%z==0) {
				b=false;
				break;
			}
			
		}
		return b;
}}