package day_15switch;

public class Brokestatements {
    public static void main(String[] args) {
        int n= 9;
        switch (n){
            case 8:
                System.out.println(8);
            default:
                System.out.println("default");//en sonda olmasi daha iyi ama burada kullansak ta sonraki sistem ototmatik calisacak
                break;//break kullandktan sonra hic bir sey calismaz ama sonraki case eslesirse oradan itibaren break olmadigi surece calisir
            case 9:
                System.out.println(9);//if we not break system get print true value and next all the line
            case  10:
                System.out.println(10);



        }





    }
}
