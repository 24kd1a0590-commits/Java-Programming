class Computer
{
   public void playmusic()
   {
      System.out.println("Plays the music of Darshan Raval");
   }
   public String getmeapen(int cost)
   {
      if(cost>10)
         return "Pen";
      return "Nothing";
   }
}
public class demo
{
   public static void main(String args[])
   {
      Computer obj=new Computer();
      obj.playmusic();
      System.out.println(obj.getmeapen(10));
   }
}