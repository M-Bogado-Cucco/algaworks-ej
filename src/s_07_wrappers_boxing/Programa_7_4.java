package s_07_wrappers_boxing;

public class Programa_7_4 {

  public static void main(String[] args) {
    Integer num1 = 127;
    Integer num2 = 127;

    System.out.println(num1 == num2); // true

    Integer num3 = 128;
    Integer num4 = 128;
    System.out.println(num3 == num4); // false


    Integer num5 = 128;
    Integer num6 = 128;
    System.out.println(num5.equals(num6)); // true

    Integer num7 = 130;
    Short num8 = 130;

    System.out.println(num7.intValue() == num8.intValue()); // true

    Televisor tv = new Televisor();

    tv.mudarVolume(20);
    tv.mudarCanal(130);

    tv.mudarVolume(300);
    tv.mudarCanal(10);

  }

}
















