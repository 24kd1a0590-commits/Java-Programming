class Hello
{
public static void main(String args[])
{
   int num=10;
   String day="Sunday";
   switch(day)
   {
     case "Saturday","Sunday" 
       -> System.out.println("6am");
      case "Monday"->
         System.out.println("8am");
      default ->
         System.out.println("7am");
    
   }

}
}