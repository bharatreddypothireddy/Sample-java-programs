package bharat;

public class Sumofprimesbelow2million {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 2l;
		for(int i=3;i<2000000;i++) {
			if(prime(i))
				result=result+(long)i;
		}
		System.out.println(result);
		}

		static boolean prime(int i ) {
			int p =i;
			boolean b=true;
			for(int z=2;z<=Math.sqrt(p);z++) {
				if(p%z==0) {
					b=false;
					break;
				}
				
			}
			return b;
	}}
