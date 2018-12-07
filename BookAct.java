
import java.util.Scanner;
import java.util.Vector; 
interface BookInterface
{
	public int searchBook(String inputTitle); 
}

public class BookAct implements BookInterface
{
	Vector<Book> bookList = new Vector<Book>();
	
	Scanner scan= new Scanner(System.in);
	String book;
	String inputTitle;
	private void insertBook() 
//	private void InserMember(MemberMgr this) 
	{
		Book book = Book.getBook1(this);
		if(book != null) 
		{
			bookList.add(book);
		}
		else
		{
			System.out.println("중복되는 코드넘버 입니다.");
		}
	}
	
	private void printAllBook()
	{
		for(int i = 0; i < bookList.size(); i++) 
		{
			bookList.get(i).bookPrint1();
			
		}
	}
	
	public int searchBook(String inputTitle) 
	{
		for(int i = 0 ; i < bookList.size() ; i++) 
		{
			if(	bookList.get(i).CompareTo1(inputTitle))
			{
				return i;
			}
		}
		return -1;
	}
	
	public Book searchBook() 
	{
		System.out.print("찾으실 책이름 : ");
		book = scan.nextLine();
		
		int i = searchBook(book);
		if(i != -1) 
		{
			return bookList.get(i);
		}
		else 
		{
			return null;
		}
		
	}
	
	public Book deleteBook() 
	{
		System.out.print("삭제할 책이름 : ");
		inputTitle = scan.nextLine();
		
		int i = searchBook(inputTitle);
		if(i != -1) 
		{
			System.out.println("삭제되었습니다.");
			return bookList.remove(i);	
		}
		else 
		{	
			System.out.println("일치하지않습니다.");
			return null;
			
		}
		
	}
	
	public void menu1() 
	{
		int iChoice = 1;
		while(iChoice != 0) 
		{
			System.out.println("------------------");
			System.out.println("1: 책 등록");
			System.out.println("2: 책 리스트 출력");
			System.out.println("3: 책 검색");
			System.out.println("4: 책 삭제");
			System.out.println("0: 이전화면");
			
//			System.out.println("");
			System.out.print("숫자를 입력해주십시오: ");
			iChoice = scan.nextInt();
			scan.nextLine();
			switch(iChoice) 
			{
			case 1: 
				{
					insertBook();
				}
				break;
				
			case 2: 
				{
					printAllBook();
				}
				break;
			case 3: 
				{
					searchBook();
				}
				break;
			case 4: 
				{
					deleteBook();
				}
			
			}
		}
	}
}