package exe.arinuel;

public class string {
    public static void main(String arg[]) {
      String str1 = "W programowaniu aplikacji Web Java jest numerem jeden.";
      String str2 = new String(str1);
      String str3 = "Łańcuchy w Javie mają spore możliwości.";
      int result, idx;
      char ch;

      System.out.println("Długość łańcucha str1: " + str1.length());

      for(int i =1; i<str1.length();i++)
          System.out.print(str1.charAt(i));
      System.out.println();

      if(str1.equals(str2))
          System.out.println("str1 jest równy str2");
      else
          System.out.println("str1 jest różny od str2");

      result = str1.compareTo(str3);
              if(result == 0)
                  System.out.println("str1 i str3 są takie same ");
      else if(result < 0)
          System.out.println("str1 jest mniejszy od str3");
      else
          System.out.println("str1 jest większy od str 3");

      str2 = "Raz Dwa Trzy Raz";

      idx = str2.indexOf("Raz");
      System.out.println("Indeks pierwszego wystąpienia podłańcucha Raz:" + idx);

      idx = str2.lastIndexOf("Raz");
      System.out.println("Indeks ostatniego wystąpienia podłańcucha Raz:" + idx);

    }
}
