package lesson4;

public class Main5 {
    public static void main(String[] args) {

        String text = "I,a!m,le!arning!,java ";
        String text1 = text.replace(",", " ");
        String text2 = text1.replace(" ", " ");
        String text3 = text2.replace("!", " ");

        String[] words = text3.split( " ");

            for(String currentText : words){
                System.out.println(currentText);



            }
        }
    }

