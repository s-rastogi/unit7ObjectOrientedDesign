import java.util.Scanner;

/* this class support a fill-in-the blank question where the answer is specified in the
 * question's text delimited by '_'. This class extracts the answer from the question's text
 * and stores the text and answer accordingly
 */
public class FillinQuestion extends Question
    {/* Extracts he answer from the specified question text. For example:
     * The inventor of Java was - James Gosling_."
     * 
     * text: "The inventor of Java was _____."
     * amswer: "James Gosling
     */
    public void setText( String questionText)
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += " _______" + parser.next();
        
        setText( question );
        setAnswer( answer );
    
    }
}
