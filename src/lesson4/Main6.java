package lesson4;

public class Main6 {
    public static void main(String[] args) {

        String text = "I am learning java";
        String text1 = text.replace( "i", "?");
        String text2 = text1.replace( "a", "?");
        String text3 = text2.replace( "e", "?");

        System.out.println(text3);


    }
}
