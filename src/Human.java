public class Human {
    //constructor

    String name;
    int age;
    double weight;
    static int height;

    Human(String name,int age,double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name+" is eating");
    }
    void drink() {
        System.out.println(this.name+" is drinking *burp*");
    }

}
