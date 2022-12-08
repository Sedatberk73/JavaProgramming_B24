package day_47constructor;

public class phone2 {
        String name;
        String brand;
        double version;
        int memory;
        //this= is just referense to the instance of the class
        //this() : calling a constructor of
        public phone2(String name){//even if we overloaded its can be different order
            this.name=name;
        }
        public phone2(String name,String brand){
         //   this.name=name;
            this(name);
            this.brand=name;
        }

        public phone2(String name,String brand,double version){
//            this.name=name;
//            this.brand=brand;
            this(name,brand);
            this.version=version;



        }

        public phone2(String name, String brand, double version, int memory) {
//            this.name = name;
//            this.brand = brand;
//            this.version = version;
            //this(name,brand,version,memory); memory not working because we didint use this
            this(name,brand,version);
            this.memory = memory;
        }








    }
