import java.util.Scanner;

public class Binary_to_decimal {

    public static void main(String[] args) {

                // Program info

        System.out.println("Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран. Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.");

                // Data processing

        int decimal_res = 0, counter_i;
        String bin_str;
        boolean succes_flag = false;

        do {

            succes_flag = false;

            Scanner s = new Scanner(System.in);
            System.out.println("Введите двоичное число");
            bin_str = s.next();

            if (bin_str.isEmpty()){

                System.out.println("Введена пустая строка, введите строку содержащую данные");
                succes_flag = !succes_flag;

            }

            else if (bin_str.length() > 32){

                System.out.println("Ошибка ввода: введено больше 32 символов. Помните, что для чисел типа int выделяется 4 байта.");
                succes_flag = !succes_flag;

            }

            else {

                for (counter_i = 0; counter_i < bin_str.length(); counter_i++){

                    if (bin_str.charAt(counter_i) == '0') {

                        System.out.println(bin_str.charAt(counter_i));

                    }

                    else if (bin_str.charAt(counter_i) == '1') {

                    }

                    else {

                        System.out.println("Некорректный ввод. Введите число в двоичном виде!");
                        succes_flag = !succes_flag;
                        break;
                    }

                }

            }

        } while (succes_flag);

        if (bin_str.length() < 32) {

            do {

                bin_str = '0' + bin_str;

            } while (bin_str.length() < 32);

        }

        if (bin_str.charAt(0) == '0'){

            for (counter_i = 0; counter_i < bin_str.length(); counter_i++){

                if (bin_str.charAt(bin_str.length() - 1 - counter_i) == '1'){

                    decimal_res = (int) (decimal_res + Math.pow(2, counter_i));

                }

            }

        }

        else {

            for (counter_i = 0; counter_i < bin_str.length(); counter_i++) {

                if (bin_str.charAt(bin_str.length() - 1 - counter_i) == '0') {

                    decimal_res = (int) (decimal_res + Math.pow(2, counter_i));

                }

            }

            decimal_res = decimal_res * (-1) - 1;

        }

        System.out.println("Ваше число: " + decimal_res);

    }

}