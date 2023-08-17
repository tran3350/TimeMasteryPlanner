//this will allow the user to group up their tasksfor the week into manageable pieces into "Planned Days"
import java.util.ArrayList;
public class PlannedDay
{
  private String _Week;
  private String _dDescription;
  private ArrayList < DayPlanner > PlannedWeek;

  public PlannedDay (String dD)
  {
    _dDescription = dD;
    PlannedWeek = new ArrayList < DayPlanner > ();
  }

  public void addDayPlanner (DayPlanner dp)
  {
    PlannedWeek.add (dp);
  }

  public DayPlanner getPlannedDay (int i)
  {
    return PlannedWeek.get (i);
  }

  public void removePlannedDay (int i)
  {
    PlannedWeek.remove (i);
  }

  public void setPWeek (String w)
  {
    _Week = w;
  }

  public String getPWeek ()
  {
    return _Week;
  }

  public void setdayDescription (String dD)
  {
    _dDescription = dD;
  }

  public String getdayDescription ()
  {
    return _dDescription;
  }

  public int getamtWorkdays ()
  {
    return PlannedWeek.size ();
  }

  public String listDays ()
  {
    String output = "\n";

  for (DayPlanner s:PlannedWeek)
      {
	output += s.toString () + "\n";
      }

    return output.substring (0, output.length () - 1);
  }

  public String getWeek ()
  {
    String output = "Week of " + getPWeek ();
    output += "\nHow tedious/hard this week is: " + getdayDescription ();
    output += "\nAmount of workdays for this week " + getamtWorkdays ();
    output += "\nPlanned Days for the week " + listDays ();
    return output;
  }
}
