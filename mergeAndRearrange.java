package accenture_questions;

public class mergeAndRearrange {
    public static String reArranging(String input1, String input2) {
        int strLength = input1.length() + input2.length();
        String str = "";
        int ind = 0;
        char[] array = new char[strLength];
        if (input1.length() > input2.length()) {
            for (int i = 0; i < input2.length(); i++) {
                if (input1.charAt(i) < input2.charAt(i)) {
                    array[i] = input1.charAt(i);
                    array[strLength - 1 - i] = input2.charAt(i);
                } else {
                    array[i] = input2.charAt(i);
                    array[strLength - 1 - i] = input1.charAt(i);
                }
                ind = i;
            }
            ind=ind+1;
            while ((ind) < input1.length()) {
                array[ind] = input1.charAt(ind);
                ind++;
            }
        }
        if (input1.length() < input2.length()) {
            for (int i = 0; i < input1.length(); i++) {
                if (input1.charAt(i) < input2.charAt(i)) {
                    array[i] = input1.charAt(i);
                    array[strLength - 1 - i] = input2.charAt(i);
                } else {
                    array[i] = input2.charAt(i);
                    array[strLength - 1 - i] = input1.charAt(i);
                }
                ind = i;
            }
            ind=ind+1;
            while ((ind ) < input2.length()) {
                array[ind] = input2.charAt(ind);
                ind++;
            }
        }
        for (int i = 0; i < strLength; i++) {
            str = str + array[i];
        }
        return str;
    }

    public static void main(String[] args) {
        String a="are";
        String b="denim";
        System.out.println(reArranging(a,b));
    }
}
