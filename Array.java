class Array
{
    public  static void main(String X[])
    {    
     int i; int sum=0;
     int x[] = {10,20,30,40,50};

     System.out.println("array elments are : ");
     for(i=0; i<5; i++)
    {
     System.out.println(x[i]);
     sum=sum+x[i];
    }
    System.out.println("sum of array element is : "+ sum);
    }

}