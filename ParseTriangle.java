class ParseTriangle
{
    public static void main(String args[])
    {
        String s="*";
        String result="";
        for(int i=1;i<6;i++)
        {
            result="";
            for(int j=1;j<i+1;j++)
            {
                result+=s;
            }
           System.out.println(result);
        }
    }
}