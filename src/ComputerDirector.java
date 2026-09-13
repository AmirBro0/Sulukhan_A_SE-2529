public class ComputerDirector {

    public Computer buildGamingComputer(ComputerBuilder builder) {
        return builder
                .setCpu("Intel i9")
                .setRam(32)
                .setStorage("1TB SSD")
                .setGpu("RTX 4070")
                .setOperatingSystem("Windows 11")
                .build();
    }

    public Computer buildOfficeComputer(ComputerBuilder builder) {
        return builder
                .setCpu("Intel i3")
                .setRam(8)
                .setStorage("512GB SSD")
                .setGpu("Integrated Graphics")
                .setOperatingSystem("Windows 11")
                .build();
    }
}