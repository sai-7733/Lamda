public class Main{
    public static void main(String args[]){
        B ob=new B(){
            public int m1(int i){
                return 200;
        }
    };
    System.out.println(ob.m1(20));
    C obj=new C();
    System.out.println(obj.m1(30));
    
 B obb= i ->100;
    System.out.println(obb.m1(40));
    }
}
class C implements B{
    @Override
    public int m1(int i){
        return 100;
    }
}
@FunctionalInterface
interface B{
    public int m1(int i);
}