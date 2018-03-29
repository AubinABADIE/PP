package Exponential;


public class EOfE extends E{
	
	E e1;
	E e2;

	public EOfE(E e1, E e2){
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public String toString() {
		return e1.toString()+"["+e2.toString()+"]";
	}

}
