class Prime
{
 public static void main(String X[])
 {
  int N = 23;
  int flag = 0;
  
  for(int i =2; i<=N/2; ++i)
    {
     if(N%1==0)
        {
         flag = 1;
         break;
        }
     }
if(flag ==1)
System.out.println(N+"Is not a prime number");
else
System.out.println(N+"Is a prime number");
}
}