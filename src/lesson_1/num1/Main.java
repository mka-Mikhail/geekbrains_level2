package lesson_1.num1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        RunningTrack runningTrack = new RunningTrack(100);
        Wall wall = new Wall(50);

        Cat cat = new Cat(100, 36);
        Human human = new Human(16, 60);
        Robot robot = new Robot(56, 100);

        Object[] tests = new Object[2];
        tests[0] = runningTrack;
        tests[1] = wall;

        Object[] members = new Object[3];
        members[0] = cat;
        members[1] = human;
        members[2] = robot;

        boolean res = false;

        for (int i = 0; i < members.length; i++) {

            for (int j = 0; j < tests.length; j++) {

                //Беговая дорожка
                if (tests[j].getClass() == RunningTrack.class) {
                    res = test("getNumberOfRun", "run", members[i], "getLength", tests[j]);
                }

                //Стена
                if (tests[j].getClass() == Wall.class) {
                    res = test("getNumberOfJump", "jump", members[i], "getHeight", tests[j]);
                }

                //Если участник не проходит испытание, то он не допускается к следующим испытаниям и идёт следующий участник
                if (res == false) break;
            }

            if (res == false) continue;
        }

        /*runningTrack.result(cat.getNumberOfRun() - runningTrack.getLength() >= 0);
        wall.result(cat.getNumberOfJump() - wall.getHeight() >= 0);*/
    }

    public static boolean test(String numberOf, String act, Object member, String getValueOfTest, Object test) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //Определяется участник
        Object obj1 = member;
        //Находим метод, который возвращает значение (numberOf), определяющее сколько участник бегает или прыгает (зависит от испытания)
        Method method1 = obj1.getClass().getMethod(numberOf, null);
        int m1 = (int) method1.invoke(obj1, null);//Записываем значение найденного метода

        //Определяется действие участника (бег или прыжок) в зависимости от препятствия
        Method action = obj1.getClass().getMethod(act, null);
        action.invoke(obj1, null);

        //Определяется препятствие
        Object obj2 = test;
        //Находим метод getLength или getHeight
        Method method2 = obj2.getClass().getMethod(getValueOfTest, null);
        int m2 = (int) method2.invoke(obj2, null);//Записываем значение найденного метода

        //Находим метод для вывода результата после прохождения участником перпятствия
        Method method3 = obj2.getClass().getMethod("result", boolean.class);
        boolean res = (boolean) method3.invoke(obj2, (m1 - m2 >= 0));//Вызываем найденый метод, и результат сохраняем

        System.out.println();

        return res;
    }
}
