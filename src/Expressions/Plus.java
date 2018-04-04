package Expressions;

public class Plus extends Bop{

	Integer number1;
	Integer number2;
	
	public Plus(Integer number1, Integer number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public String toString() {
		return number1.toString() + "+" + number2.toString();
	}

}
