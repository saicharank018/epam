package EpamTask.calculator.Expression;

public enum operator {
	MINUS('-'),PLUS('+'),MUL('*'),DIV('/');
	private char sign;
	operator(char sign){
		this.sign=sign;
	}
	public char getSign() {
		return sign;
	}

}
