package Week1.Module1.BuilderPatternExample;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setGPU("RTX 5090")
                .setRAM("32GB DDR5")
                .setStorage("2TB SSD")
                .build();

        gamingPC.display();

        System.out.println();

        Computer workstation = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setGPU("RTX 6090")
                .setRAM("64GB DDR5")
                .setStorage("4TB SSD")
                .build();

        workstation.display();
    }
}
