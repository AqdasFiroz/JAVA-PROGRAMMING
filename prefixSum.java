public class prefixSum {
    public static void prefix(int a[]){
        int sum=0;
        int maxSum=0;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int a[]={2,4,5,6,-7};
        prefix(a);
    }
}
