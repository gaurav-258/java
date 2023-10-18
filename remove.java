import java.util.*;
public class remove
{
    public static void main(String[]args)
    {
        String s="take12%*&u^$#forward ";
        String s1="";
        s1=s.replaceAll("[12%*&^$#]", "");
        System.out.println("String:"+s1);
    }
}