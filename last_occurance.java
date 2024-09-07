public class last_occurance {
        public static int lo(int a[],int n,int i){
            if(i==a.length){
                return -1;

            }
            int isfound=lo(a,n,i+1);
            if(a[i]==n && isfound==-1 ){
                return i;
            }

                return isfound;
        }

        public static void main(String[] args) {
            int[] arr1={1,2,3,4,5,6};
            int arr2[]={2,4,6,1,8,9};
            int arr3[]={9,9,9,9};
            System.out.println(lo(arr1,5,0));
            System.out.println(lo(arr2,9,0));
            System.out.println(lo(arr1,10,0));
            System.out.println(lo(arr3,9,0));
        }
    }

