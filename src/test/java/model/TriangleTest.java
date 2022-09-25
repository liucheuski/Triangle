package model;

import enums.TriangleType;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class TriangleTest {


    @ParameterizedTest
    @MethodSource(value = "testData.TestData#getTriangles")
    void isTriangle(Triangle triangle) {
        assertTrue(triangle.isTriangle());
    }

    @ParameterizedTest
    @MethodSource(value = "testData.TestData#getNotTriangles")
    void isNotTriangle(Triangle triangle) {
        assertFalse(triangle.isTriangle());
    }

    @ParameterizedTest
    @MethodSource(value = "testData.TestData#getDegenerateTriangles")
    void identifyDegenerateTriangles(Triangle triangle) {
        assumeTrue(triangle.isTriangle());
        assertEquals(TriangleType.DEGENERATE, triangle.identify());
    }

    @ParameterizedTest
    @MethodSource(value = "testData.TestData#getIsoscelesTriangles")
    void identifyIsoscelesTriangles(Triangle triangle) {
        assumeTrue(triangle.isTriangle());
        assertEquals(TriangleType.ISOSCELES, triangle.identify());
    }

    @ParameterizedTest
    @MethodSource(value = "testData.TestData#getEquilateralTriangles")
    void identifyEquilateralTriangles(Triangle triangle) {
        assumeTrue(triangle.isTriangle());
        assertEquals(TriangleType.EQUILATERAL, triangle.identify());
    }

    @ParameterizedTest
    @MethodSource(value = "testData.TestData#getScaleneTriangles")
    void identifyScaleneTriangles(Triangle triangle) {
        assumeTrue(triangle.isTriangle());
        assertEquals(TriangleType.SCALENE, triangle.identify());
    }
}