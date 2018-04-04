package Expressions;

public class K extends E{
	
	Constants.K k;

	public K(Constants.K k){
		this.k = k;
	}

	@Override
	public String toString() {
		return k.toString();
	}

}
