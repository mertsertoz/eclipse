import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		int[] ary2 = {1,4,5,6,7,8,52,48,66,31};
		
		
		//check if array has multiple of 2
		for(int i=0; i<ary2.length; i++)
			
		{
			if(ary2[i] % 2 == 0)
			{	
				System.out.println(ary2[i]);
			 break; //(it stops in first correct value) 
			}
			else 
			{
				System.out.println(ary2[i] + "its not multiple of 2");
			}
			
			
			
		}
		
		 List<String> a = new ArrayList<String>();
		 a.add("Sergeant");
		 a.add("Soap");
		 a.add("Mactavish");
		 System.out.println(a.get(1));
		
		 
		 for(int i = 0; i<a.size(); i ++)
		 {
			 System.out.println(a.get(i));
		 }
		System.out.println("***************");
		 for(String val  :a)   //Enhanced version
		 {
			 System.out.println(val);	
		 }
		//item is present in ArrayList (true/false)
		System.out.println(a.contains("Mactavish"));
        String[] name = {"Soap","Sergeant","Mactavish"};
        List<String> nameArrayList = Arrays.asList(name); //converting array to arraylist
	    System.out.println(a.contains("Soap"));
	}
	

}
