import java.util.Scanner;

public class StringPrefix
{

    public static boolean isPrefix (String s1, String s2)
    {
        if (s1.length() > s2.length())
            return  false;
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String string1 = scanner.next();
        System.out.println("Enter Second String: ");
        String string2 = scanner.next();

        if (isPrefix(string1, string2)) //if it's true
            System.out.println("String 1 Prefix = String 2 Prefix");
        else
            System.out.println("String 1 Prefix != String 2 Prefix");

    }
}
