public class SearchingInMatrix {
    public static boolean stairCaseSearch(int matrix[][],int n){
        int i=matrix.length-1;
        int j=0;
        while(i>=0 && j< matrix.length){
            if(matrix[i][j]==n){
                System.out.println("The number is at index:["+i+","+j+"]");
                return true;
            }
            if(matrix[i][j]>n){
                i--;
            }
            else{
                j++;
            }
        }
        System.out.println("The number is not present in matrix");
        return false;
    }
    public static void search(int matrix[][],int n){
        int i=0;
        int j=3;
        while(matrix[i][j]!=n && i>=0 && j<=matrix.length-1){
            if(matrix[i][j]<n){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("The number is at index:["+i+","+j+"]");
    }

    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        search(matrix,14);
        stairCaseSearch(matrix,3);
        stairCaseSearch(matrix,14);
        stairCaseSearch(matrix,99);
    }
}
