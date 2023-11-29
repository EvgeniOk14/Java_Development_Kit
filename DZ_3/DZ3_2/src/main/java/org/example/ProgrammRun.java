package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammRun
{
    /** метод создающий обекты и производящий работу над ними **/
    public void programmRun()
    {

        /** списки яблок для упаковки в дальнейшем в соответствующие ящики с фруктами: **/

        Fruit apple = new Apple(); // создали объект яблоко
        List<Fruit> AppelList1 =  apple.putInBoxFuits(apple, 5); // 1 список яблок для упаковки в ящик
        List<Fruit> AppelList2 = apple.putInBoxFuits(apple, 5);  // 2 список яблок для упаковки в ящик
        List<Fruit> AppelList3 = apple.putInBoxFuits(apple, 8);  // 3 список яблок для упаковки в ящик
        List<Fruit> AppelList4 = apple.putInBoxFuits(apple, 3);  // 4 список яблок для упаковки в ящик
        List<Fruit> AppelList5 = apple.putInBoxFuits(apple, 7);  // 5 список яблок для упаковки в ящик

       /** списки апельсинов для упаковки в дальнейшем в соответствующие ящики с фруктами: **/

       Fruit orange = new Orange(); // создали объект апельсин
       List<Fruit> OrangeList1 = orange.putInBoxFuits(orange, 5); // 1 список апельсинов для упаковки в ящик
       List<Fruit> OrangeList2 = orange.putInBoxFuits(orange, 5); // 2 список апельсинов для упаковки в ящик
       List<Fruit> OrangeList3 = orange.putInBoxFuits(orange, 8); // 3 список апельсинов для упаковки в ящик
       List<Fruit> OrangeList4 = orange.putInBoxFuits(orange, 3); // 4 список апельсинов для упаковки в ящик
       List<Fruit> OrangeList5 = orange.putInBoxFuits(orange, 7); // 5 список апельсинов для упаковки в ящик



        /** наполнение ящиков яюлоками и взвешивание ящика с яблоками: **/

        Box appleBox1 = new BoxApple((ArrayList) AppelList1);
        System.out.println("общий вес первого ящика с яблоками равен: " + appleBox1.getTotalWeight());

        Box appleBox2 = new BoxApple((ArrayList) (AppelList2));
        System.out.println("общий вес второго ящика с яблоками равен: " + appleBox2.getTotalWeight());

        Box appleBox3 = new BoxApple((ArrayList)(AppelList3));
        System.out.println("общий вес третьего ящика с яблоками равен: " + appleBox3.getTotalWeight());

        Box appleBox4 = new BoxApple((ArrayList)(AppelList4));
        System.out.println("общий вес четвёртого ящика с яблоками равен: " + appleBox4.getTotalWeight());

        Box appleBox5 = new BoxApple((ArrayList)(AppelList5));
        System.out.println("общий вес пятого ящика с яблоками равен: " + appleBox5.getTotalWeight());


        /** наполнение ящиков апельсинами и взвешивание ящика с апельсинами: **/

        Box orangeBox1 = new BoxOrange((ArrayList)(OrangeList1));
        System.out.println("общий вес первого ящика с апельсинами равен: " + orangeBox1.getTotalWeight());

        Box orangeBox2 = new BoxOrange((ArrayList)(OrangeList2));
        System.out.println("общий вес второго ящика с апельсинами равен: " + orangeBox2.getTotalWeight());

        Box orangeBox3 = new BoxOrange((ArrayList)(OrangeList3));
        System.out.println("общий вес третьего ящика с апельсинами равен: " + orangeBox3.getTotalWeight());

        Box orangeBox4 = new BoxOrange((ArrayList)(OrangeList4));
        System.out.println("общий вес четвёртого ящика с апельсинами равен: " + orangeBox4.getTotalWeight());

        Box orangeBox5 = new BoxOrange((ArrayList)(OrangeList5));
        System.out.println("общий вес пятого ящика с апельсинами равен: " + orangeBox5.getTotalWeight());


        /** сравнение ящиков с яблоками по весу **/
        boolean appeleResult1_2 = appleBox1.compare(appleBox2);
        System.out.println("результат сравнения первого и второго ящиков с яблоками по весу: " + appeleResult1_2);

        boolean appeleResult2_3 = appleBox2.compare(appleBox3);
        System.out.println("результат сравнения первого и второго ящиков с яблоками по весу: " + appeleResult2_3);

        boolean appeleResult3_4 = appleBox3.compare(appleBox4);
        System.out.println("результат сравнения первого и второго ящиков с яблоками по весу: " + appeleResult3_4);

        boolean appeleResult4_5 = appleBox4.compare(appleBox5);
        System.out.println("результат сравнения первого и второго ящиков с яблоками по весу: " + appeleResult4_5);


        /** сравнение ящиков с апельсинами по весу **/

        boolean orangeResult1_2 = orangeBox1.compare(orangeBox2);
        System.out.println("результат сравнения первого и второго ящиков с апельсинами по весу: " + orangeResult1_2);

        boolean orangeResult2_3 = orangeBox2.compare(orangeBox3);
        System.out.println("результат сравнения второго и третьего ящиков с апельсинами по весу: " + orangeResult2_3);

        boolean orangeResult3_4 = orangeBox3.compare(orangeBox4);
        System.out.println("результат сравнения третьего и четвёртого ящиков с апельсинами по весу: " + orangeResult3_4);

        boolean orangeResult4_5 = orangeBox4.compare(orangeBox5);
        System.out.println("результат сравнения четвёртого и пятого ящиков с апельсинами по весу: " + orangeResult4_5);

        /** сравнение ящиков с яблоками с ящиками с апельсинами по весу **/

        boolean appeleOrangeesult1_2 = appleBox1.compare(orangeBox1);
        System.out.println("результат сравнения первого ящика с яблоками и второго ящика с апельсинами по весу: " + appeleOrangeesult1_2);

        boolean appeleOrangeesult2_3 = orangeBox2.compare(appleBox3);
        System.out.println("результат сравнения первого ящика с апельсинами и третьего ящика с яблоками по весу: " + appeleOrangeesult2_3);

        boolean appeleOrangeesult3_4 = appleBox3.compare(orangeBox4);
        System.out.println("результат сравнения первого ящика с апельсинами и четвёртого ящика с яблоками по весу: " + appeleOrangeesult3_4);

        boolean appeleOrangeesult4_5 = orangeBox5.compare(appleBox4);
        System.out.println("результат сравнения первого ящика с апельсинами и четвёртого ящика с яблоками по весу: " + appeleOrangeesult4_5);


        /** перекладывание содержимого из одного ящика appleBox1 в другой ящик appleBox2 **/

        try
        {
            appleBox1.transferFruits(appleBox2); // переклядывание фруктов из ящика appleBox1 с яблоками в ящик с яблоками appleBox2

            appleBox2.printBox(appleBox2.fruits, appleBox2); // печать содержимого ящика appleBox2

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        /** перекладывание содержимого из одного ящика appleBox4 в другой ящик appleBox5 **/

        try
        {
            appleBox4.transferFruits(appleBox5); // переклядывание фруктов из ящика appleBox4 с яблоками в ящик с яблоками appleBox5

            appleBox5.printBox(appleBox5.fruits, appleBox5); // печать содержимого ящика appleBox5

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        /** перекладывание содержимого из одного ящика appleBox3 в другой ящик appleBox5 **/

        try
        {
            appleBox3.transferFruits(appleBox5); // переклядывание фруктов из ящика appleBox3 с яблоками в ящик с яблоками appleBox5

            appleBox5.printBox(appleBox5.fruits, appleBox5); // печать содержимого ящика appleBox5

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }


        /** перекладывание содержимого из одного ящика orangeBox1 в другой ящик orangeBox2 **/

        try
        {
            orangeBox1.transferFruits(orangeBox2); // переклядывание фруктов из ящика orangeBox1 с апельсинами в ящик с апельсинами orangeBox2

            orangeBox2.printBox(orangeBox2.fruits, orangeBox2); // печать содержимого ящика orangeBox2

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        /** перекладывание содержимого из одного ящика orangeBox4 в другой ящик orangeBox5 **/
        try
        {
            orangeBox4.transferFruits(orangeBox5); // переклядывание фруктов из ящика orangeBox4 с апельсинами в ящик с апельсинами orangeBox5

            orangeBox5.printBox(orangeBox5.fruits, orangeBox5); // печать содержимого ящика orangeBox5

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        /** перекладывание содержимого из одного ящика orangeBox3 в другой ящик orangeBox5 **/
        try
        {
            orangeBox3.transferFruits(orangeBox5); // переклядывание фруктов из ящика orangeBox3 с апельсинами в ящик с апельсинами orangeBox5

            orangeBox5.printBox(orangeBox5.fruits, orangeBox5); // печать содержимого ящика orangeBox5

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
