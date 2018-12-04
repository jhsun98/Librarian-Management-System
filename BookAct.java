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
//			System.out.println("1: å ���");
//			System.out.println("2: å ����Ʈ ���");
//			System.out.println("3: å �˻�");
//			System.out.println("4: å ����");
//			
//			System.out.println("");
//			System.out.print("��ȣ�� �Է����ֽʽÿ�: ");
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
//			System.out.println("�ߺ��Ǵ�  �Դϴ�.");
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
//			System.out.println("��ϵ� å�� �����ϴ�.");
//		}
//	}
//	
//	private void searchBook()
//	{	
//		System.out.println("���� �Է�: ");
//		scan = new Scanner(System.in);
//		String inputBookTitle = scan.nextLine();
//		for (int i = 0; i < bookList.size(); i++) {
//			if(inputBookTitle == bookList.elementAt(i).title) {
//				System.out.println("--------------");
//				System.out.println("����: "+ bookList.elementAt(i).title);
//				System.out.println("����: "+ bookList.elementAt(i).author);
//				System.out.println("å�ڵ�ѹ�: "+ bookList.elementAt(i).bookNum);
//				return;
//			}
//		}
//		
//		System.out.println("�Է��� ������ å�� �����ϴ�.");
//		
//	}
//	
//	private void deleteBook()
//	{	
//		System.out.println("���� �Է�: ");
//		scan = new Scanner(System.in);
//		String inputBookTitle = scan.nextLine();
//		for (int i = 0; i < bookList.size(); i++) {
//			if(inputBookTitle == bookList.elementAt(i).title) {
//				System.out.print(bookList.elementAt(i).title + "�� ������ �����ص� �˴ϱ�?(yes/no): ");
//				String inputAnswer = scan.nextLine();
//				if(inputAnswer == "yes") {
//					registeredBooks.removeElementAt(i);
//					System.out.println("������ �����߽��ϴ�!");
//					return;
//				}
//				else if(inputAnswer == "no") {
//					return;
//				}			
//			}
//		}
//		System.out.println("�Է��� ������ å�� �����ϴ�.");
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
			System.out.println("�ߺ��Ǵ� �̸� �Դϴ�.");
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
		System.out.print("ã���� �̸� : ");
		String inputTitle = scan.nextLine();
		
		int i = searchBook(inputTitle);
		if(i != -1) 
		{
			bookList.get(i).bookPrint();
		}
		else 
		{
			System.out.println("��ġ�����ʽ��ϴ�");
		}
		
	}
	
	private void deleteBook() 
	{
		System.out.print("������ �̸� : ");
		String inputTitle = scan.nextLine();
		
		int i = searchBook(inputTitle);
		if(i != -1) 
		{
			bookList.remove(i);
			System.out.println("�����Ǿ����ϴ�.");
		}
		else 
		{
			System.out.println("��ġ�����ʽ��ϴ�");
		}
		
	}
	
	public void menu() 
	{
		int iChoice = 1;
		while(iChoice != 0) 
		{
			System.out.println("------------------");
			System.out.println("1: å ���");
			System.out.println("2: å ����Ʈ ���");
			System.out.println("3: å �˻�");
			System.out.println("4: å ����");
			
			System.out.println("");
			System.out.print("��ȣ�� �Է����ֽʽÿ�: ");
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