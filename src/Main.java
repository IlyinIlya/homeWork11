import java.time.LocalDate;

public class Main {

    public static void printYear(int year){
        if (year > 1584) {
            System.out.println((year % 4 == 0 || year % 400 == 0) &&
                    !(year % 100 == 0 && year % 4 == 0) ? "Год " + year +
                    " високосный" : "Год " + year + " невисокосный");
        }
        else {
            System.out.println("Високосный год был введен в 1584 году");
        }
    }
    public static void findRightOperationSystem (int operationSystem, int clientDeviceYear) {
        int deviceYear = LocalDate.now().getYear();
        switch (operationSystem) {
            case 0:
                if (clientDeviceYear > deviceYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear > deviceYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Неправильный выбор операционной системы");
                break;
        }
        //if (operationSystem == 1 && clientDeviceYear > deviceYear) {
        //    System.out.println("Установите облегченную версию приложения для Android по ссылке");
        //}
        //else if (operationSystem == 1 && clientDeviceYear <= deviceYear) {
        //    System.out.println("Установите версию приложения для Android по ссылке");
        //}
        //else if (operationSystem == 0 && clientDeviceYear > deviceYear) {
        //    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        //}
        //else if (operationSystem == 0 && clientDeviceYear <= deviceYear){
        //System.out.println("Установите версию приложения для iOS по ссылке");
        //}
    }
    public static void timeOfDelivery(int distance) {
        int time = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + time);
        }
        if (distance > 20) {
            time = time + 1;
            if (distance <= 60) {
                System.out.println("Потребуется дней: " + time);
            }
        }
        if (distance > 60) {
            time = time + 1;
                if (distance <= 100) {
                    System.out.println("Потребуется дней: " + time);
                }
        }
        if (distance > 100) {
                System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1");
        //Реализуйте метод, который получает в качестве параметра год, проверяет,
        // является ли он високосным, и выводит результат в консоль.
        //Эту проверку вы уже реализовывали в задании по условным операторам.
        //Теперь проверку оберните в метод и используйте год, который приходит в
        // виде параметра.
        //Результат программы выведите в консоль. Если год високосный, то напечатайте
        // сообщение: «...  год — високосный год». Если год невисокосный, то:
        // «... год — невисокосный год».
        int year = 2024;
        printYear(year);

        //Task 2
        System.out.println("Задача 2");
        //Вспомните задание 2 из урока «Условные операторы», где вы предлагали
        // пользователю облегченную версию приложения.
        //Напишите метод, куда подаются два параметра: тип операционной системы
        // (0 — iOS, 1 — Android ) и год выпуска устройства.
        //Если устройство старше текущего года, предложите ему установить облегченную версию.
        //Текущий год можно получить таким способом:
        //int currentYear = LocalDate.now().getYear();
        //Или самим задать значение вручную — ввести в переменную числовое значение.
        //В результате программа должна выводить в консоль сообщение, какую версию
        // приложения (обычную или облегченную) и для какой ОС (Android или iOS)
        // установить пользователю.
        int clientDeviceYear = 2030;
        int clientOS = 0;
        findRightOperationSystem(clientOS, clientDeviceYear);

        //Task 3
        System.out.println("Задача 3");
        //Возвращаемся к задаче на расчет дней доставки банковской карты.
        //Ваша задача — доработать код, а именно написать метод, который на вход
        // принимает дистанцию и возвращает итоговое количество дней доставки.
        int deliveryDistance = 59;                                                      ;
        timeOfDelivery(deliveryDistance);
    }
}