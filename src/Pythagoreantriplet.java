package bharat;

public class Pythagoreantriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i =1;i<1000;i++) {
	for(int j=1;j<1000;j++) {
		for(int k=1000;k>1 && k>i && k>j;k--) {
			if(i+j+k==1000) {
				if(i*i+j*j==k*k) {
					System.out.println(i*j*k);
				System.out.println(i+"  "+j+"   "+k);
			}}
		}
	}
}
	}

}
