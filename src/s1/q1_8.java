package s1;


/**
 * Assume you have a method isSubstring which checks 
 * if one word is a substring of another Given two strings, s1 and s2, 
 * write code to check if s2 is a rotation of s1 using only one call to 
 * isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
 * 
 * @author lubron
 *
 */
/**
 * with str1 and str2
 * Concatenate the str1 with itself, then if it is a rotate string, the concatenation must contain
 * the other string str2
 * 
 * Trick:
 * Faced with rotate problem, think of concatenate one string with itself
 * 
 * @author lubron
 *
 */
public class q1_8 {
  public boolean isRotation(String str1, String str2){
    // first check the length
    if(str1.length() != str2.length())
      return false;
    String doubleStr1 = str1 + str1;
    if(isSubstring(doubleStr1, str2)){
      return true;
    }
    return false;
  }

  /**
   * check if str2 is the substring of str1
   * 
   * @param doubleStr1
   * @param str2
   * @return
   */
  private boolean isSubstring(String st1, String str2) {
    // TODO Auto-generated method stub
    
    return false;
  }
}
