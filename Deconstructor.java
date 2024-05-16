class Deconstructor
{
 public static void main(String X[])
 {
  Deconstructor de = new Deconstructor();
  de.finialise();
  de=null;
  System.gc();
 System.out.println("Inside the main() method");
 }
 protected void finialise()
 {
  System.out.println("object is destroyed by the garbage collector");
 }
}
