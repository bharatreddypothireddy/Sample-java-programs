import java.util.Scanner;

public class Sortmerge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] A = new int[x];
        for(int l = 0; l < x; ++l) {
            A[l] = sc.nextInt();
        }
        sc.close();
        int low=0;
        int high=A.length;
        sort(A,low,high-1);
        for(int z=0;z<high;z++) {
            System.out.println(A[z]);
        }

}
static void sort(int A[],int l,int h){
        if(l<h){
            int m=(l+h)/2;
            sort(A,l,m);
            sort(A,m+1,h);

            merge(A,l,m,h);
        }
}

    private static void merge(int[] A, int l, int m, int h) {
           int n1=m-l+1;
           int n2=h-m;
           int L[]=new int[n1];
           int R[]=new int[n2];
           for(int i=0;i<n1;i++)
               L[i]=A[l+i];
           for(int j=0;j<n2;j++)
               R[j]=A[m+1+j];
           int i=0;int j=0;int k=l;
           while(i<n1 && j<n2){
               if(L[i]<=R[j]){
                   A[k]=L[i];
                   i++;
               }
               else{
                   A[k]=R[j];
                   j++;
               }
               k++;
           }
           while(i<n1){
               A[k]=L[i];
               i++;
           }
           while(j<n2){
               A[k]=R[j];
               j++;
           }

    }


}
