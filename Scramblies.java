public class Scramblies {
    public static boolean scramble(String str1, String str2) {
      boolean success =true;
      //Input strings s1 and s2 are null terminated.
      if(str1 == null || str2 == null || (str2.length() > str1.length()) ){
          return false;
      }
      StringBuilder sb = new StringBuilder(str1);
      String[] str2Arr = str2.split("\\s*");
        for(String s: str2Arr){
              if(sb.indexOf(s) == -1){
                  success = false;
                  break;
              }else{
                   sb.deleteCharAt(sb.indexOf(s));
              }
        }
      return success;
      
    }
}
