import java.util.Scanner;

public class Member 
{
	private String TellNO;
	private String Name;
	private String addr;
	private int age;
	
	public boolean CompareTellNo(String Num)
	{
		return TellNO.equals(Num);
	}
	public static Member getMember(IMemSearch mMgr)
	{	
		Scanner scan =  new Scanner(System.in);
		System.out.print("전화번호를 입력해주세요 : ");
		String Tel = scan.nextLine();
		int i = mMgr.SearchMember(Tel);
		if (i != -1)
		{
			return null;
		}
		
		Member m = new Member();
		m.TellNO = Tel;
		System.out.print("이름을 입력해주세요 : ");
		m.Name = scan.nextLine();
		System.out.print("주소를 입력해주세요 : ");
		m.addr = scan.nextLine();
		System.out.print("나이를 입력해주세요 : ");
		m.age = scan.nextInt();
		scan.nextLine();
		System.out.println("----------------");
		return m;
	}

	public void PrintData() 
	{
		System.out.println("----------------");
		System.out.println("전번 : " + TellNO);
		System.out.println("이름 : " + Name);
		System.out.println("주소 : " + addr);
		System.out.println("나이 : " + age );
		
	}
}
