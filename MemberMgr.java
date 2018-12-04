import java.util.*; 
interface MemInterface
{
	public int SearchMember(String Telno); 
}

public class MemberMgr implements MemInterface
{
	Vector<Member> MemVector = new Vector<Member>();
	Scanner scan= new Scanner(System.in);
	
	private void InserMember() 
//	private void InserMember(MemberMgr this) 
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
	
	private void SearchMember() 
	{
		System.out.print("찾으실 이름 : ");
		String Telno = scan.nextLine();
		
		int i =SearchMember(Telno);
		if(i != -1) 
		{
			MemVector.get(i).PrintData();
		}
		else 
		{
			System.out.println("일치하지않습니다");
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
