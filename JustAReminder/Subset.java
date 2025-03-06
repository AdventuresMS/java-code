public class Subset {
    public static void printSubsets(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return ;
        }
        char ch = s.charAt(i);
        printSubsets(i+1, s, ans+ch);
        printSubsets(i+1, s, ans);

    }
    public static void main(String[] args) {
        String s = "abcd";
        printSubsets(0, s,"");

    }
    
}
