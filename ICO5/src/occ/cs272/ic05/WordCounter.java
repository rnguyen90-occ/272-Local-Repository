package occ.cs272.ic05;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * Reading and processing text files.
 * 
 * Reads a text file, line by line, counts the number of words per line, prints
 * out each line of the poem, preceded by number of the number of words in that
 * line.
 * 
 */
public class WordCounter
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "rnguyen90";
    public static final String ASSIGNMENT = "IC05-B";
    
    /**
     * void countWords()
     * @param in the Reader to get the bytes from
     * @param out the Writer to send the results to
     */
    public void countWords(Reader reader, Writer writer) 
    {
        // 1. Construct the Scanner and PrintWriter objects
        // TODO: your work here
    	Scanner in = new Scanner(reader);
    	PrintWriter out = new PrintWriter(writer);
        
        // 2. Read the input file, writing the output for each line
        // TODO: your work here
        while (in.hasNextLine()) // read line by line, processing each line as we go.
        {
        	String line = in.nextLine(); // made new scanner within scanner and process stream it
        	
        	int wordCount = 0;
        	Scanner lineIn = new Scanner(line);
        	while (lineIn.hasNext())
        	{
        		String dummy = lineIn.next();
        		wordCount++;
        	}
        	
        	lineIn.close();
        	out.printf("%-3d " +  line + "\n", wordCount); // format specifier, left justified. \n used for line indentation
        }
        // 3. Close all files
        // TODO: your work here
        in.close();
    }

    /**
     * Run as an application like this.
     */
    public static void main(String[] args) throws Exception
    {
        WordCounter app = new WordCounter();
        // Set up the input and output file names (hard-coded for this problem)
        StringWriter out = new StringWriter();
        app.countWords(new FileReader("JackJill.txt"), out); 
        System.out.println(out.toString());
    }
}
