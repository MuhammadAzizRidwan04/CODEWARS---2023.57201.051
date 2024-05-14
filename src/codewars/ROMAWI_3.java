package codewars;

public class ROMAWI_3 {
    
    public String sayHello(String[] name, String city, String state) {
        String nama_lengkap = String.join(" ", name);
        return "Hello, " + nama_lengkap + "! Wellcome to " + city + ", " + state + "!";
        
    }
    
    public static void main(String[] args) {
        ROMAWI_3 hello = new ROMAWI_3();
        String[] name = {"John", "Smith"};
        String city = "Phoenix";
        String state = "Arizona";
        System.out.println(hello.sayHello(name, city, state));
        
    }
    
}
