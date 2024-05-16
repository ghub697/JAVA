class Matrix
{
    public static void main(String X[])
    {
        int i, j;
        int x[][] = {{1, 2}, {3, 4}}; 
        System.out.println("Array elements are :");
        for (i = 0; i < x.length; i++)
        {
            for (j = 0; j < 2; j++) 
            {
                System.out.print(" " + x[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix");
        for (i = 0; i < 2; i++)
        {
            for (j = 0; j < x.length; j++) 
            {
                System.out.print(" " + x[j][i]);
            }
            System.out.println();
        }
    }
}