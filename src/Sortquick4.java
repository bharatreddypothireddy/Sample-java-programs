import java.util.Scanner;

public class Sortquick4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int l = 0; l < x; ++l) {
            arr[l] = sc.nextInt();
        }
        sc.close();
        int start = 0;
        int end = x-1;
        sort(arr,start,end);
        for(int z=0;z<=end;z++) {
            System.out.println(arr[z]);
        }
}
 static void sort(int arr[],int start,int end){
        if(start<end){
       int pindex = partition(arr,start,end);

       sort(arr,start,pindex-1);
       sort(arr,pindex+1,end);


 }}
static int partition(int arr[],int start,int end){
 int pindex = start-1;
 int pivot = arr[end];
 for(int j=start;j<end;j++){
     if(arr[j]<=pivot){
       pindex++;
       int temp = arr[pindex];
       arr[pindex]=arr[j];
       arr[j]=temp;
     }
 }
 int temp = arr[pindex+1];
 arr[pindex+1]=pivot;
 arr[end]=temp;
 return pindex+1;
}

}
