package my_utilities;

public class ArraysUtill {

    public static int minNumber(int[] arr){//mainden gelecegi icin burada herhangi bir size vermemize gerek yok
        int min=arr[0];

        for (int each:arr){
            if (each<min){
                min=each;
            }
        }


        return min;

    }

    public static int maxNumber(int[] arr){
        int max=arr[0];

        for (int each:arr){
            if (each>max){
                max=each;
            }
        }


        return max;

    }


    public static boolean contains(int[] arr, int num){
        for (int each:arr){
            if (each==num){
                return true;
            }
        }



        return false;
    }


    public static int sumOfElements(int[] arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }


        return sum;
    }


    public static int[] addElement(int[] arr,int element){
        int [] newArray=new int[arr.length+1];

        for (int i=0;i<arr.length;i++){
            newArray[i]=arr[i];
        }
        newArray[newArray.length-1]=element;




        return newArray;
    }
    public static int[] addElements(int[] arr,int[] elementsToAd){

int[] newArr=new int[arr.length+elementsToAd.length];
int inddex=0;
for (int each:arr){
    newArr[inddex++]=each;
}
for (int each:elementsToAd){
    newArr[inddex++]=each;
}


return newArr;
    }




    public static int frequensyOfElements(int[] arr, int num){
        int count=0;
        for (int each:arr){
            if (each==num){
                count++;
            }
        }

        return count;
    }



    public static int indexOfint(int[] num,int element){

        for (int i=0;i<num.length;i++){
            if (num[i]==element){
                return i;
            }
        }
        return -1;
    }


    public static int indexOfString(String[] num,String element){
        int index=0;

        for (int i=0;i<num.length;i++){
            if (num[i].equals(element)){
                return i;
            }
        }
        return -1;
    }



















}
