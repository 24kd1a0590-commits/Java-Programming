import java.util.Scanner;
class remove
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        if(s==null || s.isEmpty())
        {
            System.out.println("Output:"+s);
        }
        else
        {
            StringBuilder s1= new StringBuilder();
            s1.append(s.charAt(0));
            for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1))
            {
                s1.append(s.charAt(i));
            }
        }
        System.out.println(s1);
    }
}
}