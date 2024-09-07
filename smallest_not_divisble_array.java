package accenture_questions;

public class smallest_not_divisble_array {
    public static int not_divisble(int[] arr,int k) {
        int count = 0;
        int num = 1;
        int sum = 0;

        while (count < k) {
            boolean isDivisble = false;
            for (int i = 0; i < arr.length; i++) {
                if (num % arr[i] == 0) {
                    isDivisble = true;
                    break;
                }
            }
            if (!isDivisble) {
                //System.out.println(num);
                sum = sum + num;
                count++;
            }
            num++;
        }
        return sum;
    }

    public static void main(String[] args){
            int[] arr = {2, 3, 4, 5, 6};
            System.out.println(not_divisble(arr, 4));
        }
}
