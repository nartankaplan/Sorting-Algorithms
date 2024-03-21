import java.util.Random;
public class SelectionSort {
    public static void main(String[] args) {
        int n = 3133456;
        int[] randomArray = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            randomArray[i] = rand.nextInt(3133456);
        }
        long start = System.currentTimeMillis();
        sort(randomArray);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish-start;
        System.out.println(timeElapsed);
    }
    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx=i;
            for(int j = i+1;j<n;j++)

                if(arr[j]<arr[min_idx])
                    min_idx=j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i]=temp;
        }
    }
}
