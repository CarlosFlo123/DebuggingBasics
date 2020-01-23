class A {
    // Attributes
    private int a=0;
 
    // Manager functions
    public A(int a1) {
       a = a1;
    }
    // Helping functions
    private void trace(String s) {
       System.out.println(s);
    }
    //Access functions
    public int getA() {
        return a;
    }
    public void setA(int a1) {
        a = a1;
    }
    public boolean isLargeValue() {
        return a > 1000;
    }
    // Implementor functions
    public void changeToZero()  {
        a = 0;
    }
 }
 
 class B {
    // Attributes
    private int b=0;
    private A aObj = new A(0);
 
    // Manager functions
    public B(int a1, int b1) {
        b = b1;
       aObj.setA(a1);
    }
    // Helping functions
    private void trace(String s) {
       System.out.println(s);
    }
 
    //Access functions
    public A getAObj() {
       return aObj; }
    public void setAObj(int a1) {
        aObj.setA(a1);
    }
    public int getB() {  
       return b;
    }
    public void setB(int b1) {  
       b = b1;
    }
    public boolean isLargeValue() {  
       return b > 1000 && aObj.isLargeValue();
    }
  
    // Implementor functions
    public void changeToZero()  {  
       b = 0;  
       aObj.changeToZero();
    }
 }
 
 public class debugginBasics {
    public static void main(String args[]) {
        B bObj= new B(1, 2);
        System.out.println(bObj.getAObj().getA()); // Print 1
        bObj.setAObj(3);
        System.out.println(bObj.getAObj().getA()); // Print 3
        bObj.getAObj().setA(4);
        System.out.println(bObj.getAObj().getA()); // Print 4
    }
}