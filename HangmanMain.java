public class HangmanMain {
    public static void main(String[] args) {
        Hangman h = new Hangman();
        h.update("c");
        System.out.println(h.getUserString());
}
}