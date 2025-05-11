public class Poly{
    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        a1.makeSound();
        d1.makeSound();
        c1.makeSound();

        d1.bark();

        int x = 79;
        double y = (double)x; //casting
        double y2 = x; //implicit or automatic casting
        System.out.println(y2+" "+y);


        //upcasting
        //refType var = new ObjectType();
        Animal dog = new Dog();

        //dog.bark(); //can't do that will give compilation error
        dog.makeSound();

        //down casting

        if(dog instanceof Dog){ //i am checking this because dog can be of Animal refType but it can also be an obj of cat or dog... so igotta check first if i want any obj to cast into dog refType
            Dog dog2= (Dog)dog;
            dog2.bark();
        }

      // what actually happens in upcasting:
      //taking a child object and putting that in to the ref of parent

        Dog doggy = new Dog();
        doggy.bark();
        Animal ani = (Animal)doggy; //just chaning the ref type but it is still an obj of Dog class
        //ani.bark(); //not possible cause the ref type is changed

        ani.makeSound();
        


        displayInfo(d1); //d1 is an obj of child but it gets converted into the ref type of parent Animal
        displayInfo(c1);
        displayInfo(a1);
       

        
        System.out.println(d1 instanceof Animal);
        //instance of will only give true when it is an object of it's own class or the ref type if it's parent or grandparent and so one class



    }

    public static void displayInfo(Animal a){ // Animal a = d1;

        if(a instanceof Dog){
            Dog dd = (Dog)a;
            dd.bark();
        }
        a.makeSound();
        
        //a.bark() //we cannot do that cause now it is the ref type of parent

        //if i only want the method of cat:
        if(a instanceof Cat){
            a.makeSound();
        }
    }
}