import java.io.*; 
 
public class IODemo { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
        // Formatted output using printf 
        double marks = 89.4567; 
        System.out.println("----- Formatted Output -----"); 
        System.out.printf("%-10s%.2f%n", "Marks:", marks); 
 
        // read() - unformatted I/O, reads a single character 
        System.out.print("\nEnter a single character: "); 
        char ch = (char) br.read(); 
        br.readLine(); // clear the rest of the line (newline char) 
        System.out.println("You entered: " + ch); 
 
        // readLine() - reading a full line 
        System.out.print("\nEnter your name: "); 
        String name = br.readLine(); 
        System.out.println("Hello, " + name + "!"); 
 
        // Formatted input - reading and parsing a number 
        System.out.print("\nEnter your age: "); 	
        int age = Integer.parseInt(br.readLine()); 
        System.out.printf("%-15s%d%n", "Your age is:", age); 
 
        br.close(); 
    } 
} 
