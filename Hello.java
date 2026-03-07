class Calculator
{
   int add(int n1,int n2)
   {
      int r1=n1+n2;
      return r1;
   }
}
class Hello
{
   public static void main(String args[])
   {
      int num1=7;
      int num2=2;
      Calculator calc=new Calculator();
      int result=calc.add(num1,num2);
      System.out.println(result);

   }
}