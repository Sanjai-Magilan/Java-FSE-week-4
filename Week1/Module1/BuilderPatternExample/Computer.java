package Week1.Module1.BuilderPatternExample;

public class Computer {

    private String CPU;
    private String GPU;
    private String RAM;
    private String Storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    public void display() {
        System.out.println("CPU     : " + CPU);
        System.out.println("GPU     : " + GPU);
        System.out.println("RAM     : " + RAM);
        System.out.println("Storage : " + Storage);
    }

    public static class Builder {

        private String CPU;
        private String GPU;
        private String RAM;
        private String Storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}