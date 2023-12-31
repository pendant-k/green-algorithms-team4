public class After {
    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        Point point = new Point(1.0, 2.0);

        //System.out.println("Before optimization:");
        //System.out.println("Original Point: " + point);

        // Modifying the point
        point.setX(3.0);
        point.setY(4.0);

        //System.out.println("Modified Point: " + point);

        // Perform a complex operation on the mutable Point
        complexOperation(point);

        //System.out.println("After Complex Operation: " + point);
    }

    private static void complexOperation(Point point) {
        // Simulating a complex operation that modifies the mutable Point
        for (int i = 0; i < 1000000; i++) {
            point.setX(point.getX() + 0.1);
            point.setY(point.getY() - 0.1);
        }
    }
}

