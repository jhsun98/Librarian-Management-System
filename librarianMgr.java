import java.util.*;
/*
*
* 
*2017315016 LEESEUNGMIN
*2017315050 ASANO MITCHEAKI
*2017315017 SUNJONGHO 
* 
*/

public class librarianMgr 
{
   private MemberMgr mgr = new MemberMgr();
   public BookAct act = new BookAct();
   public loanSystem loan = new loanSystem(mgr,act);
   public void Menu()
   {
      Scanner scan = new Scanner(System.in);
      int iChoice =1;
      while(iChoice !=0) 
      {
         System.out.println("---------------");
         System.out.println("1: 회원관리");
         System.out.println("2: 도서관리");
         System.out.println("3: 대여관리");
         System.out.println("0: 종료");
         
         iChoice = scan.nextInt();
         scan.nextLine();
         switch(iChoice) 
         {
         case 1:
            {
               mgr.Menu();
               
            }
            break;
         case 2:
            {
               act.menu1();
            }
            break;
         case 3:
            {
               loan.Menu();
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