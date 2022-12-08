package interviewexamples.survivorGame;

import java.util.Scanner;

public class ToolStore extends NormalLocation {
    Scanner scan=new Scanner(System.in);
    ToolStore(Player player) {
        super(player, "Mall");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Money: "+player.getMoney());
        System.out.println("1 Gun: ");
        System.out.println("2 Armor: ");
        System.out.println("3 out ToolStore: ");
        int selTool=scan.nextInt();
        int selItemId;
        switch (selTool){
            case 1:
                selItemId=weaponMenu();
            buyWeapon(selItemId);
                break;
            case 2:
                selItemId=armorMenu();
                buyArmor(selItemId);
                break;
            default:
                break;
        }

        return true;
    }

    public int armorMenu(){
        System.out.println("1: light gun <money 15 - damage: 2");
        System.out.println("2: midium <money 25 - damage: 3");
        System.out.println("3: heavy  <money 45 - damage: 7");
        System.out.println("4: out");
        System.out.println("Select gun");
        int selArmorId=scan.nextInt();
        return selArmorId;

    }

    public void buyArmor(int itemId ){
        int avoid=0,price=0;
        String aName=null;
        switch (itemId){
            case 1:
                avoid=2;
                aName="light armor";
                price=15;
                break;
            case 2:
                price=15;
                avoid=3;
                aName="medium armor";
                break;
            case 3:
                price=10;
                avoid=5;
                aName="heavy armor";
                break;
            case 4:
                System.out.println("gettin out");
                break;
            default:
                System.out.println("wrong select");
        }

        if (price>0){
            if (player.getMoney()>=price){
                player.getInv().setArmor(avoid);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney()-price);
                System.out.println(" You buy "+aName+"  bloced damage: "+player.getInv().getArmor());
                System.out.println("new balance "+player.getMoney());
            } else {
                System.out.println("balance not enough");
            }

        }


    }


    public int weaponMenu(){
        System.out.println("1: hand gun<money 25 - damage: 2");
        System.out.println("2: sword<money 35 - damage: 3");
        System.out.println("3: rifle <money 45 - damage: 7");
        System.out.println("4: out");
        System.out.println("Select gun");
        int selWeaponId=scan.nextInt();
        return selWeaponId;
    }

    public void buyWeapon(int itemId){
        int demage=0,price=0;
        String wName=null;
            switch (itemId){
                case 1:
                    demage=2;
                    wName="handgun";
                    price=25;
                    break;
                case 2:
                    price=35;
                    demage=3;
                    wName="sword";
                    break;
                case 3:
                    price=45;
                    demage=7;
                    wName="rifle";
                    break;
                case 4:
                    System.out.println("gettin out");
                    break;
                default:
                    System.out.println("wrong select");
            }

         if (price>0){
             if (player.getMoney()>=price){
                 player.getInv().setDemage(demage);
                 player.getInv().setwName(wName);
                 player.setMoney(player.getMoney()-price);
                 System.out.println(" You buy "+wName+"  before damage: "+player.getDemage()
                         +", new damage: "+player.getTotalDamage());
                 System.out.println("new balance "+player.getMoney());
             } else {
                 System.out.println("balance not enough");
             }

         }


    }








}
