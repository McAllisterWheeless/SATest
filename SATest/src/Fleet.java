import java.util.ArrayList;

public class Fleet {
	private ArrayList<Truck> TruckList;
	private int size;

	private int truckCount;

	public Fleet() {
		this.truckCount = 0;
		this.TruckList = new ArrayList<>();
		this.addTruck();
		this.size = 1;
	}

	public int getSize() {
		return this.size;
	}

	public ArrayList<Truck> getList() {
		return this.TruckList;
	}

	public void addTruck() {
		this.TruckList.add(new Truck());
		this.size += 1;
	}

	public void addTruck(Truck newTruck) {
		this.TruckList.add(newTruck);
		this.size += 1;
	}
}
