package javapractice;

public class InstanceVariable3 {
	public static void main(String[] args) {
		Obj o=new Obj(324,32);
		o.printLog();
	}

}
class Obj{
	int a,b;
	Obj(int x,int y){
		a=x;
		b=y;
	}
	void printLog() {
		System.out.println(a+" "+b);
	}
}