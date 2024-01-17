public class bitwise {
public static void main(String[] args) {
    int a = 20;
    /*
     * >>
     * <<
     * ^
     * &
     * |
     */

     System.out.println(a << 2);
     System.out.println(a >> 2);
     System.out.println(a ^ 2);
     System.out.println(a & 2);
     System.out.println(a | 2);
     
     /*
     
     System.out.println(20 << 2);
        20 :     00010100
        an :     01010000   
     
     
     System.out.println(a >> 2);
        20 :     00010100    
        20 :     00000101    
     
     System.out.println(a ^ 2);
        20 :     00010100    
        2  :     00000010
        ans:     00010110 
     Formula : atleast 1 needed as well as both   
     
     System.out.println(a & 2);
        20 :     00010100    
        2  :     00000010
     ans & :     00000000
     Formula : Both Condition need be true
     
     System.out.println(a | 2);
     20 :     00010100    
     2  :     00000010
     ans :    00010110  
     Formula : one Condition need be true
     
      */
}

    
}