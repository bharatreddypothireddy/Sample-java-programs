import java.util.Scanner;

public class Sortinsertion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int l = 0; l < x; ++l) {
            arr[l] = sc.nextInt();
        }
        sc.close();
for(int i=1;i<x;i++){
    int key=0;
    for(int j=0;j<i;j++){
        if(arr[i]<arr[j]){
            key=arr[i];
            int l=i;
            while(l>j){
            arr[l]=arr[l-1];
            l--;
        }
        arr[j]=key;
        }
    }
}
for(int l=0;l<x;l++)
    System.out.print(arr[l]+"  ");

    }}
