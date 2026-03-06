class Hello
{
public static void main(String args[])
{
   int num=10;
   String day="Sunday";
   String result="";
   result=switch(day)
   {
     case "Saturday","Sunday" -> "6am";
      case "Monday"->"8am";
      default ->"7am";
    
   };
   System.out.println(result);
}
}