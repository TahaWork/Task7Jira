
        import Hooks.WebHooks;
        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Test;
        import testSteps.*;
        import static pagesElement.ProjectElements.newTask;
        import static pagesElement.ProjectElements.task;
        import static testSteps.GetProp.*;

        public class TestRun extends WebHooks {



    @Test

    @DisplayName("Считаем таски в Jira")
    public void testCountTask()  {
        getProp();
        JiraLogin.LogInJira(login, pass);
        OpenProject.GoToProject();
        TaskCount.TaskCountAll();
        TaskCount.TaskCountToDo();
        TaskCount.TaskCountInWork();
        TaskCount.TaskCountDone();
    }

    @Test

    @DisplayName("Проверяем статус и версию")
    public void testCheckTask() {
        getProp();
        JiraLogin.LogInJira(login, pass);
        OpenProject.GoToProject();
        OpenTask.OpenTask(task);
        CheckTask.CheckTaskVers();
        CheckTask.CheckTaskStatus();
    }

    @Test

    @DisplayName("создаем баг")
       public void testCreateBug() {
          getProp();
          JiraLogin.LogInJira(login, pass);
          OpenProject.GoToProject();
          CreateBug.createBug();
          OpenTask.OpenTask(newTask);
          BugStatusMove.statusMove();



       }

}

