package Expressions;


public class Inv extends UOP{

	Integer number;
	
	public Inv(Integer number){
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "-"+number;
	}

}
