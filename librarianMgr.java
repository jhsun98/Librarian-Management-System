import java.util.*;

public class librarianMgr 
{
	private MemberMgr mmgr = new MemberMgr();
	private Book Book = new Book();
	public void Menu()
	{
		Scanner scan = new Scanner(System.in);
		int iChoice =1;
		while(iChoice !=0) 
		{
			System.out.println("---------------");
			System.out.println("1: 회원 관리");
			System.out.println("2: 도서 관리");
			System.out.println("3: 대여관리");
			System.out.println("0: 종료");
			
			iChoice = scan.nextInt();
			scan.nextLine();
			switch(iChoice) 
			{
			case 1:
				{
					mmgr.Menu();
					
				}
				break;
			case 2:
				{
					Book.menu();
				}
				break;
			case 3:
				{
					System.out.println("3: 대여관리");
				}
				break;
			}
		}
	}
	public static void main(String[]args) 
	{
		librarianMgr m = new librarianMgr();
		m.Menu();
	}
}
