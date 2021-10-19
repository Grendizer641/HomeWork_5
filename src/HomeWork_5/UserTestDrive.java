package HomeWork_5;

import java.util.Random;

public class UserTestDrive {

    private static Random random = new Random();

//    private int maxAge = 65; Не понял, почему здесь компилятор ругается на нестатические поля
//    private int minAge = 18;
//    private static int diffAge;
    private static int maxAge = 65;
    private static int minAge = 18;
    private static int diffAge = maxAge - minAge;


    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Иванов Иван Иванович", "Разработчик Java", "ivanov@mail.ru", "86547652895", 90000, random.nextInt(diffAge+1) + minAge);
        users[1] = new User("Петров Петр Петрович", "Дворник", "petrov@mail.ru", "865543852895", 30000, random.nextInt(diffAge+1) + minAge);
        users[2] = new User("Федоров Федор Федорович", "Росгвардеец", "fedorov@mail.ru", "86349753195", 45000, random.nextInt(diffAge+1) + minAge);
        users[3] = new User("Алексеев Алексей Алексеевич", "Бармен", "alekseev@mail.ru", "86097652895", 60000, random.nextInt(diffAge+1) + minAge);
        users[4] = new User("Санов Сан Саныч", "Менеджер", "sanov@mail.ru", "865465678895", 80000, random.nextInt(diffAge+1) + minAge);

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40){
                users[i].printUserInfo();
            }

        }

    }
}
