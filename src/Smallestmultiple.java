package bharat;

public class Smallestmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x=21;
 
 int count=0;
 boolean b=true;
 while(b) {
	for(int i=2;i<=20;i++) {
		 if(x%i!=0)
			 count=count+1;}
		
	 
	 if(count==0) {
		 System.out.println(x);
		 b=false;
	 }
		 x=x+1;
		 count=0;
	 
 }
}
}