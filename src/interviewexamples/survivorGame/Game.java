package interviewexamples.survivorGame;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan=new Scanner(System.in);
    public void login(){
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome to survivor game");
        System.out.println("please enter your name");
        String playerName=scan.nextLine();
        player =new Player(playerName);
        player.selectCha();
        start();

    }
    public void start(){
      while (true){
          System.out.println();
          System.out.println("=======================");
          System.out.println();
          System.out.println("please select any location");
          System.out.println("1:---security Home ---> its your security home no enemy in this location ");
          System.out.println("2:----Cavern We may encounter zombies! ");
          System.out.println("3:---Forest We may encounter vampir! ");
          System.out.println("4:----River We may encounter bear! ");
          System.out.println("5 Mall you can buy guns and armor in here");
          int selLoc=scan.nextInt();
          while (selLoc<1||selLoc>5){
              System.out.println("please select a number inclusive 1-5");
              selLoc=scan.nextInt();
          }

          switch (selLoc){
              case 1:
                  location=new SafeHouse(player);
                  break;
              case 2:
                  location=new Cavern(player);
                  break;
              case 3:
                  location=new Forest(player);
                  break;
              case 4:
                  location=new River(player);
                  break;
              case 5:
                  location=new ToolStore(player);
                  break;
              default:
                  location=new SafeHouse(player);
          }
          if(location.getClass().getName().equals("SafeHouse")){
             if (player.getInv().isFood()&&player.getInv().isFirewood()&&player.getInv().isWater()){
                 System.out.println("Congratulations you win! ");
                 break;
             }
          }



         if (!location.getLocation()){
             System.out.println("Game over!");
             break;

         }
      }


    }

}
