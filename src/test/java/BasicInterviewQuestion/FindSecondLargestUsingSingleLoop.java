package BasicInterviewQuestion;

public class FindSecondLargestUsingSingleLoop {
    public static void main(String[] args) {
        int[] a = {1,5,6,4,6,2,3,3,2};
        int max = a[0];
        int secondMax = 0;
        for (int i = 0; i<a.length;i++) {
            if (a[i]>max) {
                secondMax = max;
                max = a[i];
            }
            else if (a[i]<max && a[i]>secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}