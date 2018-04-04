package Expressions;


public class Inv extends E{

	Integer number;
	
	public Inv(Integer number){
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "-";
	}

}
