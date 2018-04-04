package Expressions;


public class Not extends UOP{

	Integer number;
	
	public Not(Integer number){
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "not "+number;
	}

}
