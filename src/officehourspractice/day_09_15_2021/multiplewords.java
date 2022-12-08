package officehourspractice.day_09_15_2021;

public class multiplewords {
    public static void main(String[] args) {

String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

String [] arr=words.split(", ");

for (String each:arr){
    if (each.contains(" ")){
        System.out.println(each);
    }

}














    }



}
