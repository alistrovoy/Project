package Homework.lesson4;

public class Task4 {
    public static void main(String[] args) {

        char[] massiveQWER = {'q', 'w', 'e', 'r'};
        char[] massiveABCD = {'a', 'b', 'c', 'd'};

        char[] BIGmassiveQWER = {'q', 'w', 'e', 'r'};
        char[] BIGmassiveABCD = {'A', 'B', 'C', 'D'};



        String text = "Are you ready to start studying of programmingqw?";
        char[] textmassive = text.toCharArray();

        for (int i =0; i<text.length(); i++ ){
            for(int j =0; j<massiveABCD.length; j++){

                if (textmassive[i] == massiveABCD[j]){
                    textmassive [i] = massiveQWER[j];


                }
            }

        }
        for (int i =0; i<text.length(); i++ ) {
            for (int j = 0; j < massiveABCD.length; j++) {

                if (textmassive[i] == BIGmassiveABCD[j]) {
                    textmassive[i] = BIGmassiveQWER[j];
                }
            }
        }
        System.out.println(textmassive);


    }
}
