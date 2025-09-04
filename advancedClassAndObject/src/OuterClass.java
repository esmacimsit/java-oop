public class OuterClass {

    static class NestedClass{
        public void printMessage(){
            System.out.println("hi from static nested class");
        }
    }

    class InnerClass{
        public void printMessage(){
            System.out.println("hi from inner class");
        }
    }

    public void printMessage(){
        class LocalInnerClass{
            public void printMessage(){
                System.out.println("hi from local inner class");
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printMessage();
    }




}
