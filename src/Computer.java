    public class Computer {
    private final String cpu;
    private final int ram;
    private final String storage;
    private final String gpu;
    private final String operatingSystem;

    public Computer(String cpu, int ram, String storage,
                    String gpu, String operatingSystem) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram + " GB" +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}