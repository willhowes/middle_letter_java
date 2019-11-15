package app;

class Kata {
    public static String getMiddle(String word) {
        String wordAsArray[] = word.split("");
        int wordLength = wordAsArray.length;
        if (wordLength % 2 == 1) {
            return wordAsArray[wordLength / 2];
        } else {
            return String.format("%s%s", wordAsArray[wordLength / 2 - 1], wordAsArray[wordLength / 2]);
        }
    }
}