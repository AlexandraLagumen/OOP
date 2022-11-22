import java.util.Scanner;
class RunAnimal {
   public static void main(String[] args) {

       Bird b = new Bird();
       Cat c = new Cat();
       Dog d = new Dog();

       Scanner sc = new Scanner(System.in);
       String choice;

       System.out.print("\nChoose an animal. Press B for Bird, C for Cat, D for Dog: ");
       choice = sc.nextLine();

       if(choice.equalsIgnoreCase("B")) {
           b.eat();
           b.sleep();
           b.makeSound();
       }
       else if(choice.equalsIgnoreCase("C")) {
           c.eat();
           c.sleep();
           c.makeSound();
       }
       else if(choice.equalsIgnoreCase("D")) {
           d.eat();
           d.sleep();
           d.makeSound();
       }
       else {
           System.out.println("\nwrong input please try again\n");
       }

 }
}