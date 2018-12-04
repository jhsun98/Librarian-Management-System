import java.util.Scanner;
import java.util.Vector;

public class Book 
{
	private String Title;
	private String author;
	private String bookNum;
	
	
	public void BookData() 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("책의 제목 입력해주세요 :");
		Title = scan.nextLine();
		System.out.print("책의 저자를 입력해주세요 :");
		author = scan.nextLine();
		System.out.print("책의 코드넘버를 입력해주세요 :");
		bookNum= scan.nextLine();	
		
	}
	
	public void BookPrint() 
	{
		System.out.println("--------------");
		System.out.println("제목: "+ Title);
		System.out.println("저자: "+ author);
		System.out.println("책코드넘버: "+ Title);
	}
	
	public void menu() 
	{
		Scanner scan = new Scanner(System.in);
		int iChoice = 1;
		while(iChoice != 0) 
		{
			System.out.println("------------------");
			System.out.println("1: 책 등록");
			System.out.println("2: 책 리스트 출력");
			System.out.println("3: 책 검색");
			System.out.println("4: 책 삭제");
			
			iChoice = scan.nextInt();
			scan.nextLine();
			switch(iChoice) 
			{
			case 1: 
				{
					BookData();
				}
				break;
				
			case 2: 
				{
					BookPrint();
				}
//				break;
//			case 3: 
//				{
//					SearchMember();
//				}
//				break;
//			case 4: 
//				{
//					DeleteMember();
//				}
			}
		}
	}
}

