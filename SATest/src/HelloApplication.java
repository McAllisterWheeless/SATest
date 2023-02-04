import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HelloApplication {

	public static void main(String[] args) {
		ArrayList<Integer> itemList = new ArrayList<>();
		Random randNum = new Random();
		for (int i = 0; i <= 1000; i++) {
			itemList.add(randNum.nextInt(1000));
		}
		Integer totalWeight = 0;
		for (int i : itemList) {
			totalWeight += itemList.get(i);
		}
		Double optimalTrucks = Math.ceil(totalWeight / 2000);
		System.out.println("Optimal Needed Trucks: " + optimalTrucks);

		Collections.sort(itemList, Collections.reverseOrder());
		Fleet truckFleet = new Fleet();
		for (int i : itemList) {
			boolean foundTruck = false;
			for (Truck x : truckFleet.getList()) {
				if (x.getWeight() + i <= x.getLimit() && foundTruck == false) {
					x.addWeight(i);
					foundTruck = true;
				}
			}
			if (foundTruck == false) {
				Truck newTruck = new Truck();
				newTruck.addWeight(i);
				truckFleet.addTruck(newTruck);
				foundTruck = true;
			}

		}

		for (Truck i : truckFleet.getList()) {
			System.out.println(i.getWeight());
		}
		System.out.println(truckFleet.getSize());
	}
}