package BasicInterviewQuestion;

public class BubbleSortAscendingOrder {
    public static void main(String[] args) {
        int[] a = {5, 3, 0, 4, 1};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i]+" ");
        }
//        for (int num : a) {
//            System.out.print(num+" ");
    }
}
