/**
 * purpose: to swap the given numbers without using third variable
 */
public class SwapwithoutTemp {
    int a = 10;
    int b = 20;

    public static void main(String[] args){
     SwapwithoutTemp swapwithoutTemp = new SwapwithoutTemp();
        System.out.println("Before swapping a and b : " +swapwithoutTemp.a + "," + swapwithoutTemp.b);
     swapwithoutTemp.a = swapwithoutTemp.a + swapwithoutTemp.b;
     swapwithoutTemp.b = swapwithoutTemp.a - swapwithoutTemp.b;
     swapwithoutTemp.a = swapwithoutTemp.a - swapwithoutTemp.b;
        System.out.println("After swapping a and b : " +swapwithoutTemp.a + "," + swapwithoutTemp.b);
    }
}
