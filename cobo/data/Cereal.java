public class Cereal {

	private String name;
	private String type;
	private int calories;
	private int protein;
	private int fat;
	private int sodium;
	private double fiber;
	private double carbohydrates;
	private int sugar;
	private int potassium;
	private int vitamins;
	private int shelf;
	private double weight;
	private double cups;
	private double rating;

	public Cereal(String _name, String _type, int _calories, int _protein, int _fat, int _sodium, double _fiber, double _carbohydrates, int _sugar, int _potassium, int _vitamins, int _shelf, double _weight, double _cups, double _rating) {
		name = _name;
		type = _type;
		protein = _protein;
		calories = _calories;
		fat = _fat;
		sodium = _sodium;
		fiber = _fiber;
		carbohydrates = _carbohydrates;
		sugar = _sugar;
		potassium = _potassium;
		vitamins = _vitamins;
		shelf = _shelf;
		weight = _weight;
		cups = _cups;
		rating = _rating;
	}

	public String getName() { return name; }
	public String getType() { return type; }
	public int getCalories() { return calories; }
	public int getProtein() { return protein; }
	public int getFat() { return fat; }
	public int getSodium() { return sodium; }
	public double getFiber() { return fiber; }
	public double getCarbohydrates() { return carbohydrates; }
	public int getSugar() { return sugar; }
	public int getPotassium() { return potassium; }
	public int getVitamins() { return vitamins; }
	public int getShelf() { return shelf; }
	public double getWeight() { return weight; }
	public double getCups() { return cups; }
	public double getRating() { return rating; }

	public String toString() {
		String out = "";
		out += "Name: " + name + "\n";
                out += "Type: " + type + "\n";
                out += "Calories: " + calories + "\n";
		out += "Protein: " + protein + "\n";
                out += "Fat: " + fat + "\n";
                out += "Sodium: " + sodium + "\n";
                out += "Fiber: " + fiber + "\n";
                out += "Carbohydrates: " + carbohydrates + "\n";
                out += "Sugar: " + sugar + "\n";
                out += "Potassium: " + potassium + "\n";
                out += "Vitamins: " + vitamins + "\n";
                out += "Shelf: " + shelf + "\n";
                out += "Weight: " + weight + "\n";
                out += "Cups: " + cups + "\n";
                out += "Rating: " + rating + "\n";
		return out;
 	}

	public static void main(String[] args) {
		Cereal cocoaPuffs = new Cereal("Cocoa Puffs", "C", 110, 1, 1, 180, 0.0, 12.0, 13, 55, 25, 2, 1.0, 1.0, 22.736446);
		System.out.println(cocoaPuffs);
		Cereal branChex = new Cereal("Bran Chex", "C", 90, 2, 1, 200, 4.0, 15.0, 6, 125, 25, 1, 1.0, 0.67, 49.120253);
		System.out.println(branChex);
	}

}
