package BasicInterviewQuestion;

public class AddTwoArrayWithDifferentLength {
    public static void main(String[] args) {
        int [] a = {2,3,1,4,5};
        int [] b = {3,4,3,3};
        int maxLength = a.length;
        if (a.length<b.length) {
            maxLength = b.length;
        }
        for (int i = 0;i<maxLength;i++) {
            try {
                System.out.print(a[i]+b[i]+" ");
            } catch (Exception e) {
                if (a.length<b.length)
                    System.out.print(b[i]);
                else
                    System.out.print(a[i]);
            }
        }
    }
}