package Homework.lesson4;

public class Task1 {
    public static void main(String[] args) {

        String text = "I am learning Java ";

        String text2 = new StringBuffer(text).reverse().toString();
        System.out.println(text);
        System.out.println(text2);
    }
}