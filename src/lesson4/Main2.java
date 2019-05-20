package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String text = "qwertyihh";

        char[] symbolsFromtext = text.toCharArray();

        for(int i=0; i<symbolsFromtext.length;i++){

            if(symbolsFromtext[i] == 'a' || symbolsFromtext[i] == 'o' || symbolsFromtext[i] == 'e'){
                char result = symbolsFromtext[i];

                System.out.println(result);
            }



        }
    }
}
