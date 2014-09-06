

public class q1 {

	public static void main(String[] args)
	{
		if(sleepIn(true, false) == false)
		{
			System.out.println("You're working");
		}
		else{
			System.out.println("Sleep in");
		}
	}
	
	
	public boolean sleepIn(boolean weekday, boolean vacation)
	{
		if(!weekday || vacation)
		{
			return true;
		}
		
		return false;
}
	
	
}
