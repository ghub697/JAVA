interface C
{
    void drawA();
    void drawB();
}

class D implements C
{
    public void drawA()
    {
        System.out.println("venom A");
    }
    public void drawB()
    {
        System.out.println("venom B");
    }
}

class Interface
{
    public static void main(String X[])
    {
        C o;
        o = new  D();
        o.drawA();
        o.drawB();
    }
}