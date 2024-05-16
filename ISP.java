interface ST
{
    public void soft();
}

interface CT
{
    public void elect();
}

interface MT
{
    public void magnet();
}

interface HT
{
    public void hard();
}

class lK implements ST, CT, MT, HT
{
    public void soft()
    {
        System.out.println("These are soft Toys");
    }

    public void elect()
    {
        System.out.println("These are electrical or current Toys");
    }

    public void magnet()
    {
        System.out.println("These are magnetic Toys");
    }

    public void hard()
    {
        System.out.println("These are hard Toys");
    }
}

class ISP
{
    public static void main(String X[])
    {
        lK r = new lK();
        r.soft();
        r.elect();
        r.magnet();
        r.hard();
    }
}