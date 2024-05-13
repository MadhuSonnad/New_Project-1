package Mainclass;

public class RevInt 
{
public static void main(String[] args) 
{
	   int n = 123456; 
       String temp = "" + n; 
       StringBuilder sb = new StringBuilder(temp); 
       StringBuilder str = sb.reverse(); 
       System.out.println(str.toString()); 
   } 
}

