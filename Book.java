import java.util.Scanner;

public class Book {
	private String title;
	private String author;
	private String bookNum;
	
	public boolean CompareTo (String inputTitle) 
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
	
	public static Book getBook(BookInterface bf) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("å�� ������ �Է����ּ��� :");
		String title = scan.nextLine();
		
		int i = bf.searchBook(title);
		if(i != -1)
		{
			return null;
		}
		Book book = new Book();
		book.title = title;
		System.out.print("å�� ���ڸ� �Է����ּ��� :");
		book.author = scan.nextLine();
		System.out.print("å�� �ڵ�ѹ��� �Է����ּ��� :");
		book.bookNum= scan.nextLine();
		return book;
	}
	
	public void bookPrint() 
	{
		System.out.println("--------------");
		System.out.println("����: "+ title);
		System.out.println("����: "+ author);
		System.out.println("å�ڵ�ѹ�: "+ bookNum);
	}
	
	
}
