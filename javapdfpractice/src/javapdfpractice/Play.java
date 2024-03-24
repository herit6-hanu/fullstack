package javapdfpractice;

public class Play {
	public static void main(String[] args) {
		Member m = new Member("Hanu", "arrogant", 2, 15);
		Team t = new Team(m);
		t.print();
	}
}

class Team {
	Member member;

	public Team(Member member) {
		// TODO Auto-generated constructor stub
		this.member = member;
	}

	void print() {
		System.out.println(member.getName());
		System.out.println(member.getType());
		System.out.println(member.getLevel());
		System.out.println(member.getRank());
	}
}

class Member {
	private String name;
	private String type;
	private int level;
	private int rank;

	public Member(String name, String type, int level, int rank) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return type;
	}

	public int getLevel() {
		return level;
	}

	public int getRank() {
		return rank;
	}
	
}