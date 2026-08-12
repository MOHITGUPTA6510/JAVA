class Animal{
    String name;
    
    public Animal(String name){
        this.name = name;
    }
    
    public void makeSound(){
        System.out.println(name+" makes a generic animal sound");
    }
}

class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println(name+" says: Woof Woof!");
    }
}

class Cat extends Animal{
    
    public Cat(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println(name+" says: Meow Meow!");
    } 
}
public class AnimalShelter{
    public static void main(String[] args){
        Animal[] operation = {
            new Cat("Whiskers"), 
            new Dog("Buddy"), 
            new Cat("Luna"), 
            new Dog("Max")
            
        };
        
        System.out.println("Animal sound");
        
        for (Animal say : operation){
            say.makeSound();
        }
    }
}