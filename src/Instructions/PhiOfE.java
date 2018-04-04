package Instructions;

import Expressions.E;
import Phi.Phi;

public class PhiOfE {
	
	Phi phi;
	E e;
	
	public PhiOfE(Phi phi, E e){
		this.phi = phi;
		this.e = e;
	}

	public String toString(){
		return phi+"("+e+")";
	}
	
}
