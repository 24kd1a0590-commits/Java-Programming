import java.util.Scanner;
class minmaxstring
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String sentence=sc.nextLine();
        String words[]=sentence.split(" ");
        String smallest=words[0];
        String largest=words[0];
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()<smallest.length())
            {
                smallest=words[i];
            }
            if(words[i].length()>largest.length())
            {
                largest=words[i];
            }
        }
        System.out.println("Smallest word is:"+smallest);
        System.out.println("Largest word is:"+largest);
    }
}