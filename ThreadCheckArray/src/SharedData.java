import java.util.ArrayList;


/**
 * @author bish_
 * Tracks the shared data between the threads
 */
public class SharedData 
{
	/**
	 * array variable of type Arraylist, which is the array itself
	 * winArray - array that has the 
	 */
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Constructor of sharedData
	 * @param array - the matrix 
	 * @param b - the desired sum
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
	
	
	/**
	 * @return return the winning thread
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	
	/**
	 * Sets the status array (winarray)
	 * @param winArray - the status array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	
	/**
	 * @return the array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return the desired number
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return flag when one of the threads finds the solution 
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the flag to the given flag
	 * @param flag - the new value of flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
