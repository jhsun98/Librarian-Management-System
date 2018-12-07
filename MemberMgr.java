import java.util.*;
interface IMemSearch{
	public int SearchMember(String Num);
}

public class MemberMgr implements IMemSearch {
	Vector<Member> MemVector = new Vector<Member>();
	
	private void MemberInsert()
//	private void MemberInsert(MemberMgr this)
	{
		Member m = Member.getMember(this);
		if (m != null)
		{
			MemVector.add(m);
		}
		else
		{
			System.out.println("이미 등록된 회원입니다.");
			System.out.println("----------------");
		}
	}
	
	private void MemberPrint() 
	{
		for(int i = 0 ; i < MemVector.size() ;i++) 
		{
			MemVector.get(i).PrintData();
		}
	}
	
	public int SearchMember(String Num)
	{
		for(int i =0 ; i < MemVector.size();i++) 
		{
			if( MemVector.get(i).CompareTellNo(Num))
			{
				return i;	
			}	
		}
		return -1;
	}
	
	private void SearchMember() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("찾으려는 전화번호 : ");
		String Num = scan.nextLine();
		int i = SearchMember(Num);
		if (i  != -1)
		{
			MemVector.get(i).PrintData();
		}
		else
		{
			System.out.println("찾으시는 전번이 없습니다.");
			System.out.println("----------------");
		}
	}
	
	private void RemoveMember() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 전화번호 : ");
		String Num = scan.nextLine();
		int i = SearchMember(Num);
		if(i != -1) 
		{
			MemVector.remove(i);
			System.out.println("삭제되었습니다");
		}
		else
		{	
			System.out.println("찾으시는 전번이 없습니다.");
			System.out.println("----------------");
	
		}
	}
	
	public void Menu()
	{
		Scanner scan= new Scanner(System.in);
		int iChoice = 1;
		while(iChoice != 0) 
		{
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
					MemberInsert();
				}
				break;
			case 2:
				{
					MemberPrint();
				}
				break;
			case 3:
				{
					SearchMember();
				}
				break;
			case 4:
				{
					RemoveMember();
				}
				break;
			}
		}
	}
}
