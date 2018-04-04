package Instructions;

import Expressions.E;

public class EofEEqualsE {
	
	E e1;
	E e2;
	E e3;
	
	public EofEEqualsE(E e1, E e2, E e3){
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}

	public String toString(){
		return e1+"["+e2+"]"+":="+e3;
	}
	
}
