class Exh
{
    public static void main(String X[])
    {
        int a=10, b=0, c;
        try
        {
            c=a/b;
            System.out.println("C : "+ c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
        System.out.println("End of programm");
    }
}