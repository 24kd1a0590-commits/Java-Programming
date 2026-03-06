class Hello
{
public static void main(String args[])
{
   int num=10;
   String day="Sunday";
   String result="";
   result=switch(day)
   {
     case "Saturday","Sunday" :yield "6am";
      case "Monday": yield "8am";
      default :yield "7am";
    
   };
   System.out.println(result);
}
}