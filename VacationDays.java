// Exercise 6B
public class VacationDays {
  Date[] dateList;
  int numEntries;

  public VacationDays(Date[] d) {
    dateList = new Date[d.length];
    for(int i = 0; i < d.length && d[i] != null; i++) {
      dateList[i] = new Date(d[i].getDay(), d[i].getMonth(), d[i].getYear());
      numEntries++;
    }
  }

  public boolean inOrder() {
    for (int i = 0; i < dateList.length - 1 && dateList[i] != null && dateList[i + 1] != null; i++) {
      if (dateList[i].getYear() > dateList[i + 1].getYear()) {
        return false;
      }
      else if (dateList[i].getYear() == dateList[i + 1].getYear() && dateList[i].getMonth() > dateList[i + 1].getMonth()) {
        return false;
      }
      else if (dateList[i].getYear() == dateList[i + 1].getYear() && dateList[i].getMonth() == dateList[i + 1].getMonth() && dateList[i].getDay() > dateList[i + 1].getDay()) {
        return false;
      }
      else return true;
    }
    return false;
  }

  public String toString() {
    System.out.println("You have vacation days on: ");
    for (int i = 0; i < dateList.length & dateList[i] != null; i++) {
      String s = ("Day "+ dateList[i].getDay() +" in month "+ dateList[i].getMonth() +" in year "+ dateList[i].getYear());
      System.out.println(s);
    }
    return "";
  }

  public static void main(String[] args) {
    Date[] dates = new Date[10];
    dates[0] = new Date(11, 5, 2003);
    dates[1] = new Date(15, 4, 2007);
    dates[2] = new Date(2, 6, 2004);
    VacationDays v = new VacationDays(dates);
    System.out.println(v.inOrder());
    System.out.println(v);
    v.dateList[0].updateDate();
    System.out.println(v.dateList[0]);
  }
}