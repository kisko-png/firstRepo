public class test {
    public static void main(String[] args) {
       System.out.println("HELLO!"); 
       for(int i = 0; i <10; i++) {
            if(i%2 == 0 && i != 0 ) continue;
            System.out.print(" ".repeat(10 -i));
            System.out.print("*".repeat(2*i + 1));
            System.out.println();
       }
    }
}