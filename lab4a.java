import java.util.Scanner;

public class WordCounter 
{
   public static void main(String[] args) 
   {
      Scanner scanner = new Scanner(System.in);
      while (true) 
      {
         System.out.print("Please enter a sentence: ");
         String statement = scanner.nextLine();
         String[] words = statement.split(" ");
         int numWords = words.length;
         String uppercaseStatement = statement.toUpperCase();
         System.out.println("Your sentence in uppercase: " + uppercaseStatement);
         System.out.println("Your sentence has " + numWords + " words.");
       }
   }
}
