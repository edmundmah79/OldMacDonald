class Chick implements Animal //implements Animal 
{     
     //your code here
	private String mySound;
	private String myType;
	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Chick()
	{
		mySound = "unknown";
		myType = "unknown";
	}
	public String getSound()
	{
		return mySound;
	}
	public String getType()
	{
		return myType;
	}
}
