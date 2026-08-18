class Parcel {
    private static int created = 0;

    private final String tracking;
    private double weight;
    private String destination;

    public Parcel(String tracking, double weight, String destination) {
        this.tracking = tracking;
        this.weight = 0.0;
        this.destination = "UNSET";
        setWeight(weight);
        setDestination(destination);
        created++;
    }

    public boolean setWeight(double newWeight) {
        if (newWeight <= 0 || newWeight > 150) {
            System.out.println("REJECTED weight " + newWeight + " for " + tracking);
            return false;
        }
        this.weight = newWeight;
        return true;
    }

    public void setDestination(String newDestination) {
        this.destination = newDestination;
    }

    public String getTracking() {
        return tracking;
    }

    public double getWeight() {
        return weight;
    }

    public String getDestination() {
        return destination;
    }

    public String label() {
        return tracking + " -> " + destination + " (" + weight + " lbs)";
    }

    public double shippingCost() {
        if (weight < 1) {
            return 3.99;
        }
        if (weight < 5) {
            return 6.99;
        }
        if (weight < 20) {
            return 12.99;
        }
        return 24.99;
    }

    public boolean isOversize() {
        return weight > 20;
    }

    public static int getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Parcel[" + tracking + ", " + weight + " lbs, " + destination + "]";
    }
}