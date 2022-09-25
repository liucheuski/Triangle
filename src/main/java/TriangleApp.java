import enums.TriangleType;
import model.Triangle;
import util.NumberUtil;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        while (true) {
            final String ANSI_RED = "\u001B[31m";
            final String ANSI_RESET = "\u001B[0m";
            Scanner scanner = new Scanner(System.in);
            int a = 0, b = 0, c = 0;
            System.out.println("There are available two work modes.\n" +
                    "1 - Try define of triangle type;\n" +
                    "0 - Exit;\n" +
                    "Please, select one!");
            if (scanner.hasNextInt()) {
                int mode = scanner.nextInt();
                if (mode == 1) {
                    System.out.println("Type long of side \"A\" of triangle.It should be non-negative integer");
                    if (scanner.hasNextInt()) {
                        a = scanner.nextInt();
                        if (NumberUtil.isNonNegativeInteger(a)) {
                            System.out.println("Ok, long of side \"A\" of triangle is " + a + ".");
                        } else {
                            System.out.println("Try again please, because it isn't non-negative integer");
                        }
                    }
                    System.out.println("Type long of side \"B\" of triangle.It should be non-negative integer");
                    if (scanner.hasNextInt()) {
                        b = scanner.nextInt();
                        if (NumberUtil.isNonNegativeInteger(b)) {
                            System.out.println("Ok, long of side \"B\" of triangle is " + b + ".");
                        } else {
                            System.out.println("Try again please, because it isn't non-negative integer");
                        }
                    }
                    System.out.println("Type long of side \"C\" of triangle.It should be non-negative integer");
                    if (scanner.hasNextInt()) {
                        c = scanner.nextInt();
                        if (NumberUtil.isNonNegativeInteger(c)) {
                            System.out.println("Ok, long of side \"B\" of triangle is " + c + ".");
                        } else {
                            System.out.println("Try again please, because it isn't non-negative integer");
                        }
                    }
                    Triangle triangle = new Triangle(a, b, c);
                    if (triangle.isTriangle()) {
                        TriangleType triangleType = triangle.identify();
                        System.out.println(ANSI_RED + "It is " + triangleType + " triangle." + ANSI_RESET);
                    } else
                        System.out.println(ANSI_RED + "It isn't triangle." + ANSI_RESET);
                } else if (mode == 0) {
                    System.exit(0);
                }
            } else {
                System.out.println("Try again please. You have to select from available modes");
            }
        }
    }
}
