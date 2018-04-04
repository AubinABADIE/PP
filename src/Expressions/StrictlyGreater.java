package Expressions;

public class StrictlyGreater extends Bop{

	Integer number1;
	Integer number2;
	
	public StrictlyGreater(Integer number1, Integer number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public String toString() {
		return number1 + ">" + number2;
	}

}
