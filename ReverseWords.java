public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Daksh Sharma";
        String[] words = sentence.split(" ");
        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
