
import java.io.*; 
  
public class yl2 
{ 
    public static void main(String[] args) throws IOException 
    { 
        File file = new File("C:\\tekst.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
          
         
        int characterCount = 0; 
        
          
        while((line = reader.readLine()) != null) 
        { 
            
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                
            } 
        } 
          
        System.out.println("Number of letters is " + characterCount); 
         
    } 
} 