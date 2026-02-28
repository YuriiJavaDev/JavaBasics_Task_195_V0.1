package com.yurii.pavlenko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * File backup simulation demonstrating manual binary copying.
 */
public class Solution {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("letters.bin");
        Path targetPath = Paths.get("letters_copy.bin");

        try {
            // Read all bytes from the original file
            byte[] data = Files.readAllBytes(sourcePath);

            // Write the bytes to the new backup file
            Files.write(targetPath, data);

            System.out.println("Backup created successfully: letters_copy.bin");

        } catch (IOException e) {
            // Handle cases where the source is missing or target is inaccessible
            System.out.println("Backup failed: " + e.getMessage());
        }
    }
}