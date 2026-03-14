class Student
{
   int rollno;
   String name;
   double marks;
}
class demo
{
   public static void main(String args[])
   {
     String name="Prathyusha";
     name=name + "Royals";
     String s1="navin";
     String s2="navin";
     System.out.println(System.identityHashCode(s2)); // Addresses of s1 and s2 are same
     System.out.println(System.identityHashCode(name)); // It creates a new address for after appending 
   }
}