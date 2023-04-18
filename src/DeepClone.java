/**
 * 深拷贝能够拷贝该类中的另一个类,浅拷贝不行
 */

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException{
        Item1 item1 = new Item1();
        Item1 item2 =(Item1) item1.clone();

        //验证Item2是否被深克隆
        item2.peach.num = 66;
        // 如果Item1是输出 != Item2则深克隆成功
        item1.Output();
        item2.Output();
    }
}

class Item1 implements Cloneable{
    Peach peach = new Peach();//在Item1中创建了一个新对象

    public void Output(){
        System.out.println("物品名称为:"+peach.name+"  物品数量为:"+peach.num);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Item1 item1 = (Item1) super.clone();
        item1.peach = (Peach) this.peach.clone();
        return item1;
    }
}

class Peach implements Cloneable {
    String name = "peach";
    int num = 10;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
