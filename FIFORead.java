import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

/**
 * Read data from a FIFO pipe
 * 
 * @author Alizishaan Khatri
 *
 */
public class FIFORead {
	//Specify pipe name and address
   private static final String FIFO = "temp";
   
  /**
   * Reads value from FIFO pipe 
   * 
   * @return value read from pipe
   */
   public static int getVal(){
      BufferedReader in = null;
      
      try{
         //System.out.println("JAVA SIDE!!");
         in = new BufferedReader(new FileReader(FIFO));
         
         //Wait for input on FIFO
         while(!in.ready()){}
         
         String readDat=in.readLine();
         in.close();
         
         return(Integer.parseInt(readDat));
                  
      }catch(IOException ex){
         System.err.println("IO Exception at buffered read!!");
         System.exit(-1);
      }
      
      return(10);
   }

}

