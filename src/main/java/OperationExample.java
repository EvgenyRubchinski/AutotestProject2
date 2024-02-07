public class OperationExample {
    public static void main (String[] args){
        //сложение
        int a = 5;
        int b = 7;
        int c = a + b;//12

        //вычитание
        int x = 10;
        int y = 5;
        int z = x - y;//5
        System.out.println(z + b);

        //При делении, если в операции учавствуют целые числа,
        //то результат будет округляться до целого числа
        double k = 12.2 / 4;
        System.out.println(k);
        System.out.println(x / a);

        // умножение
        int a1 = 10;
        int a2 = 7;
        int c1 = a1 * a2; // 70
        System.out.println(c1 + x);

        // % - получение остатка от деления двух чисел
        int b1 = 5;
        int b2 = 3;
        int c2 = b1 % b2;
        System.out.println(c2);


        // инкримент
        int a3 = 8;
        int b3 = ++a3;// увеличили на +1 а3 и присвоили ей это значение
        // а затем присвоили это значение b3
        // префиксный
        System.out.println(a3);//9
        System.out.println(b3);//9

        int a4 = 8;
        int b4 = a4++;// присвоили значение а4 переменной b4
        // затем увеличили а4 на +1
        // постфиксный
        System.out.println(a4);//9
        System.out.println(b4);//8


        // Декремент
        int a5 = 8;
        int b5 = --a5;//уменьшили а5 на (-1) и присвоили ей это значение,
        //затем присвоили это значение b5
        System.out.println(a5);//7
        System.out.println(b5);//7

        int a6 = 8;
        int b6 = a6--;//присвоили b6 значение а6,
        //затем а6-1 и присвоили а6.
        System.out.println(a6);//7
        System.out.println(b6);//8


    }
}
