package BasicInterviewQuestion;
//input --> Hi Hello Welcome
//output --> em oclew olleHiH
public class StringQuestion {
    public static void main(String[] args) {
        String st = "Hi Hello Welcome";
        String s = st.replace(" ",""); //HIHelloWelcome
        int j = s.length()-1;
        for (int i=0;i<st.length();i++) {
            if (st.charAt(i)!=' ')
                System.out.print(s.charAt(j--));
            else
                System.out.print(st.charAt(i));
        }
    }
}