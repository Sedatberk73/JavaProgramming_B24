package replitexamples20.dogExample;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog dog = new Dog(in.next(), in.nextInt(), in.next());
        Dog dog2 = new Dog(in.next(), in.nextInt(), in.next());
        System.out.println(dog);
        System.out.println(dog.equals(dog2));

    }
}
