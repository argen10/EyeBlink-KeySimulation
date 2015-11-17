import java.awt.Robot;
/**
 * Simulate the pressing of a given key
 *  
 * @author Alizishaan Khatri
 * @license GPL
 *
 */
public class Robo{
	
	/** Entry point into the code
	 *
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int count=0;
		Robot r=new Robot();
		
		while(count<4)
		{
			int keyCode=0;
			int keyVal=FIFORead.getVal();				//Read Value from FIFO
			
			//Assign keyCode as per keyValue
			if(keyVal>=0 && keyVal<=9){
				keyCode=48+keyVal;
			}else if(keyVal>=10 && keyVal<=15){
				keyCode=55+keyVal;
			}else{
				System.out.println("Invalid input");
				System.exit(-1);
			}
			
			//Simulate respective key press
			r.keyPress(keyCode);
			Thread.sleep(5);			//keep key pressed for 5 ms
			r.keyRelease(keyCode);
			count++;
		}
		
		//Press Enter key after 4 digits have been read
		r.keyPress(13);
		Thread.sleep(5);				//keep key pressed for 5 ms
		r.keyRelease(13);
		
	}

}
