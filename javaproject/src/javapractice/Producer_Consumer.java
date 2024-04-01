package javapractice;

public class Producer_Consumer {
	public static void main(String[] args) {
		Queue q = new Queue();
		Produce p = new Produce(q);
		Consume c = new Consume(q);
		c.start();
		p.start();

	}
}

class Queue {
	int x;

	void produce() {
		int i = 1;

		for (;;) {
			x = i;
			System.out.println("produced " + i++);
		}

	}

	void consume() {
		for (;;) {
			System.out.println("consumed " + x);
		}
	}
}

class Produce extends Thread {
	Queue q;

	public Produce(Queue q) {
		// TODO Auto-generated constructor stub
		this.q = q;

	}

	public void run() {
		q.produce();
	}
}

class Consume extends Thread {
	Queue q;

	public Consume(Queue q) {
		// TODO Auto-generated constructor stub
		this.q = q;

	}

	public void run() {
		q.consume();
	}
}
