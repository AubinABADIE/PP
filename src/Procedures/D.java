package Procedures;

import Arguments.Arg;
import Instructions.I;
import Types.Type;

public class D {
	
	String var1;
	String var2;
	Arg arg;
	Type type1;
	Type type2;
	I i;

	public D(String var1, String var2, Arg arg, Type type1, Type type2, I i) {
		this.var1 = var1;
		this.var2 = var2;
		this.arg = arg;
		this.type1 = type1;
		this.type2 = type2;
		this.i = i;
	}

	public String toString(){
		return var1+"("+arg+")["
	}
}
