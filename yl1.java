import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class yl1 {
    
    public static void main(String[] args) throws IOException {
        try {            
            File f = new File("C:\\numbers.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));            
            int sum = 0;
            int count = 0;
            String line = b.readLine();
            while(line != null) {                
                sum += Integer.parseInt(line); 
                count++;
                line = b.readLine();                
            }
            b.close();
            double average = (double) sum/count;
            System.out.println("Sum: " + sum + ", count: " + count + ", average: " + average + ".");              
        }
        catch (IOException e) {
            e.printStackTrace();
        }                        
    } 
    
    
}