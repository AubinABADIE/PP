package Arguments;

import Types.Type;

public class Arg {

	String Id;
	Type type;
	
	public Arg(String Id, Type type){
		this.Id = Id;
		this.type = type;
	}
	
	public String toString(){
		return "("+Id+":"+type+")";
	}
	
}
