/*
 *
 * 
 *2017315016 LEESEUNGMIN
 *2017315050 ASANO MITCHEAKI
 *2017315017 SUNJONGHO 
 * 
 */

import java.util.Scanner;
import java.util.Vector;


public class loanSystem
{
   private MemInterface mgr;
   private BookInterface act;
   Vector<loan> loanVector = new Vector<loan>();
   
   public loanSystem(MemInterface m,BookInterface a)
   {
      mgr = m;
      act = a;
   }
   public void loan() 
   {
      // input Member Telno
      Scanner scan = new Scanner(System.in);
      System.out.print("회원 전화번호 :");
      String telno = scan.nextLine();
      int im = mgr.SearchMember(telno);
      if(im != -1) 
      {
         System.out.print("책제목 : ");
         String book = scan.nextLine();
         
         int ib = act.searchBook(book);
         if(ib != -1)
         {
            Book b = act.getAt(ib);
            if (b.loanCheck() == true)
            {
               System.out.println("대출 중인 책입니다. 대출불가");
            }
            else
            {
               loan l = new loan(telno,book);
               loanVector.add(l);
               b.SetloanCheck(true);
               System.out.println("대출되었습니다.");
            }
         }
         else 
         {
            System.out.println("등록되어있지 않은 책입니다.");
         }
      }
      else
      {
         System.out.println("등록된 회원이 아닙니다.");
      }
   }
   
   public int Searchloan(String t,String b) 
   {
      for(int i = 0 ; i < loanVector.size() ; i++) 
      {
         if(   loanVector.get(i).CompareTo(t,b))
         {
            return i;
         }
      }
      return -1;
   }
   
   public void Menu()
   {
      Scanner scan = new Scanner(System.in);
      int iChoice =1;
      while(iChoice !=0) 
      {
         System.out.println("---------------");
         System.out.println("1: 대출");
         System.out.println("2: 반납");
         System.out.println("0: 이전화면");
         
         iChoice = scan.nextInt();
         scan.nextLine();
         switch(iChoice) 
         {
         case 1:
            {
               loan();
               
            }
            break;
         case 2:
            {
               minor();
            }
            break;
         }
      }
   }
   public void minor() 
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("대출자 전화번호 : ");
      String telno = scan.nextLine();
      int im = mgr.SearchMember(telno);
      if(im != -1) 
      {
         System.out.print("책제목 : ");
         String book = scan.nextLine();
         
         int ib = act.searchBook(book);
         if(ib != -1)
         {
            int i = Searchloan(telno,book);
            if (i != -1)
            {
               loanVector.remove(i);
               Book b = act.getAt(ib);
               b.SetloanCheck(false);
               System.out.println("반환되었습니다.");
            }
            else
            {
               System.out.println("대출정보가 존재하지 않습니다.");
            }
         }
         else 
         {
            System.out.println("등록되어 있지 않은 책입니다.");
         }
      }
      else
      {
         System.out.println("등록된 회원이 아닙니다.");
      }
   }
}