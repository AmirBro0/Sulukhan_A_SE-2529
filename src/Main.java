public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        Computer gamingComputer =
                director.buildGamingComputer(new GamingComputerBuilder());

        Computer officeComputer =
                director.buildOfficeComputer(new OfficeComputerBuilder());

        System.out.println("Gaming computer:");
        System.out.println(gamingComputer);

        System.out.println("\nOffice computer:");
        System.out.println(officeComputer);
    }
}