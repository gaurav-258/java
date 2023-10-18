import java.util.*;
public class cspace
{
    public static void main(String[]args)
    {
    String sc="Graphic Era Deemed To Be University";
    System.out.println("The String is:"+sc);

    int vowels=0,consonants=0,spaces=0;
    sc=sc.toLowerCase();
    for(int i=0;i<sc.length();i++)
    {
        char ch =sc.charAt(i);

        if(ch =='a'||ch=='e'||ch=='i'||ch =='o'||ch =='u')
        {
            vowels++;
        }
        else if(ch>='a' && ch<='z')
        {
            consonants++;
        }
        else if(ch==' ')
        {
            spaces++;
        }
    }
    System.out.println("Vowels:"+vowels);
    System.out.println("consonant:"+consonants);
    System.out.println("spaces:"+spaces);
    }
}