package com.example.demo;

public class StringRotation {

    public static String rotateLeft(String s, int k) {
        int n = s.length();
        // Normalize k to avoid unnecessary rotations
        k = k % n;

        // Create a character array to store the rotated string
        char[] rotated = new char[n];

        // Fill the rotated array with the left rotated characters
        for (int i = 0; i < n; i++) {
            rotated[i] = s.charAt((i + k) % n);
        }

        // Convert the character array back to a string
        StringBuilder result = new StringBuilder();
        for (char c : rotated) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Sample inputs
        String input1 = "abcdef";
        int k1 = 2;
        System.out.println("Input: " + input1 + ", Rotated Output: " + rotateLeft(input1, k1));

        String input2 = "hello";
        int k2 = 1;
        System.out.println("Input: " + input2 + ", Rotated Output: " + rotateLeft(input2, k2));

        String input3 = "rotation";
        int k3 = 10;
        System.out.println("Input: " + input3 + ", Rotated Output: " + rotateLeft(input3, k3));
    }
}

