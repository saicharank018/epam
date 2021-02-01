package EpamTask.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import EpamTask.calculator.Expression.calci;
import EpamTask.calculator.Expression.Express;
import java.security.InvalidParameterException;
public class Application {
	private void startApp() {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				String str=reader.readLine();
				Express exp=parser.parse(str);
				if(exp==null) {
					throw new InvalidParameterException("Invalid Expression");
				}
				System.out.println("Enter Expression  : "+exp);
				System.out.println("Answer for Expression              : "+calci.calculateExp(exp));
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	public void start() {
		startApp();
	
}
}
