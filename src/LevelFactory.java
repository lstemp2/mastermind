package practiceCode;

import java.util.Arrays;
import java.util.Random;

public interface LevelFactory {
	public int[] createLevel();
}
class EasyLevelFactory implements LevelFactory {
	//Generate 4 sequential numbers
	public int[] createLevel() 
	{
		Random rand = new Random();
		int x = rand.nextInt(10); //Random number (0..9)
		
        //4 Number will be generated sequentially
		if (x > 6)
			return new int[]{x - 3, x - 2, x - 1, x};
		else
			return new int[]{x, x + 1, x + 2, x + 3};
		
	}
}
class MediumLevelFactory implements LevelFactory {
	//Generate 4 numbers may be sequential
	public int[] createLevel() 
	{
		Random rand = new Random();
		
        //Byte array corresponding with which number we used
		byte[] bytes = new byte[10];
		Arrays.fill( bytes, (byte) 0 ); //Initialized to 0
		
		int[] returnVal = new int[4];
		int x, currPos = 0;
		
		while(currPos < 4)
		{
			x = rand.nextInt(countDown);
			
            //If we haven't added this number to our answer, add it
			if(bytes[x] == 0)
			{
				bytes[x] = 1;
				returnVal[currPos] = x;
			}
			else
            //"Linear Probing" If random number is taken,
            //keep adding until you get to a number that has not been used
			{
				while(bytes[x % 10] != 0){x++;}
				bytes[x % 10] = 1;
				returnVal[currPos] = x % 10;
			}
			currPos++;
		}
		return returnVal;
	}
}
class HardLevelFactory implements LevelFactory {
	//Generates 4 numbers that will not be sequential
	public int[] createLevel() 
	{
		Random rand = new Random();
		
		byte[] bytes = new byte[10];//Byte array corresponding with which number we used
		Arrays.fill( bytes, (byte) 0 ); //Initialized to 0
		
		int[] returnVal = new int[4];
		
		int x;
		x = rand.nextInt(10);
			
		bytes[x] = 1;
		returnVal[0] = x;
			
		returnVal[0 + 1] = (returnVal[0] - 3 ) % 10;
		returnVal[0 + 2] = (returnVal[0] + 3 ) % 10;
		returnVal[0 + 3] = (returnVal[0] + 6 ) % 10;
        
        //Will create a pattern
			
		return returnVal;
		
	}
}