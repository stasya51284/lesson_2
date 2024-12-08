public class Park {
    String parkName;
    Attraction[] attractions;

    public Park(String parkName, int numberOfAttractions) {
        this.parkName = parkName;
        this.attractions = new Attraction[numberOfAttractions];
    }

    public void addAttraction(String name, String workingHours, double cost, int index) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, workingHours, cost);
        }
    }

    public void printAttractions() {
        System.out.println("Park: " + parkName);
        for (Attraction attraction : attractions) {
            attraction.printAttractionInfo();
            System.out.println();
        }
    }

    class Attraction {
        String name;
        String workingHours;
        double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Wonderland", 3);
        park.addAttraction("Roller Coaster", "10:00-18:00", 20.0, 0);
        park.addAttraction("Ferris Wheel", "10:00-19:00", 15.0, 1);
        park.addAttraction("Haunted House", "12:00-20:00", 25.0, 2);

        park.printAttractions();
    }
}
