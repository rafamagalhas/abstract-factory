
public class AbstractFactory {

	public static void main(String[] args) {
		CarFactory factory = new FiatFactory();
		SedanCar sedan = factory.createSedanCar();
		PopularCar popular = factory.createPopularCar();
		
		sedan.showSedanInfo();
		System.out.println();
		popular.showPopularInfo();
		System.out.println();
	}

}
