public class StudentDemo {  
    static class Student { 
        int rollNo; 
        String name; 
        // Parameterized constructor 
        Student(int r, String n) { 
            rollNo = r; 
            name = n; 
            System.out.println("Constructor called for Roll No: " + rollNo); 
        } 
        void display() { 
            System.out.println("Roll No: " + rollNo + "\tName: " + name); 
        } 
        // finalize() acts as a destructor-equivalent in Java 
        @Override 
        protected void finalize() { 
            System.out.println("Destructor(finalize) called for Roll No: " + rollNo); 
        } 
    } 
}
    public static void main(String[] args) throws InterruptedException { 
        System.out.println("----- Creating array of objects -----"); 
        Student[] s = new Student[3]; 
        s[0] = new Student(101, "Arun"); 
        s[1] = new Student(102, "Bala"); 
        s[2] = new Student(103, "Chitra"); 
        System.out.println("\n----- Displaying student details -----"); 
        for (int i = 0; i < s.length; i++) 
            s[i].display(); 
        System.out.println("\n----- Dereferencing objects and requesting garbage collection ----"); 
        for (int i = 0; i < s.length; i++) 
            s[i] = null; 
        System.gc(); 
        Thread.sleep(500); // allow GC thread to run before program exits 
    } 

