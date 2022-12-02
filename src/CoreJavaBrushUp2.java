import java.util.ArrayList;

public class CoreJavaBrushUp2 {

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
		
		 ArrayList<String> a = new ArrayList<String>();
		 a.add("Sergeant");
		 a.add("Soap");
		 a.add("Mactavish");
		 System.out.println(a.get(1));
		
		
		

	}

}
