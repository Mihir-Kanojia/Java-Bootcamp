package ClassAndObject;
/**
 *Java Program to demonstrate having the main
 *the main method in another class
 */

//creating "Fruits" class with fields "marketPrice" and "fruitName"
class Fruits {
    int marketPrice;
    String fruitName;
}

//creating another class
class MainClass {

    //Our file name is MainClass.java, that's why we have created main function in MainClass.
    public static void main(String[] args) {

        //making multiple object of "Fruits" class
        Fruits redFruit = new Fruits();
        Fruits blueFruit = new Fruits();

        //accessing class fields
        redFruit.fruitName = "Apple";
        blueFruit.fruitName = "Blue Berry";

        redFruit.marketPrice = 100;
        blueFruit.marketPrice = 300;

        System.out.println(redFruit.fruitName+" ₹"+redFruit.marketPrice);
        System.out.println(blueFruit.fruitName+" ₹"+blueFruit.marketPrice);
    }

}
