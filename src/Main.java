public class
Main {
    public static void main(String[] args) {

        Shark shark =new Shark();
        shark.setParoda("shark-byk");
        shark.setKg(70.4);
        System.out.println(shark.getParoda()+"\n"+shark.getKg());

        Parrot parrot =new Parrot();
        parrot.setParoda("korella");
        parrot.setKg(15.7);
        System.out.println(parrot.getParoda()+"\n"+parrot.getKg());

        Lion lion=new Lion("bishon-lion",60.4);
        System.out.println(lion.getParoda()+"\n"+lion.getKg());













    }



}