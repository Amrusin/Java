package BasicInterviewQuestion;

// input --> carbustraincarbustrainbus
//output bus--> 3 times
public class CountWordInAString {
    public static void main(String[] args) {
        String s = "CarbustrainCarbustrainbus";
        String str[] = s.split("bus");
        System.out.println(str.length);
    }
}
