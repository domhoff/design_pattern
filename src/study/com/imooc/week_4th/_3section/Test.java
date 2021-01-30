package com.imooc.week_4th._3section;

/**
 第4周 面向对象之单例模式与多态\第3节 Java多态（上）
 向上转型/向下转型
 */
public class Test {
        public static void main(String[] args) {
                Animal__ one = new Animal__();  //1 ;


                /**2; 向上转型:父类指向指向具体子类Cat的实例,
                 * 目的: 调用子类重写父类的方法及父类派生的方法
                 * 把一个子类对象转型为一个父类对象; 子类独有的的方法是不能直接去使用的.
                 *向上转型也称为隐式转型,自动转型;小类转型为大类
                 *父类引用指向子类实例时,可以调用子类重写父类的方法及父类派生类的方法,无法调用子类独有的方法
                 * 父用中的静态方法无法被子类重写,所以向上转型之后,只能调用到父类原有的静态方法.
                 */
                Animal__ two = new Cat();  //2; two指向Cat()实例;Cat继承Animal
                     //上行等价于: Cat cat=new Cat(); two=cat;
                Animal__ three = new Dog();   //3
                one.eat();  //向上转型,目的: 调用子类重写父类的方法及父类派生的方法
                two.eat();
                three.eat();

                //向上转型调用父类方法;父类静态方法;如果父类与子类方法是非静态的,调用的是子类方法.
                System.out.println("\n向上转型调用父类方法--------------------");
                two.say();



                //向下转型调用子类方法;子类静态方法
                System.out.println("\n向下转型调用子类方法--------------------");
                Cat cat=(Cat)two;
                cat.say();







                //向下转型
                System.out.println("\n============================");
                /**向下转型,也称强制类型转换;目的:调用子类特有的方法
                 * 子类引用指向父类引用,此处必须进行强制转换
                 * instanceof运算符,判断某个对象是否满足一个特定类型的实例特征
                 * instancdof语法:  对象 instanceof 类,近回true/false
                 */
                if (two instanceof Cat) {
                        Cat temp = (Cat) two;  //类型强制转换,即向下转型
                        temp.eat();
                        temp.run();
                        System.out.println("two可以转换为dog类型"); //值为0
                }
//        Dog temp2=(Dog) two;  //类型强制转换,即向下转型
//        temp2.eat();
//        temp2.sleep();
//        System.out.println(temp2.getMonth());  //值为0


                if (two instanceof Animal__) {
                        System.out.println("Animal");
                }

                if (two instanceof Object) {
                        System.out.println("Animal");
                }

        }

}