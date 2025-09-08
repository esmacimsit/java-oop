package inheritance;

public class ChildConst extends ParentConst{
    public ChildConst(){
//        super(1, 2);
        // if super exists const with parm runs otherwise without parm runs
        System.out.println("child constructor");
    }
}
