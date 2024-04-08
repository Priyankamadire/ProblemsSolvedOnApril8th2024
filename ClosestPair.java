import java.util.*;

public class ClosestPair {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int brr[] = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        solve(arr, brr, k);
    }

    public static void solve(int arr[], int brr[], int k) {
        int n = arr.length;
        int m = brr.length;
        int i = 0, j = m - 1;
        int minDiff = Integer.MAX_VALUE;
        int res_ar1 = -1, res_ar2 = -1;

        while (i < n && j >= 0) {
            int sum = arr[i] + brr[j];
            int diff = Math.abs(sum - k);
            if (diff < minDiff) {
                minDiff = diff;
                res_ar1 = arr[i];
                res_ar2 = brr[j];
            }
            if (sum > k) {
                j--;
            } else {
                i++;
            }
        }

        System.out.print("The closest pair is [" + res_ar1 + ", " + res_ar2 + "]");
    }
}
