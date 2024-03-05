
package testdowncasting;

public class TestDowncasting {

 
    public static void main(String[] args) {
        Animal a = new Dog();// upcasting
        Dog d = (Dog)a; //Downcasting 
        
        d.sound();// Calls the animal class method 
        d.bark(); //Calls the Dog class method 
    }
    
}
