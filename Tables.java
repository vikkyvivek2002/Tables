import java.util.Scanner;
class Tables
{
public static void main(String args[])
{
 int i,n;
 Scanner s = new Scanner(System.in);
 n = s.nextInt();
 s.close();
 for(i=1; i<=25;i++)
{
  System.out.printf("%d x %2d = %3d\n",n,i,(i*n));
}
}
}