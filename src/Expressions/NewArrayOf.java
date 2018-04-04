package Expressions;

//import Type.type;

public class NewArrayOf extends E{
	
	E e;
//	Type type;

	public NewArrayOf(E e){
		this.e = e;
//		this.type = type;
	}

	@Override
	public String toString() {
		return "new array of type ["+e.toString()+"]";
	}

}
