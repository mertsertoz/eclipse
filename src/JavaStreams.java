import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class JavaStreams {

		//count the number of names starting with alphabet A in list
		//@Test
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
		//@Test
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
		//print all the names of ArrayList
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
		
		
		
		
		}
		//@Test
		public void streamMap()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("man");
			names.add("Don");
			names.add("women");
			
			//print names of which have last letter as a "t" with Uppercase
			Stream.of("Alp","Mert","Kagan","Ahmet","Ilkbey","Murat").filter(s ->s.endsWith("t")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			//print names which have first letter as a with uppercase and sorted
			List<String> names1 = Arrays.asList("Alp","Mert","Kagan","Ahmet","Ilkbey","Murat");
			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//Merging 2 different lists
			Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
			//newStream.sorted().forEach(s->System.out.println(s));
			boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Mert"));
			System.out.println(flag);
			Assert.assertTrue(flag);
			
			
			
			
		}
		@Test
		public void streamCollect() 
		{
			List<String> ls = Stream.of("Alp","Mert","Kagan","Ahmet","Ilkbey","Murat").filter(s->s.endsWith("t")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			System.out.println(ls.get(0));
			
			//
			
			List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
			//print unique number from this array
			//sort the array - 3rd index
			//values.stream().distinct().forEach(s->System.out.println(s));
			List<Integer> li =values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(3));
		}
		
		
		
}
