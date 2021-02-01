package EpamTask.calculator.Expression;

public class validator {
	public static boolean validateExp(Express exp) {
		if(exp==null)
			return false;
		return exp.getSign()!=null && exp.getFirst()!=null && exp.getSecond() !=null;
	}

}
