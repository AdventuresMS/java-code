public class SkipACharacter {
    public static void skip(int i, String s, String ans) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != 'a') {
            skip(i + 1, s, ans + s.charAt(i)); 
        } else {
            skip(i + 1, s, ans); 
        }
    }

    public static void main(String[] args) {
        String s = "Monika";
        skip(0, s, ""); 
    }
}
