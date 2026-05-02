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
     StringBuilder name=new StringBuilder("Prathyusha");
     name.append("Royal");
     name.insert(10," ");
     name.deleteCharAt(10);
     name.setLength(1);
     System.out.println(name);
     System.out.println(name.capacity());
   }
}