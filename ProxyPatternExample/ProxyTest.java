public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo1.jpg");

        System.out.println("Image object created. (Nothing loaded yet!)");

        System.out.println("\nFirst call to display():");
        image.display();   

        System.out.println("\nSecond call to display():");
        image.display();   
    }
}