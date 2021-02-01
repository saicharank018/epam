package EpamTask.calculator.Expression;

import java.math.BigDecimal;
public class Express {
	private BigDecimal first,second;
	private operator sign;
	public BigDecimal getFirst() {
		return first;
	}
	public BigDecimal getSecond() {
		return second;
	}
	public operator getSign() {
		return sign;
	}
	public Express setFirst(BigDecimal first) {
			this.first=first;
			return this;
		}
	public Express setSecond(BigDecimal second) {
		this.second=second;
		return this;
	}
	public Express setSign(operator sign) {
		this.sign=sign;
		return this;
	}
	public String toString() {
		return ""+first+" "+sign.getSign()+" "+second;
	}

}
