public class Truck {
	private int weight;
	private int limit;

	public Truck() {
		this.weight = 0;
		this.limit = 2000;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getLimit() {
		return this.limit;
	}

	public void addWeight(int item) {
		this.weight = this.weight + item;
	}
}
