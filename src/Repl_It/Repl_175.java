package Repl_It;

public class Repl_175 {
    public static void main(String[] args) {



validateTask(false,3,2);

    }
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {
        return notEmpty && ((taskId-currentId)==1);

    }
}
