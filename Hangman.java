    public class Hangman{
    private String wordToBeGuessed = "witch";
    private String userString = "_____";

    public void update(String letterGuessed){
        int letterIndex = wordToBeGuessed.indexOf(letterGuessed);
        userString = userString.substring(0,letterIndex) + letterGuessed + userString.substring(letterIndex + 1);
    } 

    public String getUserString(){
        return userString;
    }
    }
         
