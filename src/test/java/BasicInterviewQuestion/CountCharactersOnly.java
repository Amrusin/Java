package BasicInterviewQuestion;

public class CountCharactersOnly {
    public static void main(String[] args) {
        String s = "In d ia";
        String str = s.replace(" ","");
        System.out.println(str.length());
        System.out.println("---------------------");
        int count = 0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)!=' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}