// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int findPassWord(int input1,int input2,int input3,int input4,int input5){
        int[] inputs={input1,input2,input3,input4,input5};
        int stable=0;
        int unStable=0;
        for(int nums:inputs){
            if(isStable(nums)){
                stable=stable+nums;
            }
            else{
                unStable=unStable+nums;
            }
        }
        return (stable-unStable);

    }
    public static boolean isStable(int input){
        int[] digitCount=new int[10];
        while(input!=0){
            int digit=input%10;
            digitCount[digit]=digitCount[digit]++;
        }
        for(int i=0;i<digitCount.length;i++){
            if(digitCount[i]%2!=0 || digitCount[i]%2!=1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(findPassWord(12,1313,122,678,898));
    }
}