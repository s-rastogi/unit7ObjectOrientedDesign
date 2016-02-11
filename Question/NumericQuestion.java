


public class NumericQuestion extends Question

{
    private double answer;
    // this is an example of method overloading.
    // this method overloads the setAnswer methods of the Question class
    public void SetAnswer( double correctResponse)
    {
        answer = correctResponse;
    }
    
    // this is an axample of methods overriding
    // this methods overrudes the checkAnswer method of the Question class
    public boolean checkAnswer( String response )
    { 
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - answer ) <= 0.01;

    }
    

}
