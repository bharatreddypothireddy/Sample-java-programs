package bharat;

public class EvenFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= 1;
int y =2;
int count = 2;
for(int i =1;i<4000000;i=y) {
	x=x+y;
	if(x%2==0)
		count= count+x;
	y=x+y;
	if(y%2==0)
		count=count+y;
}
System.out.println(count);
	}

}
