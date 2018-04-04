package Instructions;

import Expressions.E;

public class IfEThenEElseE {
	
	E e1;
	E e2;
	E e3;
	
	public IfEThenEElseE(E e1, E e2, E e3){
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}

	public String toString(){
		return "if "+e1+" then "+e2+" else "+e3;
	}
	
}
