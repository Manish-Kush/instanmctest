package sd.base;
import java.util.Random;

public class NameAndPhoneNumAndOldRegProvider 
{

	public String RandName()
	{
		StringBuilder name= new StringBuilder();
		Random rand = new Random();
		for(int i=0;i<7;i++)
		{
			 char x =(char) (rand.nextInt((112 - 97) + 1) + 97);
			name.append(x);
		}
		return name.toString()+" Dep";
	}
	
	public String PatientPhoneNumber(int numberLength)
	{
		StringBuilder phoneNum= new StringBuilder();
		Random rand = new Random();
		for(int i=0;i<numberLength;i++)
		{
			
			 char x = (char)(rand.nextInt((57 - 48) + 1) + 48);
			 phoneNum.append(x);
		}
		return phoneNum.toString();
	}
	
	public static void main(String[] args)
	{
		NameAndPhoneNumAndOldRegProvider obj = new NameAndPhoneNumAndOldRegProvider();
		System.out.println(obj.RandName());
		System.out.println(obj.PatientPhoneNumber(5));

	}	
}
