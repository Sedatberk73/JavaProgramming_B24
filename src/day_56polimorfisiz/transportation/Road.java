package day_56polimorfisiz.transportation;

import day_53inharitance.rules.C;

public class Road {
    public static void main(String[] args) {
        Transportation ob1=new Transportation();
        ob1.go();
        System.out.println();
        Car obj2=new Car();
        obj2.go();
        obj2.opneTrunk();
        System.out.println();
        //reference its importand and this is be reference tranportation its calling tranportation methods
        Transportation obj3 =new Tesla();
        obj3.go();
        obj3.stop();
        //obj3.opengtrunk== burada her ne kadar car extends transportation olmussa bile sadece transportation metodlarini alalbilir openning trunk car metodu olup extend olmasina ragmen kullanilamaz sadece referansta olanlar kullanilabilir



        Tesla t1=new Tesla();
        t1.go();
//car da kac tane referans varsa o kadarini kullanbiliriz nve extends olanlarda kulanilabilir
        Car t2=new Tesla();
        t2.opneTrunk();
        t2.stop();
        t2.v5();
        t2.windowopening();
        t2.v5();
        //implement metodlari kullanamayiz sadece extends olanlarin referanslarini kullanabiliriz
        t2.v5();



        SelfDriving t4=new Tesla();
        t4.selfDrive();
        t4.byself();

//electricte ne kadar method varsa onlari tesla clasi icin kullanacagiz  kullandigimizda tesla degerleri override olan methodlar  kullanilacak
        //amac sadace teslada electrikte olan objeler kullanilacak
        Electric t5=new Tesla();
        t5.charge();
        t5.charge();
        t5.noGas();

        Tesla ts=new Tesla();

        door d= new door();
















    }
}
