import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void printSegment(int height,int base) {//base already ofsetted
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * base; j++) {
                if ((j < base / 2 - i) || (j > base / 2 + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void printTree(int segments, int[] sizeOfSegment,int offsetX){
        int base = Arrays.stream(sizeOfSegment).max().getAsInt()+offsetX;
        for(int n = 0; n<segments; n++) {
            printSegment(sizeOfSegment[n], base);
        }
        System.out.println("Enter size of every segment starting from top one");
         for(int i=0;i<segments;i++){
             sizeOfSegment[i] = scanner.nextInt();
         }
         printTree(segments,sizeOfSegment,offsetX);
    }
}
}