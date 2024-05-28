package BasicInterviewQuestion;

public class FrequencyOfANumber {
    public static void main(String[] args) {
        int [] a = {3,1,2,1,5,1};
        int max = 0;
        int val = 0;
        for (int i = 0 ;i<a.length;i++) {
            int count = 0;
            for (int j = 0;j<a.length;j++) {
                if (a[i]==a[j])
                    count++;
            }
            if (count>max) {
                max = count;
                val = a[i];
            }
        }
        System.out.println(val+" "+max);
    }
}
