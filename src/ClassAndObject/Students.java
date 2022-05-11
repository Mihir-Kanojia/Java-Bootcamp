package ClassAndObject;
/**
 *Java Program to illustrate how to define a class and fields
 *
 */

class Students {

    //fields
    int marks;
    String name;

    //note main function is within the class
    public static void main(String[] args) {

        //creating object
        Students obj = new Students();

        //accessing class fields using object
        obj.marks = 10;
        obj.name = "Mihir";
        System.out.println(obj.marks);
        System.out.println(obj.name);
    }
}
