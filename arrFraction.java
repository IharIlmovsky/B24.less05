package by.epam.jb24.less05.hometask;

import java.lang.*;
import java.util.Random;

public class arrFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction[] fractArray;		
		Random rand = new Random() ;
		int k = 5;
		fractArray = new Fraction[k];
		
		for (int i =0; i <k; i++ ) {
			//System.out.print("fraction: "+i);
			
			int v_num = rand.nextInt(10);
			int v_den = rand.nextInt(10);
			fractArray[i] = new Fraction(v_num, v_den);
			//System.out.println(" created");
		}

		for( Fraction theFraction : fractArray) {
			theFraction.printFraction(true);
		}
		
	}

}
