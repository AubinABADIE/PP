package Expressions;

public class Or extends Bop{

	Integer number1;
	Integer number2;
	
	public Or(Integer number1, Integer number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public String toString() {
		return number1 + "or" + number2;
	}

}
