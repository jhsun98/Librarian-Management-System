import java.util.Scanner;

public class loanSystem
{
	private MemberMgr mgr = new MemberMgr();
	private BookAct act = new BookAct();
	public Member c = new Member();
	
	
	public void loan() 
	{
		Member m = mgr.SearchMember();
		BookAct act = new BookAct();
		
		if(m == null) 
		{
			
			System.out.println("대출가능한 회원입니다.");
			
			Book b = act.searchBook();
			if(b != null)
			{
				System.out.println("대출되었습니다");
				act.deleteBook();
			}
			else 
			{
				System.out.println("대출가능한 책이아닙니다.");
			}
		}
		else
		{
			System.out.println("등록 가능한 회원이 아닙니다.");
		}
	}
	
	public void minor() 
	{
		System.out.print("대출할 책이름 : ");
		Scanner scan = new Scanner(System.in);
		String inputTitle = scan.nextLine();
		
		int i = act.searchBook(inputTitle);
		if(i != -1) 
		{
			act.bookList.remove(i);
			System.out.println("삭제되었습니다.");
		}
		else 
		{
			System.out.println("일치하지않습니다.");
		}
	}
	
	
//	public void loan() 
//	{			
//		System.out.print("찾으실 책이름 : ");
//		Scanner scan = new Scanner(System.in);
//		String inputTitle = scan .nextLine();
//		
//		int i = searchBook(inputTitle);
//		if(i != -1) 
//		{
//			bookList.get(i).bookPrint1();
//		}
//		else 
//		{
//			System.out.println("일치하지않습니다");
//		}
//	}
}
