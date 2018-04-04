package Arguments;

import Types.Type;

public class Arg {

	String var;
	Type type;
	
	public Arg(String var, Type type){
		this.var = var;
		this.type = type;
	}
	
	public String toString(){
		return "("+var+":"+type+")";
	}
	
}
