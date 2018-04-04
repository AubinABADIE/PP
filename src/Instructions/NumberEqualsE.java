package Instructions;

import Expressions.E;

public class NumberEqualsE {
	
	Integer number;
	E e;
	
	public NumberEqualsE(Integer number, E e){
		this.number = number;
		this.e = e;
	}

	public String toString(){
		return number+":="+e;
	}
	
}
