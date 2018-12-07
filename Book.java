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

import java.util.Scanner;

public class Book {
   private String title;
   private String author;
   private String bookNum;
   private boolean loanCheck = false;
   
   public boolean CompareTo1 (String inputTitle) 
   {
      if(inputTitle.equals(title))
      {
         return true;
      }
      else 
      {
         return false;
      }
      
   }
   
   public static Book getBook1(BookInterface bf) 
   {
      
      Scanner scan = new Scanner(System.in);
      System.out.print("책 제목 :");
      String title = scan.nextLine();
      
      int i = bf.searchBook(title);
      if(i != -1)
      {
         System.out.println("이미 등록된 책입니다.");
         return null;
      }
      Book book = new Book();
      book.title = title;
      System.out.print("저자 :");
      book.author = scan.nextLine();
      System.out.print("책번호 :");
      book.bookNum= scan.nextLine();
      return book;
   }
   
   public void bookPrint1() 
   {
      System.out.println("--------------");
      System.out.println("책제목: "+ title);
      System.out.println("저자: "+ author);
      System.out.println("책번호: "+ bookNum);
      System.out.println("대여여부: "+ loanCheck);
   }
   public void SetloanCheck(boolean lCheck)
   {
      loanCheck = lCheck;
   }
   public boolean loanCheck()
   {
      return loanCheck;
   }
}