package testSteps;


import io.qameta.allure.Step;
import org.junit.Assert;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProp {
    public static String pass;
    public static String login;
    public static String taskType;
    public static String taskSprint;
    public static String taskText;
    public static String taskSubj;
    public static String taskName;
    @Step("Получаем данные из applicaton.properties")
    public static void getProp() {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream ("./src/test/resources/application.properties");
            property.load(fis);
            login = property.getProperty("login");
            pass = property.getProperty("pass");
            taskType = property.getProperty("taskType");
            taskSprint = property.getProperty("taskSprint");
            taskText = property.getProperty("taskText");
            taskSubj = property.getProperty("taskSubj");
            taskName = property.getProperty("taskName");

        } catch (IOException e) {
            Assert.assertTrue("Файл application.properties отсуствует", System.err.checkError() );

        } }
}
