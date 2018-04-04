package Expressions;


public class UopE extends E{
	
	E e;
	UOP uop;

	public UopE(E e, UOP uop){
		this.e = e;
		this.uop = uop;
	}

	@Override
	public String toString() {
		return uop.toString()+e.toString();
	}

}
