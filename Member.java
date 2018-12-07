import java.util.*;
/*
*
* 
*2017315016 LEESEUNGMIN
*2017315050 ASANO MITCHEAKI
*2017315017 SUNJONGHO 
* 
*/

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
   
   public static Member getMember(MemberMgr mgr) 
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("전화번호 : ");
      String Tel = scan.nextLine();
      
      int i =mgr.SearchMember(Tel);
      if(i != -1)
      {
         return null;
      }
      
      Member m = new Member();
      m.Tel = Tel;
      
      System.out.print("회원이름 :");
      m.name = scan.nextLine();
      System.out.print("주소 :");
      m.addr = scan.nextLine();
      System.out.print("나이 :");
      m.age = scan.nextInt();
      scan.nextLine();
      return m;
   }
   
   public void PrintData() 
   {
      System.out.println("------------------");
      System.out.println("전화번호 : " + Tel);
      System.out.println("이름 : " + name);
      System.out.println("주소 : " + addr);
      System.out.println("나이 : "+ age);
      
   }
      
}