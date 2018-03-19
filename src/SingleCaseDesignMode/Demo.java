package SingleCaseDesignMode;

/**
 * 单列设计模式 体现
 * 设计模式：对问题行之有效的结局方式，是一种思想，当前流行有23种
 * 单列设计模式：解决的问题，就是可以保证一个累在内存中的对象唯一性
 *
 * 必须对于多个程序使用同一个配置信息时，就需要保证该对象的唯一性
 * 如何保证？
 * 1：不允许其它程序用new创建该类对象
 * 2：在该类中创建一个本类实例
 * 3：对外提供一个方法，让其它程序可以获取该对象。
 *
 * 步骤：
 * 1：私有化该类的构造函数。 private
 * 2：通过new在本类中创建一个本类的对象
 * 3：定义一个共有的方法，将创建的对象返回。
 *
 */

//example
class Single //类一加载，对象就已经存在，开发多用这种，因为example2在多线程开发时并不能保证唯一性
{
    private static Single s = new Single();

    private Single(){}

    public static Single getInstance()
    {
        return s;
    }
}

//example 2
class Single2 //类加载进来，没有对象，只有调用了getInstance之后，才会创建对象，也称作延迟加载
{
    private static Single2 s = null;
    private Single2(){}

    public static Single2 getInstance()
    {
        if(s==null)
            s = new Single2();
        return s;
    }

}


public class Demo {

    public static void main(String[] args)
    {

       Single ss = Single.getInstance(); //拿到了该类的实例

        //Single ss = Single.s;//这个写法可控性不高
        Test t1 = Test.getIntance();
        Test t2 = Test.getIntance();
        t1.setNum(10);
        t2.setNum(20);
        System.out.println(t1.getNum());
        System.out.println(t2.getNum());
        //此处打印结果2个对象均为20

    }
}


class Test
{
    private int num;

    private static Test t = new Test();
    private Test(){}
    public static Test getIntance()
    {
        return t;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return num;
    }
}
