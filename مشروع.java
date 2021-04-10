package omar;

import java.util.Scanner;
public class omar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		Scanner red=new Scanner(System.in);
		
		System.out.print( "ÊÑíÏ åá"+"\n"+"ÇáãÑÈÚ ãÍíØ ÍÓÇÈ-1"+ "\n"+"ÇáÏÇÆÑÉ ãÓÇÍÉ ÍÓÇÈ-2");
		System.out.print("\n"+"ÇáãËáË ãÓÇÍÉ ÍÓÇÈ-3");
		System.out.print("\n"+"áÇ Çã Çæáí ÇáÑÞã ßÇä ÇÐÇ ÊÊÃßÏ Çä æÊÑíÏ ÑÞã áÏíß-4");
		System.out.print("\n"+"ÇáÒæÌíÉ ÇáÇÑÞÇã ãä ãÌãæÚÉ ÇäÔÇÁ ÊÑíÏ-5");
		System.out.print("\n"+"ÇáÔåíÑÉ ÇáÈÑãÌÉ ÈáÛÇÊ ãÕÝæÝÉ ØÈÇÚÉ ÊÑíÏ-6");
		System.out.print("\n"+"\n"+"ÊäÝíÐåÇ ÇáãÑÇÏ ÇáÚãáíÉ ÑÞã ÇÏÎá: ");

		
		int i=red.nextInt();
		
		
		
		if(i==1)
		{
		System.out.print("ÇáãÑÈÚ ÖáÚ Øæá ÇÏÎá: ");
		int w=red.nextInt();
		System.out.print(w*4+" :åæ ÇáãÑÈÚ ãÍíØ");
		}
		
		
		
		else if(i==2)
		{
			System.out.print("ÇáÏÇÆÑÉ ÞØÑ äÕÝ ÇÏÎá:");
		double circle=red.nextInt();
		System.out.print( "ÇáÏÇÆÑÉ ãÓÇÍÉ: " + (Math.PI*Math.pow(circle,2)) );
		}

		
		
		else if(i==3)
		{
		System.out.print("ÇáÞÇÚÏÉ Øæá ÇÏÎá: ");
		int base=red.nextInt();
		System.out.print("ÇáãËáË ÇÑÊÝÇÚ ÇÏÎá:");
		int height=red.nextInt();
	
		System.out.print("ÇáãËáË ãÓÇÍÉ:"+0.5*base*height);
		}
		
		
		else if(i==4)
		{
		System.out.print("3 ãä ÇßÈÑ ÑÞã ÇÏÎá: ");
		int prime=red.nextInt();
		System.out.print( ( (prime%2==0)==false) && ( (prime%3==0)==false) );
		
		}
		
		
		
		else if(i==5)
		{
			System.out.print("ÇáÒæÌíÉ ááÇÑÞÇã ÇáÇÚáì ÇáÍÏ ÇÏÎá: ");
			int number=red.nextInt();
		    for(int num=0; num<=number; num++)
		
		    if( num%2==0 )
			System.out.print(num+" ");
		
		}
		
	
	
		//ãÕÝæÝÉ ÇäÔÇÁ
		else if(i==6)
		{
			String backend[]=new String [5];
		     String back[]= {"JAVA","PYTHON","RUBY"};
		     
		     System.out.print("BACKEND:"+"\n");
		     
		     for( String array:back)
		     System.out.print(array+"," );
		     
		
		    System.out.println("\n");
		
		
		     String frontend[]=new String[5];
		     String front[]= {"HTML","CSS","JAVASCRIPT"};
		     
		     System.out.println("FRONTEND:");
		     
		     for(String array1:front)
		     System.out.print(array1+",");
	    	
		}
		     
	
		
		else
			System.out.println("ERROR!");
		
		
		
		
		
		
		
		}
	}



