package omar;

import java.util.Scanner;
public class ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		Scanner red=new Scanner(System.in);
		
		System.out.print( "���� ��"+"\n"+"������ ���� ����-1"+ "\n"+"������� ����� ����-2");
		System.out.print("\n"+"������ ����� ����-3");
		System.out.print("\n"+"�� �� ���� ����� ��� ��� ����� �� ����� ��� ����-4");
		System.out.print("\n"+"������� ������� �� ������ ����� ����-5");
		System.out.print("\n"+"������� ������� ����� ������ ����� ����-6");
		System.out.print("\n"+"\n"+"������� ������ ������� ��� ����: ");

		
		int i=red.nextInt();
		
		
		
		if(i==1)
		{
		System.out.print("������ ��� ��� ����: ");
		int w=red.nextInt();
		System.out.print(w*4+" :�� ������ ����");
		}
		
		
		
		else if(i==2)
		{
			System.out.print("������� ��� ��� ����:");
		double circle=red.nextInt();
		System.out.print( "������� �����: " + (Math.PI*Math.pow(circle,2)) );
		}

		
		
		else if(i==3)
		{
		System.out.print("������� ��� ����: ");
		int base=red.nextInt();
		System.out.print("������ ������ ����:");
		int height=red.nextInt();
	
		System.out.print("������ �����:"+0.5*base*height);
		}
		
		
		else if(i==4)
		{
		System.out.print("3 �� ���� ��� ����: ");
		int prime=red.nextInt();
		System.out.print( ( (prime%2==0)==false) && ( (prime%3==0)==false) );
		
		}
		
		
		
		else if(i==5)
		{
			System.out.print("������� ������� ������ ���� ����: ");
			int number=red.nextInt();
		    for(int num=0; num<=number; num++)
		
		    if( num%2==0 )
			System.out.print(num+" ");
		
		}
		
	
	
		//������ �����
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



