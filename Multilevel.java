class A
{
    void methodA()
    {
        System.out.println("class A Method");
    }
}

class B extends A
{
    void methodB()
    {
        System.out.println("class B Method");
    }
}

class C extends B
{
    void methodC()
    {
        System.out.println("class C Method");
    }
}

class Multilevel
{
    public static void main(String X[])
    {
        C o = new C();
        o.methodA();
        o.methodB();
        o.methodC();
    } 
}