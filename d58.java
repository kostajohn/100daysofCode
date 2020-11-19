//logic1 alarmClock
public String alarmClock(int day, boolean vacation) {
  if (vacation == true && (day == 0 || day == 6)){
    return "off";
  } else if (vacation == true) {
    return "10:00";
  } else if (vacation == false && (day == 0 || day == 6)) {
    return "10:00";
  } else {
    return "7:00";
  }
}
