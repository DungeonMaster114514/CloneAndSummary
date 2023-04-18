/**
 * 克隆为Object中的一个抽象方法
 * 想要克隆一个对象,该对象实现要有克隆的能力(CloneAble),即重写CloneAble方法
 */
public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        HumanCloning humanCloning = new HumanCloning("DeepDarkVan", 1);

        //使用克隆时该方法必须加上异常throws CloneNotSupportedException
        //humanCloning.clone()为Object类,需要强制转换为humanCloning
        HumanCloning humanCloning2 = (HumanCloning)humanCloning.clone();
        humanCloning2.Num = 2;
        humanCloning.Out();
        humanCloning2.Out();
    }
}

class HumanCloning implements Cloneable{
    public HumanCloning(String Name,int Num){
        this.Name = Name;
        this.Num = Num;
    }
    String Name;
    long Num;

    public void Out(){
        System.out.printf("克隆人名字为:%s \n终生编号为:%d\n",Name,Num);
    }

    //想要克隆一个对象,该对象实现要有克隆的能力(CloneAble),即重写CloneAble方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}