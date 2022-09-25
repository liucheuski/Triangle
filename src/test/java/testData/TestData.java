package testData;

import model.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestData {
    public static Stream<Triangle> getTriangles() {
        return Stream.of(new Triangle(5, 3, 3),
                new Triangle(4, 4, 6),
                new Triangle(4, 4, 4),
                new Triangle(3, 4, 5),
                new Triangle(6, 3, 3));
    }

    public static List<Triangle> getNotTriangles() {
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(5, 2, 2));
        triangles.add(new Triangle(0, 1, 2));
        triangles.add(new Triangle(0, 0, 1));
        triangles.add(new Triangle(0, 0, 0));
        return triangles;
    }

    public static List<Triangle> getDegenerateTriangles() {
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(6, 3, 3));
        return triangles;
    }

    public static List<Triangle> getIsoscelesTriangles() {
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(4, 4, 6));
        return triangles;
    }

    public static List<Triangle> getEquilateralTriangles() {
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(4, 4, 4));
        return triangles;
    }

    public static List<Triangle> getScaleneTriangles() {
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(3, 4, 5));
        return triangles;
    }
}
