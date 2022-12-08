package interviewexamples.survivorGame;

import java.util.Scanner;

public class Player {
    private int demage,healthy,money,rHealty;
    private String name,cName;
   private Inventory inv;
Scanner scan =new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inv=new Inventory();
    }

    public void selectCha(){
        switch (chaMenu()){
            case 1:
                intPlayer("Samuray",5,21,15);
                break;
            case 2:
                intPlayer("Archer",7,18,20);

                break;
            case 3:
                intPlayer("Knight",8,24,5);
                break;
            default:
                intPlayer("Samuray",5,21,15);
        }
        System.out.println("our Character it ready oursCharacter is ");
        System.out.println("Character: "+getcName()+",\t Demage: "+getDemage()+",\tHealty: "+getHealthy()+",\tMoney: "+getMoney());


    }
    public int chaMenu(){
        System.out.println("please select character");
        System.out.println("1-samuray: \tdemage 5, \thealty 21,\t money 15");
        System.out.println("2-Archer: \tdemage 7, \thealty 18, \tmoney 20");
        System.out.println("3-knight:\t demage 8,\t healty 24, \tmoney 5");
        int chaId =scan.nextInt();
        while (chaId<1||chaId>3){
            System.out.print("please select number inclusive  1-3");
            chaId =scan.nextInt();
        }


        return chaId;
    }
    public  void  intPlayer(String cName,int demage,int healty,int money){
        setcName(cName);
        setDemage(demage);
        setHealthy(healty);
        setMoney(money);
        setrHealty(healty);

    }
    public int getTotalDamage(){
        return this.getDemage()+this.getInv().getDemage();
    }




    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rHealty) {
        this.rHealty = rHealty;
    }
}
