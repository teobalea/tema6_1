public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        System.out.println("Detalii despre leu:");
        lion.eat();
        lion.sound();
        System.out.println();

        System.out.println("Detalii despre tigru:");
        tiger.eat();
        tiger.sound();
        System.out.println();

        System.out.println("Detalii despre pantera:");
        panther.eat();
        panther.sound();
    }
}
