# File Backup Utility (JavaBasics_Task_195_V0.1)

## 📖 Description
This project demonstrates the process of creating a file backup. It involves reading the raw byte content of an existing binary file and writing that exact data into a new destination file. This ensures a 1:1 replica of the original data.

## 📋 Requirements Compliance
- **Source**: Use the existing `letters.bin` file.
- **Target**: Create a new file named `letters_copy.bin`.
- **Reading**: Use `Files.readAllBytes()` to load the source data.
- **Writing**: Use `Files.write()` to save the data to the target file.
- **Goal**: Master manual file copying techniques using byte arrays.

## 🚀 Architectural Stack
- Java 8+ (NIO.2)

## 🏗️ Implementation Details
The copy process follows a simple "Read-then-Write" pattern.
1. The program locates the source file.
2. It loads all bytes into the JVM's memory as a byte array.
3. It writes this array to the new path.

## 📋 Expected result
A new file `letters_copy.bin` is created in the project root, containing the same data as `letters.bin`.

## 💻 Code Example

Project Structure:
```text
Backup created successfully: letters_copy.bin
```

## 💻 Code Example

Project Structure:

    ├── letters.bin
    ├── letters_copy.bin
    └── src src/com/yurii/pavlenko/
                            └── Solution.java

Code
```java
package com.yurii.pavlenko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("letters.bin");
        Path targetPath = Paths.get("letters_copy.bin");

        try {
            byte[] data = Files.readAllBytes(sourcePath);
            Files.write(targetPath, data);
            System.out.println("Backup created successfully: letters_copy.bin");

        } catch (IOException e) {
            System.out.println("Backup failed: " + e.getMessage());
        }
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
