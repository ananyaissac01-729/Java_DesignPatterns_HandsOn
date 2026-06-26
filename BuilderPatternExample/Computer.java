public class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String GPU;

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;

    }

    public void showSpecs(){
        System.out.println("CPU: "+CPU);
        System.out.println("RAM: "+RAM);
        System.out.println("Storage: "+storage);
        System.out.println("GPU: "+(GPU == null ? "Integrated" : GPU));
        System.out.println();
    }

    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;

        public Builder(String CPU, String RAM,String storage){
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder setGPU(String GPU){
            this.GPU = GPU;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
