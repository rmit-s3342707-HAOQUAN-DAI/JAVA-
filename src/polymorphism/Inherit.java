package polymorphism;


/**
 * 继承
 *
 * 单继承：一个子类只能有一个直接父类
 * 多继承：一个子类可以有多个直接父类
 * java 中支持单继承，但不直接支持多继承，因为会产生方法同名时调用的不确定性，但对C++中的多继承机制进行改良
 * java支持多层继承：C继承B,B继承A
 *
 *
 */
public class Inherit {

    public static void main(String[] args)
    {
        Student s = new Student();
        s.name = "旺财";
        s.age = 19;
        s.study();

    }
}


class Student extends People
{
//    String name;
//    int age;
    void study()
    {
        System.out.println("Good Good Study,Day Day up");
    }
}

class Worker extends People
{
//    String name;
//    int age;
    void work()
    {
        System.out.println(" Work Work Hard,Day Day up");
    }
}

class People
{
    String name;
    int age;
}


class fu
{
    int num1 = 10;
}

class zi extends fu
{
    int num2 = 12;
    void show()
    {
        System.out.println(num1+"..." + num2); // 10...12
    }

}




