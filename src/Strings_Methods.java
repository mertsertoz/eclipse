
public class Strings_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is an object,   //String Literal string x = "xxx"
		
		//String s1 = "Codana Actimi GmbH";
		String sa2 = "Codana Actimi GmbH";
		
		//new
		
		String sa3 = new String("GmbH");
		String sa4 = new String("GmbH");
        
		String sa5 = "Mert Sertoz Codana";
		String[] splittedString = sa5.split("Sertoz");  
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());  //" sertoz " works fine for trim
	    //for(int i=0; i<sa5.length(); i++)
	   for(int i= sa5.length()-1; i>=0; i--)  //for reverse writing
	    {
	    	
	    	System.out.println(sa5.charAt(i));
	    }
	}

}
