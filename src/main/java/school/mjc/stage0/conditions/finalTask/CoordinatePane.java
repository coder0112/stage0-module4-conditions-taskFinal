package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x > 0) {
            System.out.println(y > 0 ? "first" : "fourth");
        } else if (x < 0) {
            System.out.println(y > 0 ? "second" : "third");
        } else {
            System.out.println("zero");
        }
    }
}
