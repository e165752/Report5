/**
 * Created by komineakina on 2016/12/12.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("strの長さ = " + str.length());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("NullPointerExceptionが発生");
            e.printStackTrace();
        }
    }
}