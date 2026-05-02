class Mobile
{
   String Mobile;
   double price;
   static String name;
   void show()
   {
    System.out.println(Mobile+ " : "+ price+ " : "+ name);
   }
}
class Main
{
    public static void main(String args[])
    {
        Mobile obj1=new Mobile();
        obj1.Mobile="Samsung";
        obj1.price=10000;
        obj1.name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.Mobile="iPhone";
        obj2.price=20000;
        obj2.name="SmartPhone";
        //static variable is used with classname
        Mobile.name="Phone";
        obj1.show();
        obj2.show();
    }
}