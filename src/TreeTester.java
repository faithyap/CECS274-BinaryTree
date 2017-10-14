import java.util.Scanner;
public class TreeTester {

		 public static void main(String[] args)
		   {
		      BinaryTree questionTree = new BinaryTree("Have you taken CECS 100?",
		         new BinaryTree("Have you taken CECS 174?",
		            new BinaryTree("Have you taken CECS 274?",
		               new BinaryTree("Take CECS 282"),
		               new BinaryTree("Take CECS 228, 262, 274, or 301")),
		            new BinaryTree("Take CECS 174.")),
		         new BinaryTree("Have you taken MATH 122?",
		            new BinaryTree("Take MATH 123"),
		            new BinaryTree("Have you taken CECS 201?",
		               new BinaryTree("Take CECS 301 or CECS 311"),
		               new BinaryTree("Take CECS 201."))));
		      System.out.println("Hello computer engineering major!");
		      System.out.println("Please answer the following questions to help you determine what course you should take next semester.");
		      boolean done = false;
		      Scanner in = new Scanner(System.in);
		      while (!done)
		      {
		         BinaryTree left = questionTree.left();
		         BinaryTree right = questionTree.right();
		         if (left.isEmpty() && right.isEmpty())
		         {
		            System.out.println(questionTree.data());
		            done = true;
		         }
		         else
		         {
		            String response;
		            do
		            {
		               System.out.print(questionTree.data() + " (Y/N) ");
		               response = in.next().toUpperCase();
		            } 
		            while (!response.equals("Y") && !response.equals("N"));

		            if (response.equals("Y"))
		            {
		               questionTree = left;         
		            }
		            else
		            {
		               questionTree = right;         
		            }
		         }
		      }
		   
	}

}
