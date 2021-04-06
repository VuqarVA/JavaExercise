public class Cat {

    String breed;
    int age;
    char gender;
    boolean hasfur;
    double mass;

    void breed(){
        System.out.println("Your breed is " + breed);
    }

    int age(){
        //System.out.println("Your cats age is " + age);
        return age;

    }

    void weight(){
        int gravity = 10;
        System.out.println("Your cats weight is " + mass * gravity);
    }

    void eat(String food, int amount){
        System.out.println("Your cats should eat " + amount + "g of " + food);

    }

    void sleep(String location, int length){
        System.out.println("Your cat will sleep " + length + " hours at your " + location);
    }

}

