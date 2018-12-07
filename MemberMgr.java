import java.util.*;
/*
*
* 
*2017315016 LEESEUNGMIN
*2017315050 ASANO MITCHEAKI
*2017315017 SUNJONGHO 
* 
*/

interface MemInterface
{
   public int SearchMember(String Telno);   //占쎈뼎占쎌뵬筌욑옙 �겫占썽겫占�
}

public class MemberMgr implements MemInterface
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
         System.out.println("회원등록 성공.");
      }
      else
      {
         System.out.println("회원등록 실패.");
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
         if(   MemVector.get(i).CompareTo(Telno))
         {
            return i;
         }
      }
      return -1;
   }
      
   public void SearchMember() 
   {
      System.out.print("찾으려는 회원 전화번호 : ");
      Telno = scan.nextLine();
      
      int i = SearchMember(Telno);
      if(i != -1) 
      {
         MemVector.get(i).PrintData();
      }
      else 
      {
         System.out.print("등록된 회원이 아닙니다. ");
      }
   }
   
   private void DeleteMember() 
   {
      System.out.print("삭제하려는 회원 전화번호 : ");
      String Telno = scan.nextLine();
      
      int i =SearchMember(Telno);
      if(i != -1) 
      {
         MemVector.remove(i);
         System.out.println("회원삭제를 성공하였습니다.");
      }
      else 
      {
         System.out.println("삭제하려는 회원을 찾을 수 없습니다.");
      }
      
   }
   
   public void Menu() 
   {
      int iChoice = 1;
      while(iChoice != 0) 
      {
         System.out.println("------------------");
         System.out.println("1: 회원등록");
         System.out.println("2: 회원출력");
         System.out.println("3: 회원검색");
         System.out.println("4: 회원삭제");
         System.out.println("0: 이전메뉴");
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