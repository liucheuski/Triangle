package model;

import enums.TriangleType;
import lombok.Data;

@Data
public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        if (a != 0 && b != 0 && c != 0) {
            return ((a + b) >= c) && ((a + c) >= b) && ((b + c) >= a);
        } else return false;
    }

    public TriangleType identify() {
        if ((a == b + c) || (b == a + c) || (c == a + b)) {
            return TriangleType.DEGENERATE;
        } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            return TriangleType.ISOSCELES;
        } else if (a == b && a == c) {
            return TriangleType.EQUILATERAL;
        } else if ((a != b) && (a != c)) {
            return TriangleType.SCALENE;
        } else return TriangleType.ANOTHER;
    }
}
