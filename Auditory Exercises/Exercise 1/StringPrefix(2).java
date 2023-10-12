//Shorter code than the first one because of using the character method startsWith 

import java.util.Scanner;

public class StringPrefix
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String string1 = scanner.next();
        System.out.println("Enter Second String: ");
        String string2 = scanner.next();

        if (string1.startsWith(string2) || string2.startsWith(string1))
            System.out.println("String 1 Prefix = String 2 Prefix");
        else
            System.out.println("String 1 Prefix != String 2 Prefix");
    }
}
