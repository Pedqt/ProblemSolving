import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Route {
    List<String> route;

    public Route() {
        route = new ArrayList<>();
    }

    public Route(List<String> route) {
        this.route = new ArrayList<>(route);
    }

    public double calculateTotalDistance() {
        double totalDistance = 0;
        for (int i = 0; i < route.size() - 1; i++) {
            totalDistance += distance(route.get(i), route.get(i + 1));
        }
        return totalDistance;
    }

    private double distance(String city1, String city2) {

        return 0.0; 
    }
}

public class GeneticAlgorithmDelivery {
    private static List<String> cities;
    private static List<String> orders;

    public static void main(String[] args) {
        cities = new ArrayList<>();
    

        orders = new ArrayList<>();
      
        int populationSize = 100;
        int generations = 1000;

        List<Route> population = initializePopulation(populationSize, cities);

        for (int generation = 0; generation < generations; generation++) {
            population = evolvePopulation(population);
        }

        Route bestRoute = findBestRoute(population);
        System.out.println("Best Route: " + bestRoute.route);
        System.out.println("Total Distance: " + bestRoute.calculateTotalDistance());
    }



}
