import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimpleTask simpleTask1 = new SimpleTask("Простая задача 1", "Описания 1 ", " Высокий ", "Не выполнено ");
        SimpleTask simpleTask2 = new SimpleTask("Простая задача 2", "Описания 2 ", " Средний ", "Не выполнено ");

        ComplexTask complexTask = new ComplexTask("Сложная задача ", "Описаниу сложной задачи " , "Низкий ", "Не выполено ", 5);
        complexTask.addSubTask(simpleTask1);
        complexTask.addSubTask(simpleTask2);

        System.out.println(simpleTask1);
        System.out.println(simpleTask2);
        System.out.println(complexTask);

        complexTask.markAllSubTasksAsDone();
        System.out.println(complexTask);

        System.out.println("Всего создана задач : " + SimpleTask.getTaskCounter());







    }
}








