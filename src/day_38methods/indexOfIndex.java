package day_38methods;

public class indexOfIndex {
    public static void main(String[] args) {
        String arr[]={"sedat","berk","c"};

        int num[] ={1,2,3,4,5,6};


        System.out.println(indexOf(num,6));
        System.out.println(indexOf(arr,"t"));//-1
        System.out.println(indexOf(arr,"sedat"));//0 index
    }





    public static int indexOf(int[] num,int element){

       for (int i=0;i<num.length;i++){
           if (num[i]==element){
               return i;
           }
       }
return -1;
    }
    public static int indexOf(String[] num,String element){
        int index=0;

        for (int i=0;i<num.length;i++){
            if (num[i].equals(element)){
                return i;
            }
        }
        return -1;
    }



}
