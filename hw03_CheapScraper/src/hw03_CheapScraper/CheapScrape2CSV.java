package hw03_CheapScraper;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CheapScrape2CSV {
	
	public static void main(String [] args) throws FileNotFoundException {
		System.out.println("Command line args:");
		for (int i = 0; i < args.length; i ++) {
			System.out.println(args[i]);
		}
		int columns = Integer.parseInt(args[0]);
		String inputFileName = args[1];
		String outputFileName = args[2];
		
		File file = new File(inputFileName);
		
		Scanner in = null;
		PrintWriter out = null;
		
		try {
			
			in = new Scanner(file);
			out = new PrintWriter(outputFileName);
					if(columns == 4) {
						while (in.hasNextLine()) {
							String s1 = "\"" + in.nextLine() + "\"";
							String s2 = ",\"" + in.nextLine() + "\"";
							String s3 = ",\"" + in.nextLine() + "\"";
							String s4 = ",\"" + in.nextLine() + "\"";
							out.append(s1);
							out.append(s2);
							out.append(s3);
							out.println(s4);
						}
					}
					
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		in.close();
		out.close();
		}
	}



		



