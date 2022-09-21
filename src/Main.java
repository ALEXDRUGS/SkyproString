public class Main {
    public static void main(String[] args) {
        //1.7. Строки
        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Фамилия сотрудника - " + middleName + " " + firstName + " " + lastName);
        //Задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
        changeChar();
    }
    //Задание 3
    public static void changeChar() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Фамилия сотрудника - " + fullName);
    }
}

