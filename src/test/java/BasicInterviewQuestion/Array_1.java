package BasicInterviewQuestion;

public class Array_1 {
    public static void main(String[] args) {
        int[] a ={5,3,0,4,1};
        int temp ;
        for (int i = 0;i<a.length;i++) {
            for (int j = i+1;j<a.length;j++) {
                if (a[i]<a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.print(a[i]+" ");
        }
    }
}
