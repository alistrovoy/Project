package lesson8;

public class Methods {

    public static String getEqualChars(String text1, String text2) {
        String result = "";
        char[] charsFromTex1 = text1.toCharArray();
        char[] charsFromText2 = text2.toCharArray();

        for (int i = 0; i < charsFromTex1.length; i++) {
            for (int j = 0; j < charsFromText2.length; j++) {
                if (charsFromTex1[i] == charsFromText2[j]) {
                    result += charsFromTex1[i];
                    break;

                }

            }

        }
        return result;

    }


    public static int summaChiselBy5(int massive[]) {
        int Sum = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 5 == 0) {
                Sum += massive[i];
            }
        }
        return Sum;
    }


    public static String getNumsEqual(String text1, String text2) {
        String calculate = " ";
        char[] fromStringToChars1 = text1.toCharArray();
        char[] fromStringToChars2 = text2.toCharArray();
        for (int i = 0; i < fromStringToChars1.length; i++) {
            for (int j = 0; j < fromStringToChars2.length; j++) {
                if (fromStringToChars1[i] == fromStringToChars2[j]) {
                calculate+=fromStringToChars1[i];
                break;

                }
            }
        }
        return calculate;
    }
}
