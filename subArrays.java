public class subArrays {
    public static void subArray(int a[]){
        int maxSum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(" "+ a[k]);
                    sum=sum+a[k];

                }
                System.out.print("\n Sum of subarray is :\n "+sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("The maximum sum of subarrays is :"+maxSum);
    }

    public static void main(String[] args) {
        int a[]={2,4,5,6,-7};
        subArray(a);
    }
}
