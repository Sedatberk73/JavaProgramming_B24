package interviewexamples.survivorGame;

public abstract class BattleLoc extends Location {
   protected Obstacle obstacle;
   protected String award;
    BattleLoc(Player player ,String name, Obstacle obstacle, String award) {
        super(player);
        this.name=name;
        this.obstacle=obstacle;
        this.award=award;
    }
public boolean getLocation(){
int obsCount=obstacle.Count();
    System.out.println("Now you are here: "+this.getName());
    System.out.println("be careful! here "+obsCount+" has "+obstacle.getName()+" living here ");
    System.out.println("<F>ight or <R>un");
    String selCase=scan.nextLine();
    selCase=selCase.toUpperCase();
    if (selCase.equals("F")){
       if ( combat(obsCount)){
           System.out.println(" your are clear are enemies of area in "+this.getName());
           if (this.award.equalsIgnoreCase("Food")&&player.getInv().isFood()==false){
               System.out.println(this.award+" you  win");
               player.getInv().setFood(true);
           }else if (this.award.equalsIgnoreCase("Water")&&player.getInv().isFood()==false){
               System.out.println(this.award+" you  win");
               player.getInv().setWater(true);
           }
           else if (this.award.equalsIgnoreCase("FireWood")&&player.getInv().isFood()==false){
               System.out.println(this.award+" you  win");
               player.getInv().setFirewood(true);
           }
           return true;
       }if (player.getHealthy()<=0){
           System.out.println("your died! ");
           return false;
       }


    }
     return  true;
    }

    public boolean combat(int obsCount){
        for (int i=0;i<obsCount;i++){
            int defoultobsHealt=obstacle.getHealth();
            playerStats();
            enemyStats();
            while (player.getHealthy()>0&&obstacle.getHealth()>0){
                System.out.println("<H>it or <R>un");
                String hit=scan.nextLine();
                hit=hit.toUpperCase();
                if (hit.equals("H")){
                    System.out.println("your hit first");
                    obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
                    afterHit();
                    if (obstacle.getHealth()>0){
                    System.out.println("monster hit you then!");
                    player.setHealthy(player.getHealthy()-(obstacle.getDemage()-player.getInv().getArmor()));
                    afterHit();
                    }
                }else {
                   return false;
                }
            }
            if (obstacle.getHealth()<player.getHealthy()){
                System.out.println("your beat the monster:");
                player.setMoney(player.getMoney()+obstacle.getAward());
                System.out.println("new balance "+player.getMoney());
                obstacle.setHealth(defoultobsHealt);
            }else {
                return false;
            }

            System.out.println("----------------------");
        }

        return true;
    }

public void playerStats(){
    System.out.println("Player information:\n------------------");
    System.out.println("Healt: "+player.getHealthy());
    System.out.println("demage: "+player.getTotalDamage());
    System.out.println("money: "+player.getMoney());

    if (player.getInv().getDemage()>0){
        System.out.println("gun: "+player.getInv().getwName());
    }
    if (player.getInv().getArmor()>0){
        System.out.println("armor: "+player.getInv().getArmor());
    }
}
public void enemyStats(){
    System.out.println("obstacte values: "+obstacle.getName());
    System.out.println("---------------------");
    System.out.println("healt: "+obstacle.getHealth());
    System.out.println("demage:"+obstacle.getDemage());
    System.out.println("award: "+obstacle.getAward());
}

public void afterHit(){
    System.out.println("player heat: "+player.getHealthy());
    System.out.println(obstacle.getName()+"of healt: "+obstacle.getHealth());
    System.out.println();
    System.out.println("-------------------------");
}





}
