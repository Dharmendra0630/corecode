package com.main.hacker_rank.lineNo;

	
	
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

	public class LineNumber {

	    public static void main(String[] args) throws FileNotFoundException {

	    Scanner	s = new Scanner((new FileReader("D:/HFC.txt")));
	    	while (s.hasNext()) {
	    	System.out.print(s.next());
    	}
	    	
    }
}
	

	