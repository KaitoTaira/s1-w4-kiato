public class Name {

    private String myFirst;
    private String myMiddle;
    private String myLast;
    
    public Name (String first, String middle, String last) {
       myFirst = fixCase(first);
       myMiddle = fixCase(middle);
       myLast = fixCase(last);
       fixCase (myFirst);
       fixCase (myMiddle);
       fixCase (myLast);
    }
    
    public String lastFirst ( ) {
       return myLast + ", " + myFirst + " " + myMiddle;
    }
    
    public String fullName ( ) {
       return myFirst + " " + myMiddle + " " + myLast;
    }

    private String fixCase(String namePart){
      namePart = namePart.toLowerCase().trim();
      namePart = namePart.substring(0,1).toUpperCase() + namePart.substring(1);
      return namePart;
    }
    
    // bad style
    private void fixFirst ( ) {
       myFirst = myFirst.toLowerCase().trim();
       myFirst = myFirst.substring(0,1).toUpperCase() + myFirst.substring(1);
    }
    
    // bad style
    private void fixMiddle ( ) {
       myMiddle = myMiddle.toLowerCase().trim();
       myMiddle = myMiddle.substring(0,1).toUpperCase() + myMiddle.substring(1);
    }
    
    // bad style
    private void fixLast ( ) {
       myLast = myLast.toLowerCase().trim();
       myLast = myLast.substring(0,1).toUpperCase() + myLast.substring(1);
    }
 
 }