public  abstract class AbstractTask {
    private String title;
    private String description;
    private String priority;
    protected String status;
    protected static int taskCounter = 0;

    public AbstractTask() {
    }

    public AbstractTask(String title, String description, String priority, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        taskCounter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Выполнено ") || status.equals("Не выполнено")) {
            this.status = status;
        }
    }

    public static int getTaskCounter() {
        return taskCounter;
    }

    @Override
    public abstract String
    toString();
}





