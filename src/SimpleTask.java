public class SimpleTask extends AbstractTask {
    public SimpleTask() {
    }

    public SimpleTask(String title, String description, String priority, String status) {
        super(title, description, priority, status);
    }

    @Override
    public String toString() {
        return "SimpleTask{" +
                "status='" + status + '\'' +
                '}';
    }
}
