//logic1
public boolean squirrelPlay(int temp, boolean isSummer) {

  if(isSummer && (temp <=100 && temp >= 60)){
    return true;
  } else if (!isSummer && (temp <= 90 && temp >= 60)) {
    return true;
  }

  return false;

}
