package ClassAndObject;

class FirstProgram {

    int marks;
    String name;

    public static void main(String[] args) {
        FirstProgram obj = new FirstProgram();
        obj.marks = 10;
        obj.name = "Mihir";
        System.out.println(obj.marks);
        System.out.println(obj.name);
    }
}
