public class ClassPracticeStarter {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("          CLASS PRACTICE");
        System.out.println("====================================");

        // The Parcel class is below main. Do not change it.

        // Question 1: Create one Parcel - tracking "NP-2001", 8.0 lbs,
        // destination "Denver". Print it directly with println. You did
        // not write a toString() call anywhere - something else calls
        // it for you.


        // Question 2: Using the SAME parcel, call label() and print the
        // String it returns. label() does not print anything by itself -
        // if you see nothing on screen, you printed the call instead of
        // calling println on it.


        // Question 3: Using the SAME parcel, print its shipping cost and
        // whether it is oversize. Neither method takes an argument -
        // the object already has the weight it needs.


        // Question 4: Try to set the SAME parcel's weight to -5.0. Print
        // the true/false that setWeight gives back, then print the
        // parcel's weight afterward to prove whether anything changed.


        // Question 5: Now set the SAME parcel's weight to 40.0, a valid
        // value. Print the true/false setWeight gives back, then print
        // the weight afterward.


        // Question 6: Build a brand-new Parcel - tracking "NP-2002", an
        // invalid starting weight of -15.0 lbs, destination "Boise".
        // Print the new parcel afterward. It was NOT refused the way
        // question 4 was refused.


        // Question 7: Print how many Parcel objects have been created so
        // far. Call this on the CLASS, not on one of the objects. Then
        // build one more parcel - tracking "NP-2003", 12.0 lbs,
        // destination "Reno" - and print the count again to prove it
        // went up by exactly one, no matter which object you ask.


        // Question 8: Build an array that holds three parcels: NP-3001
        // (3.0 lbs, Tulsa), NP-3002 (30.0 lbs, Boise), and NP-3003
        // (18.0 lbs, Reno). Loop over the array and print each parcel's
        // label() and shippingCost() on one line, like:
        // NP-3001 -> Tulsa (3.0 lbs) $6.99


        // Question 9: Build a Parcel array with room for 2 packages, but
        // only fill slot 0 - tracking "NP-4001", 9.0 lbs, "Missoula".
        // Print what slot 1 holds without crashing the program. Then,
        // BEFORE calling a method on slot 1, check whether it is null
        // and print "slot 1 is empty" if it is.
    }
}

// ------------------------------------------------------------
// The Parcel class - already built. Do not change it.
// ------------------------------------------------------------
//class Parcel {
//    private static int created = 0;
//
//    private final String tracking;
//    private double weight;
//    private String destination;
//
//    public Parcel(String tracking, double weight, String destination) {
//        this.tracking = tracking;
//        this.weight = 0.0;
//        this.destination = "UNSET";
//        setWeight(weight);
//        setDestination(destination);
//        created++;
//    }
//
//    public boolean setWeight(double newWeight) {
//        if (newWeight <= 0 || newWeight > 150) {
//            System.out.println("REJECTED weight " + newWeight + " for " + tracking);
//            return false;
//        }
//        this.weight = newWeight;
//        return true;
//    }
//
//    public void setDestination(String newDestination) {
//        this.destination = newDestination;
//    }
//
//    public String getTracking() {
//        return tracking;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public String label() {
//        return tracking + " -> " + destination + " (" + weight + " lbs)";
//    }
//
//    public double shippingCost() {
//        if (weight < 1) {
//            return 3.99;
//        }
//        if (weight < 5) {
//            return 6.99;
//        }
//        if (weight < 20) {
//            return 12.99;
//        }
//        return 24.99;
//    }
//
//    public boolean isOversize() {
//        return weight > 20;
//    }
//
//    public static int getCreated() {
//        return created;
//    }
//
//    @Override
//    public String toString() {
//        return "Parcel[" + tracking + ", " + weight + " lbs, " + destination + "]";
//    }
//}
