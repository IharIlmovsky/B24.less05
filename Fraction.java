package by.epam.jb24.less05.hometask;

import java.lang.*;

public class Fraction {
	
	private int numerat;
	private int denom;

	public Fraction(int _num, int _denom) {
		numerat = _num;
		denom = _denom;
	}
	
	public double getFractionValue() {
		double value = 0.0;
		value = (getNumerat() * 1.0) / getDenom();
		return value;
	}
	
	public int getNumerat() {
		return numerat;
	}

	public void setNumerat(int _num) {
		this.numerat = _num;
	}

	public void setDenom(int _denom) {
		this.denom = _denom;
	}
	
	public boolean isFractionValid() {
		if (Math.abs( getDenom()) < 1E-9) {
		    return false; }	
		
		try {
			double tmp = getNumerat() / getDenom();
			return true; }		
		catch (NumberFormatException e) {
	    	System.out.printf(" значение '%f' неверно для знаменателя \n", getDenom());
	    	return false; }
	}
	
	public int getDenom() {
		return denom; }
	
	public void printFraction(boolean isCRLF) {
		if (isFractionValid()) {
			String fmt = "%d/%d=%f";
			if (isCRLF) {
				fmt = fmt + '\n';
			} else fmt = fmt + ' ';
			
			double value = getFractionValue();
  			System.out.printf( fmt, getNumerat(), getDenom(), value);
	    }
	}	
}
