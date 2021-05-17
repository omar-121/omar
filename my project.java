package omar;

import java.util.Scanner;

public class ãÔÑæÚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner red = new Scanner(System.in);

		System.out.print("ÊÑíÏ åá" + "\n" + "ÇáãÑÈÚ ãÍíØ ÍÓÇÈ-1" + "\n" + "ÇáÏÇÆÑÉ ãÓÇÍÉ ÍÓÇÈ-2");
		System.out.print("\n" + "ÇáãËáË ãÓÇÍÉ ÍÓÇÈ-3");
		System.out.print("\n" + "áÇ Çã Çæáí ÇáÑÞã ßÇä ÇÐÇ ÊÊÃßÏ Çä æÊÑíÏ ÑÞã áÏíß-4");
		System.out.print("\n" + "ÇáÝÑÏíÉ Çæ ÇáÒæÌíÉ ÇáÇÑÞÇã ãä ãÌãæÚÉ ÇäÔÇÁ ÊÑíÏ-5");
		System.out.print("\n" + "ÇáÔåíÑÉ ÇáÈÑãÌÉ ÈáÛÇÊ ãÕÝæÝÉ ØÈÇÚÉ ÊÑíÏ-6");
		System.out.print("\n" + "\n" + "ÊäÝíÐåÇ ÇáãÑÇÏ ÇáÚãáíÉ ÑÞã ÇÏÎá: ");

		int i = red.nextInt();

		if (i == 1) {
			System.out.print("ÇáãÑÈÚ ÖáÚ Øæá ÇÏÎá: ");
			int square = red.nextInt();
			System.out.print(square * 4 + " :åæ ÇáãÑÈÚ ãÍíØ");
		}

		else if (i == 2) {
			System.out.print("ÇáÏÇÆÑÉ ÞØÑ äÕÝ ÇÏÎá:");
			double circle = red.nextInt();
			System.out.print("ÇáÏÇÆÑÉ ãÓÇÍÉ: " + (Math.PI * Math.pow(circle, 2)));
		}

		else if (i == 3) {
			System.out.print("ÇáÞÇÚÏÉ Øæá ÇÏÎá: ");
			int base = red.nextInt();

			System.out.print("ÇáãËáË ÇÑÊÝÇÚ ÇÏÎá:");
			int height = red.nextInt();

			System.out.print("ÇáãËáË ãÓÇÍÉ:" + 0.5 * base * height);
		}

		else if (i == 4) {
			System.out.print("3 ãä ÇßÈÑ ÑÞã ÇÏÎá: ");
			int prime = red.nextInt();
			System.out.print(((prime % 2 == 0) == false) && ((prime % 3 == 0) == false));

		}

		else if (i == 5) {
			System.out.print("ÇáÝÑÏíÉ æ ÇáÒæÌíÉ ááÇÑÞÇã ÇáÇÚáì ÇáÍÏ ÇÏÎá: ");
			int number = red.nextInt();

			for (int num = 0; num <= number; num++)

				if (num % 2 == 0)
					System.out.print(num + " ");

			System.out.println(" " + "\n");// ÇáÝÑÏíÉ æ ÇáÒæÌíÉ ÇáÇÑÞÇã Èíä ãÓÇÝÉ

			for (int num = 0; num <= number; num++)

				if (!(num % 2 == 0))
					System.out.print(num + " ");
		}

		// ãÕÝæÝÉ ÇäÔÇÁ
		else if (i == 6) {
//			String backend[] = new String[5];
			String backandfront[] = { "BACKEND:","\n","JAVA-", "PYTHON-", "RUBY","\n","\n","FRONTEND:","\n","HTML-","CSS-","JAVASCRIPT" };
			for(int loop=0;  loop<backandfront.length; loop++) 

			System.out.print(backandfront[loop]);
			System.out.println("\n"+"DONE:)");
		}
			else 
			
				System.out.print("ERROR!");
						
	
		
	}
}
