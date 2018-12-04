import java.util.*;

public class Member 
{
	private String Tel;
	private String name;
	private String addr;
	private int age;
	
	public boolean CompareTo (String Telno) 
	{
		if(Telno.equals(Tel))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	public static Member getMember(MemInterface mgr) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 :");
		String Tel = scan.nextLine();
		
		int i =mgr.SearchMember(Tel);
		if(i != -1)
		{
			return null;
		}
		
		Member m = new Member();
		m.Tel = Tel;
		
		System.out.print("전화번호를 입력해주세요 :");
		m.name = scan.nextLine();
		System.out.print("주소를 입력해주세요 :");
		m.addr = scan.nextLine();
		System.out.print("나이를 입력해주세요 :");
		m.age = scan.nextInt();
		scan.nextLine();
		return m;
	}
	
	public void PrintData() 
	{
		System.out.println("------------------");
		System.out.println("이름 : " + Tel);
		System.out.println("전화번호 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("나이 : "+ age);
		
	}
		
}
