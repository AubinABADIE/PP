package Instructions;

import Expressions.E;

public class While {
	
	I i;
	E e;
	
	public While(I i, E e){
		this.i = i;
		this.e = e;
	}

	public String toString(){
		return "while "+e+" do "+i;
	}
	
}
