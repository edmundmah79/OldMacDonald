class Chick implements Animal //implements Animal 
{     
     //your code here
	private String mySound1;
	private String mySound2;
	private String myType;
	public Chick(String type, String sound1, String sound2)
	{
		myType = type;
		mySound1 = sound1;
		mySound2 = sound2;
	}
	public Chick()
	{
		mySound1 = "unknown";
		mySound2 = "unknown";
		myType = "unknown";
	}
	public String getSound()
	{
		if (Math.random() < .5)
		{
			return mySound1;
		}	
		else
		{
			return mySound2;
		}
	}
	public String getType()
	{
		return myType;
	}
}
