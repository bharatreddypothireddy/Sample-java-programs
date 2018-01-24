package bharat;

public class Sumsquaredifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sos=0;

int sum=0;
for(int i=1;i<=100;i++) {
	sos=sos+(i*i);
	sum=sum+i;
}
int squareofsum=(sum*sum);
System.out.println(squareofsum+" - "+sos+" = "+(squareofsum-sos));
	}
}