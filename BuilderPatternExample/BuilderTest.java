public class BuilderTest {
    public static void main(String [] args){
        Computer PC1 = new Computer.Builder("intel i5","32GB","1TB")
        .setGPU("RTX 4060")
        .build();

         Computer PC2 = new Computer.Builder("intel i7","32GB","512GB")
        .build();

        PC1.showSpecs();
        PC2.showSpecs();
    }
}
