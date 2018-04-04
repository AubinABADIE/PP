package Expressions;

import Phi.Phi;

public class PhiOfE extends E{
	
	E e;
	Phi phi;

	public PhiOfE(E e, Phi phi){
		this.e = e;
		this.phi = phi;
	}

	@Override
	public String toString() {
		return phi.toString()+"("+e.toString()+")";
	}

}
