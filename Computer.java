class Computer
{
   public void playmusic()
   {
      System.out.println("Plays the music of Darshan Raval");
   }
   public String getmeapen(int cost)
   {
      return "Pen";
   }
}
public class Demo
{
   public static void main(String args[])
   {
      Computer obj=new Computer();
      obj.playmusic();
      System.out.println(obj.getmeapen(10));
   }
}