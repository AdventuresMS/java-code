package Recursion;

public class FunctionCalls {
    public static void mango(){
        System.out.println("Hii I am mango");
    }
    public static void banana(){
        System.out.println("Hii I am Banana");
        mango();
    }
    public static void apple(){
        System.out.println("Hii I am an apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("Hii i am fruit");
        apple();
    }
    
}
