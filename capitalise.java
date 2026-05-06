import java.util.Scanner;
class capitalise
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String words[]=s.split(" ");
        StringBuffer s1=new StringBuffer();
        for(String w: words)
        {
            String f=w.substring(0,1).toUpperCase();
            String remaining=w.substring(1);
            s1.append(f).append(remaining).append(" ");
        }
        System.out.println(s1.toString().trim());
    }
    
}