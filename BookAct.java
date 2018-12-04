//import java.util.Scanner;
//import java.util.Vector;
//
//interface bookInterface
//{
//	public int searchBook(String inputTitle); 
//}
//
//public class BookAct implements bookInterface {
//	Vector<Book> bookList = new Vector<Book>();
//	Scanner scan;
//	
//	public void BookAct() {
////		Scanner scan = new Scanner(System.in);
//		int iChoice = 1;
//		while(iChoice != 0) 
//		{
//			System.out.println("------------------");
//			System.out.println("1: 책 등록");
//			System.out.println("2: 책 리스트 출력");
//			System.out.println("3: 책 검색");
//			System.out.println("4: 책 삭제");
//			
//			System.out.println("");
//			System.out.print("번호를 입력해주십시오: ");
//			scan = new Scanner(System.in);
//			iChoice = scan.nextInt();
////			scan.nextLine();
//			switch(iChoice) 
//			{
//			case 1: 
//				{
//					insertBook();
//				}
//				break;
//				
//			case 2: 
//				{
//					printBook();
//				}
//				break;
//			case 3: 
//				{
//					searchBook();
//				}
//				break;
//			case 4: 
//				{
//					deleteBook();
//				}
//				break;
//			}
//		}
//	}
//	
//	private void insertBook() {
//		Book book = book.getBook(this);
//		if(book != null) 
//		{
//			bookList.add(book);
//		}
//		else
//		{
//			System.out.println("중복되는  입니다.");
//		}
//	}
//	
//	private void printBook() 
//	{
//		for (int i = 0; i < bookList.size(); i++) {
//			
//			bookPrint();
//			registeredBooks.get(i).BookInsert();
//		}
//		
//		if(registeredBooks.size() == 0) {
//			System.out.println("등록된 책이 없습니다.");
//		}
//	}
//	
//	private void searchBook()
//	{	
//		System.out.println("제목 입력: ");
//		scan = new Scanner(System.in);
//		String inputBookTitle = scan.nextLine();
//		for (int i = 0; i < bookList.size(); i++) {
//			if(inputBookTitle == bookList.elementAt(i).title) {
//				System.out.println("--------------");
//				System.out.println("제목: "+ bookList.elementAt(i).title);
//				System.out.println("저자: "+ bookList.elementAt(i).author);
//				System.out.println("책코드넘버: "+ bookList.elementAt(i).bookNum);
//				return;
//			}
//		}
//		
//		System.out.println("입력한 제목의 책은 없습니다.");
//		
//	}
//	
//	private void deleteBook()
//	{	
//		System.out.println("제목 입력: ");
//		scan = new Scanner(System.in);
//		String inputBookTitle = scan.nextLine();
//		for (int i = 0; i < bookList.size(); i++) {
//			if(inputBookTitle == bookList.elementAt(i).title) {
//				System.out.print(bookList.elementAt(i).title + "의 정보를 삭제해도 됩니까?(yes/no): ");
//				String inputAnswer = scan.nextLine();
//				if(inputAnswer == "yes") {
//					registeredBooks.removeElementAt(i);
//					System.out.println("정보를 삭제했습니다!");
//					return;
//				}
//				else if(inputAnswer == "no") {
//					return;
//				}			
//			}
//		}
//		System.out.println("입력한 제목의 책은 없습니다.");
//	}
//
//	@Override
//	public int searchBook(String inputTitle) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}

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
	
	private void insertBook() 
//	private void InserMember(MemberMgr this) 
	{
		Book book = Book.getBook(this);
		if(book != null) 
		{
			bookList.add(book);
		}
		else
		{
			System.out.println("중복되는 이름 입니다.");
		}
	}
	
	private void printAllBook()
	{
		for(int i = 0; i < bookList.size(); i++) 
		{
			bookList.get(i).bookPrint();
		}
	}
	
	public int searchBook(String inputTitle) 
	{
		for(int i = 0 ; i < bookList.size() ; i++) 
		{
			if(	bookList.get(i).CompareTo(inputTitle))
			{
				return i;
			}
		}
		return -1;
	}
	
	private void searchBook() 
	{
		System.out.print("찾으실 이름 : ");
		String inputTitle = scan.nextLine();
		
		int i = searchBook(inputTitle);
		if(i != -1) 
		{
			bookList.get(i).bookPrint();
		}
		else 
		{
			System.out.println("일치하지않습니다");
		}
		
	}
	
	private void deleteBook() 
	{
		System.out.print("삭제할 이름 : ");
		String inputTitle = scan.nextLine();
		
		int i = searchBook(inputTitle);
		if(i != -1) 
		{
			bookList.remove(i);
			System.out.println("삭제되었습니다.");
		}
		else 
		{
			System.out.println("일치하지않습니다");
		}
		
	}
	
	public void menu() 
	{
		int iChoice = 1;
		while(iChoice != 0) 
		{
			System.out.println("------------------");
			System.out.println("1: 책 등록");
			System.out.println("2: 책 리스트 출력");
			System.out.println("3: 책 검색");
			System.out.println("4: 책 삭제");
			
			System.out.println("");
			System.out.print("번호를 입력해주십시오: ");
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