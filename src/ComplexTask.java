import java.util.Arrays;

public class ComplexTask extends AbstractTask{
    private SimpleTask[] subTasks;
    private int subTaskCount;



    public ComplexTask(String title, String description, String priority, String status, int maxSubTasks) {
        super(title, description, priority, status);
        this.subTasks = new SimpleTask[maxSubTasks];
        this.subTaskCount = 0;
    }
    public void addSubTask(SimpleTask subTask) {
        if (subTaskCount < subTasks.length) {
            subTasks[subTaskCount++] = subTask;
        }else {
            System.out.println("Невозможно дабавить больше подзадачб достигнут предел ");
        }
    }
    public void markAllSubTasksAsDone() {
        for (int i = 0; i < subTaskCount; i++ ) {
            subTasks[i].setStatus("Выполнено");
        }
    }

    @Override
    public String toString() {
        return "ComplexTask{" +
                "subTasks=" + Arrays.toString(subTasks) +
                ", subTaskCount=" + subTaskCount +
                ", status='" + status + '\'' +
                '}';
    }
}
