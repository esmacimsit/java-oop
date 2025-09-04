public class Main {
    public static void main(String[] args) {
        int result = MathHelper.square(5);
        System.out.println("result = " + result);

        System.out.println("MathHelper PI = " + MathHelper.PI);

        Student student = new Student();
        student.id = 1090;
        student.displayId();

        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.printMessage();

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printMessage();

        new OuterClass().printMessage();

        GetterSetter person = new GetterSetter();
        person.setName("esma");
        person.setAge(21);
        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());
    }
}