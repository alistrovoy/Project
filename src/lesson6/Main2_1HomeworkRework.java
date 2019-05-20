package lesson6;

public class Main2_1HomeworkRework {
    public static void main(String[] args) {

        String text1 = "I am student";
        String text2 = "I am teacher";

        for(int i = 0; i<text1.length();i++){
            for(int j = 0; j < text2.length(); j++){
                if (text1.charAt(i) == text2.charAt(j) && text1.charAt(i) !=' '){

                    System.out.println(text1.charAt(i));

                    break;


                }
            }
        }
    }
}
