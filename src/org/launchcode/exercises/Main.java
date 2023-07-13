package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(9,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            CheckFileExtension(student.getValue());
        }
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        try {
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            System.out.print("You can't divide a number by zero");
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int points = 0;
        try {
            if (fileName.contains(".java") && fileName.indexOf('.') == fileName.length()-5) {
                points = 1;
            } else if (fileName.equals("") || fileName.equals(null)) {
                throw new InValidFileException("Your file doesn't exist");
            }
        } catch (InValidFileException e) {
            e.printStackTrace();
            points = -1;
        }
//        System.out.println(points);
        return points;
    }

}
