package Expressions;

public class EBopE extends E{
	
	E e1;
	E e2;
	Bop bop;

	public EBopE(E e1, Bop bop, E e2){
		this.e1 = e1;
		this.e2 = e2;
		this.bop = bop;
	}

	@Override
	public String toString() {
		return e1.toString()+bop.toString()+e2.toString();
	}

}
