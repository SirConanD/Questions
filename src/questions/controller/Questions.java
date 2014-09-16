package questions.controller;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
   private Scanner questionScanner;
   
   public Questions()
   {
	   questionScanner = new Scanner(System.in);
   }
   
   public void start()
   {
	   //askQuestions();
	   askQuestionsGUI();
   }
   
   private void askQuestionsGUI()
   {
	   JOptionPane.showMessageDialog(null, "What is your name?");
	   String answerGUI = JOptionPane.showInputDialog("What is your name?");
	   answerGUI = JOptionPane.showInputDialog("Hi, " + answerGUI + ".  What is your favorite color?");
	   answerGUI = JOptionPane.showInputDialog(" so " + answerGUI + " is your favorite color.  Alright what is your favorite song?");
	   answerGUI = JOptionPane.showInputDialog(" so " + answerGUI + " is your favorite song.  Okay whats your favorite book?");
	   answerGUI = JOptionPane.showInputDialog(" so " + answerGUI + " is your favorite book.  Well What is yur favorite food?");
	   answerGUI = JOptionPane.showInputDialog(" so " + answerGUI + " is your favorite book. Okay final question what grade are you in?");
	   JOptionPane.showMessageDialog(null, " so you are in " + answerGUI + " grade.  Well thanks for answering my questions.");
   }
   
   private void askQuestions()
   {
	   System.out.println("What is your name?");
	   String answer = questionScanner.nextLine();
	   System.out.println("Why hello there "+ answer +". How are you today?");
	   answer = questionScanner.nextLine();
	   System.out.println("You feel "+ answer +". Well thats nice.");
	   System.out.println("What is your age?");
	   answer = questionScanner.nextLine();
	   System.out.println("Your "+ answer +". Okay.  What is yur favorite number?");
	   answer = questionScanner.nextLine();
	   System.out.println(""+ answer +" is a nice number.");
   }
   
   private void moreQuestions()
   {
	   
   }
}
