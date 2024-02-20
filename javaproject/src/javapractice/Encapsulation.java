package javapractice;

public class Encapsulation {
	public static void main(String[] args) {
		En e = new En();
		e.setAccno(919100412870l, 9182, 24);
		System.out.println(e.getAccno());
		System.out.println(e.getPkey());
		System.out.println(e.getBal());
	}

}

class En {
	private long accno;
	private int pkey;
	private int bal;

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno, int pkey, int bal) {
		this.accno = accno;
		this.pkey = pkey;
		this.bal = bal;
	}

	public int getPkey() {
		return pkey;
	}

	public int getBal() {
		return bal;
	}

}