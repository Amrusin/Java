package BasicInterviewQuestion;

public class ReversePrintNumber {
    public static void main(String[] args) {
        String s = "abc1234bd45ef5gh6789";
        String num = "";
        for (int i = 0;i<s.length();i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                num +=s.charAt(i);
            } else {
                num +=" ";
            }
        }
        String[] number = num.split("\\s+");
        for (int i=number.length-1;i>=0;i--) {
            System.out.print(number[i]+" ");
        }
    }
}
