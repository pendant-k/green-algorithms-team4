public class After {
    public static final class ImmutablePoint {
        private final double x;
        private final double y;

        public ImmutablePoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public ImmutablePoint withX(double newX) {
            return new ImmutablePoint(newX, this.y);
        }

        public ImmutablePoint withY(double newY) {
            return new ImmutablePoint(this.x, newY);
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(1.0, 2.0);

        //System.out.println("After optimization:");
        //System.out.println("Original Point: " + point);

        // Creating a new point with modified values
        ImmutablePoint newPoint = point.withX(3.0).withY(4.0);

        //System.out.println("Modified Point: " + newPoint);
    }
}

