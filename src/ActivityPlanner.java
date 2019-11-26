public class ActivityPlanner {

    protected static DatabaseUtility dbUtil;

    public static void main(String[] args){
        init(args);
    }

    public static void init(String[] args){

        dbUtil = new DatabaseUtility();
        dbUtil.loadDatabase();



    }


}
