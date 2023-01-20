import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;



public class JavaStreams {

		//count the number of names starting with alphabet A in list
		@Test
		public void regular() {
			
			ArrayList<String> names = new ArrayList<String>();
			names.add("Alp");
			names.add("Mert");
			names.add("Kagan");
			names.add("Ahmet");
			names.add("Ilkbey");
			int count=0;
			
			for(int i=0;i<names.size();i++)
			{
				String actual = names.get(i);
					if(actual.startsWith("A"))
					{
						count++;
					}
			}
			
			System.out.println(count);	
		}
		@Test
		public void streamFilter() {
 			ArrayList<String> names = new ArrayList<String>();
			names.add("Alp");
			names.add("Mert");
			names.add("Kagan");
			names.add("Ahmet");
			names.add("Ilkbey");
			//there is no life for intermediate operation if there is no terminal op
			//terminal operation will execute only if inter operation (filter) returns true
			//we can create stream
			//how to use filter in Stream API
			Long x = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(x);
			
		long y = Stream.of("Alp","Mert","Kagan","Ahmet","Ilkbey").filter(s-> 
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(y);
			
		}
		
		
		
		
		
		
}
