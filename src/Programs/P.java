package Programs;

import Declarations.D;
import Instructions.I;
import Types.Type;

public class P {

	String var;
	Type type;
	D d;
	I i;
	
	public P(String var, Type type, D d, I i) {
		this.var = var;
		this.type = type;
		this.d = d;
		this.i = i;
	}
	
	public String toString(){
		return "[var("+var+":"+type+")]"+"\n"+d+"\n"+i;
	}
}
