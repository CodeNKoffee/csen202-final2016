// Exercise 6A
public class Date {
  int day, month, year;
  static int[] monthDays = {31,28,31,30,31,31,30,31,30,31,30,31};

  public Date (
    int day,
    int month,
    int year 
  ) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public String toString() {
    String s = "";
    if (day < 10) s += "0"+ day +"/";
    else s += day +"/";
    if (month < 10) s += "0"+ month +"/";
    else s += month +"/";
    s += year;
    return s; 
  }

  public void updateDate() {
    if (day == monthDays[month - 1]) {
      day = 1;
      if (month == 12) {
        month = 1;
        year++;
      } else {
        month++;
      }
    } else {
      day++;
    }
  }
}