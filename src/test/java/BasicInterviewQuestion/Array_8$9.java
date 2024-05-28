package BasicInterviewQuestion;

public class Array_8$9 {
    public static void main(String[] args) {
        int a [] = {5,3,0,4,1};
        int smallest = a[0];
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (smallest>a[i])
                smallest = a[i];
            else if (largest<a[i])
                largest = a[i];
        }
        System.out.println("Smallest "+smallest);
        System.out.println("Largest "+largest);
    }
}
