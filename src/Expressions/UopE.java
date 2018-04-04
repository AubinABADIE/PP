package Expressions;

import UOP.Uop;

public class UopE extends E{
	
	E e;
	Uop uop;

	public UopE(E e, Uop uop){
		this.e = e;
		this.uop = uop;
	}

	@Override
	public String toString() {
		return uop.toString()+e.toString();
	}

}
