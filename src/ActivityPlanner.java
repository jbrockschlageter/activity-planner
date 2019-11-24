public class ActivityPlanner {

    protected static DatabaseUtility dbUtil;

    public static void main(String[] args){

        System.out.println(init(args));

    }

    public static String init(String[] args){

        dbUtil = new DatabaseUtility();
        return "Program Initialized Successfully.";

    }

}
