import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    DayPlanner d1 = new DayPlanner ("February", "Thursday");
      d1.setYear (11);
      d1.setDay (30);
    DayPlanner d2 =
      new DayPlanner ("February", 15, "Thursday", 2019,
		      "take out the trash or YOURE DEAD");
    DayPlanner d3 =
      new DayPlanner ("February", 16, "Friday", 2019, "Read a book");
    DayPlanner d4 =
      new DayPlanner ("February", 17, "Saturday", 2019,
		      "take it easy, listen to music");
    DayPlanner d5 =
      new DayPlanner ("February", 18, "Sunday", 2019, "Do Homework");
    DayPlanner d6 =
      new DayPlanner ("February", 19, "Monday", 2019,
		      "take out the trash or YOURE DEAD");
      System.out.println (d2.toString ());

    PlannedDay week1 = new PlannedDay ("Moderate");
      week1.setPWeek ("February 15 to 22");
      week1.addDayPlanner (d1);
      week1.addDayPlanner (d2);
      week1.addDayPlanner (d3);
      week1.addDayPlanner (d4);
      week1.addDayPlanner (d5);
      week1.addDayPlanner (d6);
      System.out.println (week1.getWeek ());
    //this is the scheduler for a time management method I found to be really effective. This uses the omodoro method in order to organize your tasks and your work, with break times and sufficient work time in order to finish a task.
    String tN;
    double _time;
    double aB;
    int sS;
    //this could be implemented with other time management methods as well, the final roduct will have 4 of them, but I havent decided which ones 
    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter in the name of the task.");
      tN = scan.nextLine ();
      System.out.
      println
      ("Enter in the amount of chunks for the session (up to 8 chunks, half will be breaks, only divisible by 2");
      sS = scan.nextInt ();
      System.out.
      println ("Enter in the time alloted for the task. (in minutes)");
      _time = scan.nextInt ();
      aB = (sS / 2);

    double _btime = (_time / (4 * aB));
    double _atpC = (_time / sS);
    //how this works, user inuts the amount of study chunks in one session, and breaks are there ut into this with the omodoro technique, inuts time and the time will be divided int o 4 in order to create sufficient breaks to create a roductive session.You can use a binary search algorithm in order to filter the tasks that take the least amount of time in order to comlete
      System.out.println ("Study Session: " + tN + "\nTime Alloted: " +
			  _time + "\nNumber of Breaks: " + aB +
			  "\nAmount of Chunks: " + sS);
    if (sS == 2)
      {
	System.out.println (tN + ": " + _time + "minutes" + "\nBreak: " +
			    _btime + "minutes");
      }
    else if (sS == 4)
      {
	System.out.println (tN + ": " + _atpC + "minutes" + "\nBreak: " +
			    _btime + "minutes" + "\n" + tN + ": " + _atpC +
			    "minutes" + "\nBreak: " + _btime + "minutes" +
			    "\n");
      }
    else if (sS == 6)
      {
	System.out.println (tN + ": " + _atpC + "minutes" + "\nBreak: " +
			    _btime + "minutes" + tN + ": " + _atpC +
			    "minutes" + "\nBreak: " + _btime + "minutes" +
			    tN + ": " + _atpC + "minutes" + "\nBreak: " +
			    _btime + "minutes");
      }
    else if (sS == 8)
      {
	System.out.println (tN + ": " + _atpC + "minutes" + "\nBreak: " +
			    _btime + "minutes" + "\n" + tN + ": " + _atpC +
			    "minutes" + "\nBreak: " + _btime + "minutes" +
			    "\n" + tN + ": " + _atpC + "minutes" +
			    "\nBreak: " + _btime + "minutes" + "\n" + tN +
			    ": " + _atpC + "minutes" + "\nBreak: " + _btime +
			    "minutes" + "\n");
      }
    else
      System.out.
	println ("you messed up :( enter the correct values this time");
  }
}
