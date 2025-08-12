import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        StringBuffer buf = new StringBuffer();
        System.out.println("Initial capacity of StringBuffer: " + buf.capacity());

        System.out.print("Enter a string to reverse and convert to uppercase: ");
        String inpStr = sc.nextLine();

        StringBuffer revBuf = new StringBuffer(inpStr);
        revBuf.reverse();
        String revUpStr = revBuf.toString().toUpperCase();

        System.out.println("Reversed and uppercased string: " + revUpStr);

        System.out.print("Enter another string to append: ");
        String apStr = sc.nextLine();

        String finalStr = revUpStr + apStr;
        System.out.println("Final result after appending: " + finalStr);


        StringBuffer finalBuf = new StringBuffer(finalStr);
        System.out.println("Final capacity of StringBuffer: " + finalBuf.capacity());

        sc.close();
    }
}
