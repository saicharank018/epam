package EpamTask.calculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import EpamTask.calculator.Expression.Express;
import EpamTask.calculator.Expression.operator;

public class parser {
	private static final Map<Character,operator> operators =new HashMap<Character,operator>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		put('-',operator.MINUS);
		put('+',operator.PLUS);
		put('/',operator.DIV);
		put('*',operator.MUL);
	}};
	public static Express parse(String str) {
		str=str.trim();
		String numPattern="([-+]?[0-9]*.?[0-9]+)";
		String signPattern="([//s]*[+\\-/*][//s]*)";
		Pattern pattern=Pattern.compile("^"+numPattern+signPattern+numPattern+"$");
		Matcher matcher=pattern.matcher(str);
		if(matcher.find()) {
			Express exp = new Express();
			exp.setFirst(new BigDecimal(matcher.group(1)));
			exp.setSecond(new BigDecimal(matcher.group(3)));
			exp.setSign(operators.get(matcher.group(2).trim().charAt(0)));
			System.out.println(exp);
			return exp;
		}
		return null;
	}

}
