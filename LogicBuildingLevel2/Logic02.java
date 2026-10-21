package LogicBuildingLevel2;

public class Logic02 {

    enum TriangleType { EQUILATERAL, ISOSCELES, SCALENE, INVALID }

    static TriangleType classify(long a, long b, long c) {
        // Triangle inequality: sum of any two sides must exceed the third.
        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c || a + c <= b || b + c <= a) {
            return TriangleType.INVALID;
        }
        if (a == b && b == c) {
            return TriangleType.EQUILATERAL;
        }
        if (a == b || b == c || a == c) {
            return TriangleType.ISOSCELES;
        }
        return TriangleType.SCALENE;
    }

    public static void main(String[] args) {
        long[][] tests = {
            {5, 5, 5}, {5, 5, 8}, {3, 4, 5}, {1, 2, 3}, {0, 4, 4}, {23, 34, 24}
        };
        for (long[] t : tests) {
            System.out.println(t[0] + ", " + t[1] + ", " + t[2]
                    + " -> " + classify(t[0], t[1], t[2]));
        }
    }
}