package Types;
public class ArrayOf extends Type{
	
	Type type;

	public ArrayOf(Type type){
		this.type = type;
	}
	
	@Override
	public String toString(){
		return "array of "+type.toString();
	}
	
}
