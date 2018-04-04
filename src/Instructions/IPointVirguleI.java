package Instructions;

import Expressions.E;

public class IPointVirguleI {
	
	I i1;
	I i2;
	
	public IPointVirguleI(I i1, I i2){
		this.i1 = i1;
		this.i2 = i2;
	}

	public String toString(){
		return i1+";"+i2;
	}
	
}
