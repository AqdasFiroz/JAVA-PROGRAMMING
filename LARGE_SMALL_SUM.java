package accenture_questions;

public class LARGE_SMALL_SUM {
    public static int largeSmallSum(int[] arr) {
        int SMaxE = Integer.MIN_VALUE;
        int FMaxE = Integer.MIN_VALUE;
        int SMaxO = Integer.MIN_VALUE;
        int FMaxO = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // Even index
                if (arr[i] > FMaxE) {
                    SMaxE = FMaxE;
                    FMaxE = arr[i];
                } else if (arr[i] > SMaxE && arr[i]!=FMaxE) {
                    SMaxE = arr[i];
                }
            } else { // Odd index
                if (arr[i] > FMaxO) {
                    SMaxO = FMaxO;
                    FMaxO = arr[i];
                } else if (arr[i] > SMaxO && arr[i]!=FMaxO) {
                    SMaxO = arr[i];
                }
            }
        }

        // If there is no valid second maximum in either case, return 0 (or handle as needed)
        if (SMaxE == Integer.MIN_VALUE || SMaxO == Integer.MIN_VALUE) {
            return 0; // This could also return -1 or another value to indicate no valid sum.
        }

        return SMaxE + SMaxO;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 7, 5, 4}; // Expected output: SMaxE = 3, SMaxO = 5 => Output: 8
        int[] arr2 = {1, 8, 0, 2, 3, 5, 6}; // Expected output: SMaxE = 3, SMaxO = 5 => Output: 8
        System.out.println(largeSmallSum(arr1)); // Output: 8
        System.out.println(largeSmallSum(arr2)); // Output: 8
    }
}
