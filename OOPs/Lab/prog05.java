// Write a program in java to find maximum and minimum occuring character in a string.

class CheckString {
    private String str;
    private int[] arr;

    CheckString(String str) {
        this.str = str;
        arr = new int[26];
        this.count();
    }

    private void count() {
        for (char i : str.toCharArray()) {
            int j = (int) i;
            if(j>=65 && j<=90)
                arr[j-65] += 1;
            else if(j>=97 && j<=122)
                arr[j-97] += 1;
            else
                ;
        }
    }

    char max() {
        int x = 0;
        for(int i=1; i<26; i++) {
            if(arr[x] < arr[i])
                x = i;
        }
        return (char)(x+97);
    }

    char min() {
        int x = 0;
        for(int i=1; i<26; i++) {
            if(arr[x] > arr[i] && arr[i] > 0)
                x = i;
        }
        return (char)(x+97);
    }
}

public class prog05 {
    public static void main(String[] args) {
        CheckString obj = new CheckString("JaiShreeRam");
        System.out.println("Maximum occuring character : " + obj.max());
        System.out.println("Minimum occuring character : " + obj.min());
    }
}
