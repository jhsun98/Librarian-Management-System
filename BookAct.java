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
interface BookInterface
{
   public int searchBook(String inputTitle);
   public Book getAt(int i);
}

public class BookAct implements BookInterface
{
   Vector<Book> bookList = new Vector<Book>();
   
   Scanner scan= new Scanner(System.in);
   public Book getAt(int i)
   {
      return bookList.get(i);
   }
   private void insertBook() 
   {
      Book book = Book.getBook1(this);
      if(book != null) 
      {
         bookList.add(book);
         System.out.println("도서 등록 성공.");
      }
      else
      {
         System.out.println("도서 등록 실패.");
      }
   }
   
   private void printAllBook()
   {
      for(int i = 0; i < bookList.size(); i++) 
      {
         bookList.get(i).bookPrint1();
         
      }
   }
   
   public int searchBook(String inputTitle) 
   {
      for(int i = 0 ; i < bookList.size() ; i++) 
      {
         if(   bookList.get(i).CompareTo1(inputTitle))
         {
            return i;
         }
      }
      return -1;
   }
   
   public void searchBook() 
   {
      System.out.print("찾으려는 책제목 : ");
      String title = scan.nextLine();
      
      int i = searchBook(title);
      if(i != -1) 
      {
         bookList.get(i).bookPrint1();
      }
      else 
      {
         System.out.println("등록되어 있지 않은 도서입니다. ");
      }
   }
   
   public void deleteBook() 
   {
      System.out.print("삭제하려는 책 제목 : ");
      String title = scan.nextLine();
      
      int i = searchBook(title);
      if(i != -1) 
      {
         bookList.remove(i);   
         System.out.println("도서 삭제 성공.");
      }
      else 
      {   
         System.out.println("삭제하려는 책을 찾을 수 없습니다.");
      }
   }
   
   public void menu1() 
   {
      int iChoice = 1;
      while(iChoice != 0) 
      {
         System.out.println("------------------");
         System.out.println("1: 도서등록");
         System.out.println("2: 도서출력");
         System.out.println("3: 도서검색");
         System.out.println("4: 도서삭제");
         System.out.println("0: 이전화면");
         iChoice = scan.nextInt();
         scan.nextLine();
         switch(iChoice) 
         {
         case 1: 
            {
               insertBook();
            }
            break;
            
         case 2: 
            {
               printAllBook();
            }
            break;
         case 3: 
            {
               searchBook();
            }
            break;
         case 4: 
            {
               deleteBook();
            }
            break;   
         }
      }
   }
}
