import java.io.*;
import java.util.*;
class Array
{
public static void main(String args[])
{
String[] a = {"hello","welcome","goodbye"};
for(int i = a.length-1; i >= 0; i--)
{
for(int j = a[i].length()-1; j>=0; j--)
System.out.println(a[i].charAt(j)+" ");
System.out.println();
}
}
}