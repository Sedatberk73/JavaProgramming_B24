package day_30arrayPrctise;

public class Storeinformation {
    public static void main(String[] args) {
        String[] items = {"shoes", "Jackets", "gloves", "airpood", "ipod", "backpacets"};
        double[] price = {89.65, 64.54, 54.43, 345.45, 350.66, 760.65};
        int[] itemIds = {123, 432, 546, 643, 647, 6432};
        boolean hasjacket = false;

        for (String eachitem : items) {
            if (eachitem.contains("Jackets")) {
                hasjacket = true;
            }
        }
        System.out.println(hasjacket);
        System.out.println("items\t\t\tPrice\t\t\tItemId");
        for (int i = 0; i < items.length; i++) {
            if (i < items.length - 1) {
                System.out.println(items[i] + "\t\t\t$" + price[i] + "\t\t\t" + itemIds[i]);
            } else {
                System.out.println(items[i] + "\t\t$" + price[i] + "\t\t\t" + itemIds[i]);
            }
        }
        double maxprise = price[0];
        int index1 = 0;
        String maxname="";
        for (int i = 0; i < price.length; i++) {
            if (price[i] > maxprise){
                maxprise = price[i];
                index1 = i;
                maxname=items[index1];//en pahali esyaya denk gelen itemin indexini bulduk

            }
        }
        System.out.println(index1);
        System.out.println(maxname);
        System.out.println(maxprise);























    }
}
