package com.khaled;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Get the input form user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Height: ");
        int height = scanner.nextInt();

        // Repeat until a valid input
        while (height <= 0 || height > 8) {
            System.out.println("Need a valid argument");
            System.out.println("Height: ");
            height = scanner.nextInt();
        }

        // Print the pyramid
        for (int i = 0; i < height; i++) {
            for (int j = height; j > 0; j--) {
                if (j - 1 <= i) {
                    System.out.print('#');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
