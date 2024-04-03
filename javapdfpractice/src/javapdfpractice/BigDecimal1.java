package javapdfpractice;

import java.math.BigDecimal;

public class BigDecimal1 {
	public static void main(String[] args) {
		BigDecimal b = new BigDecimal(10.000);
		System.out.println(b.abs());
		System.out.println(b.compareTo(new BigDecimal(6)));
		
		float f=10000.0f;
		for(int i=0;i<1000;i++) {
			f-=1.99f;
		}
		System.out.println(f);
		BigDecimal c=new BigDecimal(10000);
		BigDecimal d =new BigDecimal(1.99);
		for(int i=0;i<1000;i++) {
			c=c.subtract(d);
		}
		System.out.println(String.format("Account balance after BigDecimal operations: %f",
				c));
		BigDecimal g = new BigDecimal(15.15);

				
	}

}
