public class Main {

    public static void main(String[] args) {
        //constructor
        System.out.println("Constructor");
        Human human1 = new Human("Rick",65,70);
        Human human2 = new Human("Morty",16,50);

        human1.drink();
        human2.eat();
        System.out.println(Human.height);

        //Overloaded Constructor
        System.out.println("\nOverloaded Constructor");
        Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");


        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        //To String
        System.out.println("\ntoString");
        // toString() = special method that all objects inherit,
        //    that returns a string that "textually represents" an object.
        //    can be used both implicitly and explicitly
        Car car = new Car();
        System.out.println(car.toString());// or
        System.out.println(car);

        //Array of Objects
        System.out.println("\nArray of Objects");
        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refrigerator = {food1,food2,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);


        // Static Keyword
        System.out.println("\nStatic Keyword");
        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member

        Friend friend1 = new Friend("Sponegbob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);

        // Inheritance
        System.out.println("\nInheritance");
        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.

        CarNew car1 = new CarNew();

        car1.go();

        Bicycle bike = new Bicycle();

        car1.go();
        bike.stop();

        System.out.println(car1.door);
        System.out.println(bike.pedals);

        // Super
        System.out.println("\nSuper");
        // super = 	keyword refers to the superclass (parent) of an object
        //			very similar to the "this" keyword

        Hero hero1 = new Hero("Batman",42,"$$$");
        Hero hero2 = new Hero("Superman",43,"everything");

        System.out.println(hero2.toString());

//        Abstract
        System.out.println("\nAbstract");
        // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
        //				abstract methods are declared without an implementation

        //Vehicle vehicle = new Vehicle();
        CarAbs carAbs = new CarAbs();

        carAbs.go();

//        Encapsulation
        System.out.println("\nEncapsulation");
        // Encapsulation = 	attributes of a class will be hidden or private,
        //					Can be accessed only through methods (getters & setters)
        //					You should make attributes private if you don't have a reason to make them public/protected

        CarEnc carEnc1 = new CarEnc("Chevrolet","Camaro",2021);
//        CarEnc carEnc2 = new CarEnc("Ford","Mustang",1999);
//        carEnc2.copy(carEnc1);
        CarEnc carEnc2 = new CarEnc(carEnc1);

        carEnc1.setYear(2022);

        System.out.println(carEnc1.getMake());
        System.out.println(carEnc1.getModel());
        System.out.println(carEnc1.getYear());
        System.out.println();
        System.out.println(carEnc2.getMake());
        System.out.println(carEnc2.getModel());
        System.out.println(carEnc2.getYear());
    }
}
