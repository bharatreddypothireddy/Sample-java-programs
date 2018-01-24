import java.util.Scanner;

public class Sortbubble1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];

        int l;
        for(l = 0; l < x; ++l) {
            arr[l] = sc.nextInt();
        }

        sc.close();

        for(l = 0; l < x; ++l) {
            for(int j = 0; j < x - 1; ++j) {
                int dud = arr[j];
                int yam = arr[j + 1];
                if (arr[j] > arr[j + 1]) {
                    arr[j + 1] = dud;
                    arr[j] = yam;
                }

                dud = 0;
                yam =0;
            }
        }

        for(l = 0; l < x; ++l) {
            System.out.print(arr[l] + "  ");
        }

    }
}
