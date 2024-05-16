class Commandlinearguments
{
 public static void main(String []args)
 {
  float SI;
  float p = Float.parseFloat(args[0]);
  int t = Integer.parseInt(args[1]);
  float r = Float.parseFloat(args[2]);
  SI = (p*t*r)/100;
  System.out.println("Simple interest = "+SI);
 }
}