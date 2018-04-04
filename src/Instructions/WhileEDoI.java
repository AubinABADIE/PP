package Instructions;

import Expressions.E;

public class WhileEDoI {
	
	I i;
	E e;
	
	public WhileEDoI(I i, E e){
		this.i = i;
		this.e = e;
	}

	public String toString(){
		return "while "+e+" do "+i;
	}
	
}
