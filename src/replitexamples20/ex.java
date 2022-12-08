package replitexamples20;

public class ex {
    public static void main(String[] args) {







    }

  public boolean str(String one,String two){
        if (one.length()>3&&two.length()>3){
            if (one.substring(one.length()-2).equals(two.substring(two.length()-2))){
                return true;
            }

        }

        return false;
  }




}
