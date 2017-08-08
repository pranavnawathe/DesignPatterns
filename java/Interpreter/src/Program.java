package exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program
{
    public static void main(String[] args)
    {
    	// create an add expression
        String tokenString = "2 + 3";
        String[] tokens = tokenString.split(" ");
        List<String> tokenList = new ArrayList<String>(Arrays.asList(tokens));
        
        ExpressionReader reader = new ExpressionReader();
        Expression expression = reader.ReadToken(tokenList);
        System.out.println(tokenString);
        System.out.println(expression.interpret()); 
        
        // create an subtract expression
        tokenString = "8 - 2";
        tokens = tokenString.split(" ");
        tokenList = new ArrayList<String>(Arrays.asList(tokens));
        expression = new ExpressionReader().ReadToken(tokenList);
        System.out.println(tokenString);
        System.out.println(expression.interpret());
    }
}