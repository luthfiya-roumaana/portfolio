import java.sql.*; 
 
public class JDBCDemo { 
    public static void main(String[] args) { 
        String url = "jdbc:mysql://localhost:3306/college"; 
        String user = "root"; 
        String password = "root123"; 
 
        try { 
            // Step 1: Load the driver (optional for JDBC 4.0+, kept for clarity) 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
 
            // Step 2: Establish connection 
            Connection con = DriverManager.getConnection(url, user, password); 
            System.out.println("Connected to database successfully!"); 
 
            Statement stmt = con.createStatement(); 
 
            // Step 3: Create table (if not exists) 
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student " + 
                    "(rollno INT PRIMARY KEY, name VARCHAR(30), marks INT)");
            // Step 4: Insert a record 
            stmt.executeUpdate("INSERT INTO student VALUES (101, 'Revathy', 95)"); 
            System.out.println("Record inserted successfully!"); 
 
            // Step 5: Retrieve records 
            ResultSet rs = stmt.executeQuery("SELECT * FROM student"); 
            System.out.println("\nStudent Records:"); 
            while (rs.next()) { 
                System.out.println("Roll No: " + rs.getInt("rollno") + 
                        "\tName: " + rs.getString("name") + 
                        "\tMarks: " + rs.getInt("marks")); 
            } 
 
            // Step 6: Close resources 
            rs.close(); 
            stmt.close(); 
            con.close(); 
 
        } catch (ClassNotFoundException | SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
 
SAMP