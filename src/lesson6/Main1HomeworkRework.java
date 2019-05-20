package lesson6;

public class Main1HomeworkRework {
    public static void main(String[] args) {

        String text = "I am, student!!";

        char[] charsFromText = text.toCharArray();

        int countGlas = 0;
        int countSoglas = 0;
        int countSymbols = 0;


        for (int i = 0; i < charsFromText.length; i++) {
            char currentChar = charsFromText[i];
            if (currentChar == ' ') {
                continue;
            } else if (currentChar == 'a' || currentChar == 'o' || currentChar == 'i' || currentChar == 'u' || currentChar == 'e' ||
                    currentChar == 'A' || currentChar == 'O' || currentChar == 'I' || currentChar == 'U' || currentChar == 'E') {

                countGlas++;

            } else if (currentChar == ',' || currentChar == '!' || currentChar == '?' || currentChar == ':' || currentChar == ';' ||
                    currentChar == '-') {

                countSymbols++;


            } else {
                countSoglas++;

            }
        }
        System.out.println(countGlas);
        System.out.println(countSymbols);
        System.out.println(countSoglas);

    }
}
