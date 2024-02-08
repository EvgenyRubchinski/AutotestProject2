public class SwitchExample {


    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        }
        if (num1 > num2){
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Первое число меньше второго");
        }

        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }



        if (num1 > num2 && num1 > 7){
            System.out.println("Первое число больше второго и больше 7");
        } else if (num1 == num2 || num1 == 0 ){
            System.out.println("Числа равны");

        }
        
        
        
        int num = 100;
        switch (num){

            case 100:
                System.out.println("Число равно 100");
                break;

            case 150:
                System.out.println("Число равно 150");
                break;

            default:
                System.out.println("Число не равно 100, 150");

        }
        



    }

}
