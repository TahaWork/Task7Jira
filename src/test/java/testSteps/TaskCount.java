package testSteps;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.Assert;

import static pagesElement.ProjectElements.*;

public class TaskCount {
    @Step("Считаем все задачи")

    public static void TaskCountAll() {

        Assert.assertFalse("Посчитать все задачи не удалось", allTasks.isEmpty());
        Allure.addAttachment("Всего найдено задач: ", String.valueOf(allTasks.size()));

    }
    @Step("Считаем задачи нужно сделать")
    public static void TaskCountToDo() {

        System.out.println("Нужно сделать: " + toDo.size());
        Assert.assertFalse("Посчитать задачи которые нужно сделать не удалось", toDo.isEmpty());
        Allure.addAttachment("Нужно сделать задач: ", String.valueOf(toDo.size()));

    }
    @Step("Считаем задачи в работе")
    public static void TaskCountInWork() {

        Assert.assertFalse("Посчитать задачи в работе не удалось", inWork.isEmpty());
        Allure.addAttachment("В работе : ", String.valueOf(inWork.size()));

    }
    @Step("Считаем задачи Выполнено")
    public static void TaskCountDone() {

        Assert.assertFalse("Посчитать выполненные не удалось", done.isEmpty());
        Allure.addAttachment("Нужно сделать : ", String.valueOf(done.size()));

    }
}
