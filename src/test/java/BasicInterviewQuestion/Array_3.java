package BasicInterviewQuestion;

public class Array_3 {
    public static void main(String[] args) {
        int a [] = {5,3,0,4,1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[a.length-1]+a[a.length-2]+a[a.length-3]);
    }
}
