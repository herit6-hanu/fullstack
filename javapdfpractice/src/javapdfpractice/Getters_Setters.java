package javapdfpractice;

public class Getters_Setters {
	public static void main(String[] args) {
		Getters_Setters gs = new Getters_Setters();
		gs.setName("Hanumantha Reddy");
		System.out.println(gs.getName());
	}
	private String name;
	public void setName(String name) {
		if(name!=null && name.length()>2) {
			this.name=name;
		}
	}
	public String getName() {
		if(name.length()>16) {
			return "length is large";
		}else {
			return name;
		}
		
	}

}
