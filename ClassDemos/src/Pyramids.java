public class Pyramids
{
   /**
      Computes the volume of a pyramid whose base is a square.
      @param height the height of the pyramid
      @param baseLength the length of one side of the pyramid’s base
      @return the volume of the pyramid
   */
   public static double pyramidVolume(double height, double baseLength)
   {
      double baseArea = baseLength * baseLength;
      return height * baseArea / 3;
   }

   public static void main(String[] args)
   {
      System.out.println("Volume: " + pyramidVolume(9, 10));
      System.out.println("Expected: 300");
      System.out.println("Volume: " + pyramidVolume(0, 10));
      System.out.println("Expected: 0");
   }
}
