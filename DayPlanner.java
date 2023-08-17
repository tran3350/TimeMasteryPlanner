//this is for the user to plan out their days, kind of like a reminder 
public class DayPlanner
{

  private int _day;
  private String _month;
  private String _weekday;
  private static int _count;
  private int _Year;
  private int _dayofmonth;
  private String _taskTD;
  private int _task;

  public DayPlanner (String mN, String dN)
  {
    _month = mN;
    _weekday = dN;
    _count++;
    _task = _count;
  }
  public DayPlanner (String mN, int a, String dN, int g, String tA)
  {
    this (mN, dN);
    setYear (a);
    setDay (g);
    setTask (tA);
  }
  public void setMonthName (String mN)
  {
    _month = mN;
  }
  public String getMonthName ()
  {
    return _month;
  }

  public void setDayName (String dN)
  {
    _weekday = dN;
  }

  public String getDayName ()
  {
    return _weekday;
  }
  public void setTask (String tA)
  {
    _taskTD = tA;
  }
  public String getTask ()
  {
    return _taskTD;
  }
  public void setDay (int dyn)
  {
    _day = dyn;
  }

  public int getDay ()
  {
    return _day;
  }

  public void setYear (int y)
  {
    _Year = y;
  }

  public int getYear ()
  {
    return _Year;
  }

  public void setDayOM (int dom)
  {
    _dayofmonth = dom;
  }

  public int getDayOM ()
  {
    return _dayofmonth;
  }

  public int getTaskList ()
  {
    return _task;
  }

  public String toString ()
  {
    //still need to add an if statement loop in order to create
    return _month + " " + _day + ", " + _Year + " " + _weekday + " " + _day +
      " Task to do: " + _taskTD;
  }

}
