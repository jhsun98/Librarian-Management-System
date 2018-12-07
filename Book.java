import java.util.Scanner;
import java.util.Vector;

import java.util.Scanner;

public class Book {
	private String title;
	private String author;
	private String bookNum;
	
	public boolean CompareTo1 (String inputTitle) 
	{
		if(inputTitle.equals(title))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	public static Book getBook1(BookInterface bf) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("책의 제목을 입력해주세요 :");
		String title = scan.nextLine();
		
		int i = bf.searchBook(title);
		if(i != -1)
		{
			return null;
		}
		Book book = new Book();
		book.title = title;
		System.out.print("책의 저자를 입력해주세요 :");
		book.author = scan.nextLine();
		System.out.print("책의 코드넘버를 입력해주세요 :");
		book.bookNum= scan.nextLine();
		return book;
	}
	
	public void bookPrint1() 
	{
		System.out.println("--------------");
		System.out.println("제목: "+ title);
		System.out.println("저자: "+ author);
		System.out.println("책코드넘버: "+ bookNum);
	}
	
	
}