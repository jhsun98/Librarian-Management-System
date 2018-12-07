import java.util.*; 
//interface MemInterface
//{
//	public int SearchMember(String Telno); 
//}

public class MemberMgr
{
	Vector<Member> MemVector = new Vector<Member>();
	Scanner scan= new Scanner(System.in);
	String Telno;
	private void InserMember() 
	{
		Member m = Member.getMember(this);
		if(m != null) 
		{
			MemVector.add(m);
		}
		else
		{
			System.out.println("중복되는 이름 입니다.");
		}
	}
	
	private void PrintAllMember() 
	{
		for(int i = 0; i < MemVector.size(); i++) 
		{
			MemVector.get(i).PrintData();
		}
	}
	
	public int SearchMember(String Telno) 
	{
		for(int i = 0 ; i < MemVector.size() ; i++) 
		{
			if(	MemVector.get(i).CompareTo(Telno))
			{
				return i;
			}
		}
		return -1;
	}
	
	public Member SearchMember() 
	{
		System.out.print("입력하실 이름 : ");
		Telno = scan.nextLine();
		
		int i = SearchMember(Telno);
		if(i != -1) 
		{
			return MemVector.get(i);
		}
		else 
		{
			return null;
		}
		
	}
	
	private void DeleteMember() 
	{
		System.out.print("삭제할 이름 : ");
		String Telno = scan.nextLine();
		
		int i =SearchMember(Telno);
		if(i != -1) 
		{
			MemVector.remove(i);
			System.out.println("삭제되었습니다.");
		}
		else 
		{
			System.out.println("일치하지않습니다");
		}
		
	}
	
	public void Menu() 
	{
		int iChoice = 1;
		while(iChoice != 0) 
		{
			System.out.println("------------------");
			System.out.println("1: 회원 등록");
			System.out.println("2: 회원 출력");
			System.out.println("3: 회원 검색");
			System.out.println("4: 회원 삭제");
			System.out.println("0: 이전화면");
			iChoice = scan.nextInt();
			scan.nextLine();
			switch(iChoice) 
			{
			case 1: 
				{
					InserMember();
				}
				break;
				
			case 2: 
				{
					PrintAllMember();
				}
				break;
			case 3: 
				{
					SearchMember();
				}
				break;
			case 4: 
				{
					DeleteMember();
				}
			}
		}
	}
}