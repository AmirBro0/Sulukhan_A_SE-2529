public class OfficeComputerBuilder implements ComputerBuilder {
    private String cpu;
    private int ram;
    private String storage;
    private String gpu;
    private String operatingSystem;

    @Override
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public ComputerBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public Computer build() {
        if (cpu == null || storage == null ||
                gpu == null || operatingSystem == null || ram <= 0) {
            throw new IllegalStateException("Computer is not fully configured");
        }

        return new Computer(cpu, ram, storage, gpu, operatingSystem);
    }
}