package replitexamples20.Book;

import java.util.Arrays;

public class example extends Book {
    public example() {
    }

    public example(int id, String author, String title, int pages) {
        super(id, author, title, pages);
    }
    public void mr(){
        getId();
    }

    public static void main(String[] args) {
//        Book book=new Book();
//String tr="sedat";
//Character.isUpperCase(tr.charAt(0));
//char f=tr.toUpperCase().charAt(0);
//book.setAuthor("serengil saRiKAya");
//        System.out.println(book.capitalize(""));
//        System.out.println(tr);
//        System.out.println(f);
//        System.out.println(book.getAuthor());

        String[] arr={"a","m","e","d"};
       arr[1]=arr[1].replaceAll("\\W","");
        System.out.println(Arrays.toString(arr));



    }
}
