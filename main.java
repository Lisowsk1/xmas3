import java.util.Random;
import java.util.Scanner;

public class Main {

    static void drawMultipleTrees(int numberOfTrees, int parameters[][]) {

        for (int k = 0; k < numberOfTrees; k++) {
            int segments = parameters[k][0];
            int size = parameters[k][1];
            int positionX = parameters[k][2];
            drawTree(segments, size, positionX);

            System.out.println();
            System.out.println();
            System.out.println();
        }
    }


    static void drawTree(int segments, int size, int positionX) {
        positionX += size / 2 - 1;

        Random rand = new Random();

        for (int k = 0; k < segments; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 2 * (size - 1) + positionX; j++) {
                    if (j < (size / 2 + positionX - i) || j > (size / 2 + positionX + i)) {
                        System.out.print(" ");
                    } else {
                        int n = rand.nextInt(20);
                        switch (n) {
                            case 0, 1: {
                                System.out.print("@");
                                break;
                            }
                            case 2, 3: {
                                System.out.print("&");
                                break;
                            }
                            case 4: {
                                System.out.print("$");
                                break;
                            }
                            default: {
                                System.out.print("*");
                                break;
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
        for (int j = 0; j < 2 * size + 1 + positionX; j++) {
            if (j + size / 3 < size / 2 + positionX || j - size / 3 > size / 2 + positionX) {
                System.out.print(" ");
            } else {
                System.out.print("|");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of trees");
        final int numberOfTrees = scanner.nextInt();
        int parameters[][] = new int[numberOfTrees][3];
        for (int i = 0; i < numberOfTrees; i++) {
            System.out.println("Enter the number of segments of  tree n." + (i + 1) + " :");
            parameters[i][0] = scanner.nextInt();
            System.out.println("Enter the size of segments of  tree n." + (i + 1) + " :");
            parameters[i][1] = scanner.nextInt();
            System.out.println("Enter the positionX of  tree n." + (i + 1) + " :");
            parameters[i][2] = scanner.nextInt();
        }

        drawMultipleTrees(numberOfTrees, parameters);

    }

}


