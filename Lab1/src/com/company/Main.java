package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public void mergeFiles(String fileOne, String fileTwo, String out) throws FileNotFoundException {
        Scanner foneScanner = new Scanner(new FileReader(fileOne));
        Scanner ftwoScanner = new Scanner(new FileReader(fileTwo));

        while(foneScanner.hasNextLine() && ftwoScanner.hasNextLine()) {



        }
    }
}
