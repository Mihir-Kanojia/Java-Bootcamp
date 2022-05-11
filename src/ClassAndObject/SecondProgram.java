package ClassAndObject;

class Fruits {
    int marketPrice;
    String fruitName;
}

class SecondProgram{

    public static void main(String[] args) {

        Fruits redFruit = new Fruits();
        Fruits blueFruit = new Fruits();

        redFruit.fruitName = "Apple";
        blueFruit.fruitName = "Blue Berry";

        redFruit.marketPrice = 100;
        blueFruit.marketPrice = 300;

        System.out.println(redFruit.fruitName+" ₹"+blueFruit.marketPrice);
        System.out.println(blueFruit.fruitName+" ₹"+redFruit.marketPrice);
    }

}
