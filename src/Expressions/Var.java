package Expressions;


public class Var extends UOP{

	String var;
	
	public Var(String var){
		this.var = var;
	}
	
	@Override
	public String toString() {
		return var;
	}

}
