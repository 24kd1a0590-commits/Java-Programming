import java.util.*;
class arraylistdemo
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Prathyusha");
        al.add("Khyathi");
        al.add("Tulasi");
        Iterator<String> i=al.iterator();
        while(i.hasNext())
        {
           System.out.println(i.next());
                }
    }
}