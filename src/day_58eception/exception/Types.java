package day_58eception.exception;

public class Types {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            Thread.sleep(2222);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IllegalArgumentException e){//

            System.out.println("time cannot be negative");
        }

            System.out.println("Hello again");

        String r="ABC";
        System.out.println(r.charAt(0));




    }
}
