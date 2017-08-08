package exercise;
import java.util.List;

public class ExpressionReader
{
    public Expression ReadToken(List<String> tokenList)
    {
        return ReadNextToken(tokenList);
    }

    private Expression ReadNextToken(List<String> tokenList)
    {
    	NumberExpression firstComponentExpression = new NumberExpression(tokenList.get(0));
    	NumberExpression secondComponentExpression = new NumberExpression(tokenList.get(2));
    	
    	if (tokenList.get(1).contains("+")){
    		return new AddExpression(firstComponentExpression, secondComponentExpression);
    	}else
    		return new SubtractExpression(firstComponentExpression, secondComponentExpression);	
    }
}