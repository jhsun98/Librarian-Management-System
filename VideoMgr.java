import java.util.*;
public class VideoMgr 
{
	public static void main(String[]args) 
	{
		MemberMgr mMgr = new MemberMgr();
		int iChoice = 1;
		Scanner scan = new Scanner(System.in);
		while(iChoice != 0) 
		{
			System.out.println("1: 회원관리");
			System.out.println("2: 비디오 관리");
			System.out.println("3: 대여관리");
			System.out.println("0 : 종료 ");
			iChoice = scan.nextInt();
			scan.nextLine();
			switch(iChoice) 
			{
			case 1:
				{
					mMgr.Menu();
				}
				break;
			case 2:
				{
					System.out.println("비디오 관리");
				}
				break;
			case 3:
				{
					System.out.println("대여관리");
				}
				break;
			}
			
		}
		
	}
}
