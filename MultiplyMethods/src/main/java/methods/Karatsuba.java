package methods;

import java.math.BigInteger;

public class Karatsuba {
	
	public BigInteger karatsuba(BigInteger num1, BigInteger num2) {
		int positions = Math.max(num1.bitLength(), num2.bitLength());
		
		if (positions <= 1000) {
		    return num1.multiply(num2);
		}
		positions = positions / 2;

		BigInteger b = num1.shiftRight(positions);
		BigInteger a = num1.subtract(b.shiftLeft(positions));
		BigInteger d = num2.shiftRight(positions);
		BigInteger c = num2.subtract(d.shiftLeft(positions));
		
		BigInteger z0 = karatsuba(a, c); 
		BigInteger z1 = karatsuba(a.add(b), c.add(d)); 
		BigInteger z2 = karatsuba(b, d);

		BigInteger result = z1.subtract(z2).subtract(z0); 
		
		return z2.shiftLeft(2 * positions).add(result.shiftLeft(positions)).add(z0);
	}
	
}
