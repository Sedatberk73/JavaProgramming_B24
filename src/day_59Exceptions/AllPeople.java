package day_59Exceptions;

public class AllPeople {
    public static void main(String[] args) {
        Person obj=new Person();

        obj.setName("james");

        try {
            obj.setAge(1501);
        }catch (Exception e){
            System.out.println("na na nana ");
        }
        System.out.println(obj.getAge());

    }
}
