import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;


public class DatabaseUtility {

    private ArrayList<Activity>  allActivities;
    private String databaseFileName;

    public DatabaseUtility(){
        databaseFileName = "C:\\Users\\jessi\\Desktop\\PERSONAL PROJECT\\Activity Planner\\src\\ACTIVITY_CSV_DATABASE.txt";
        allActivities = new ArrayList<>();
    }

    public ArrayList<Activity> getAllActivities(){
        return allActivities;
    }

    /**
     * This function parses attributes in the format: "title:value,title2:value2..."
     * @param statement CSV statement to parse
     * @return pased key/value pairs for attributes
     */
    public HashMap<String,String> parseStatement(String statement) {

        String[] statementAttrs = statement.split(",");

        HashMap<String, String> resultAttr = new HashMap<>();

        for (String attr : statementAttrs) {
            attr = attr.trim();
            String[] attrSplit = attr.split(":");

            resultAttr.put(attrSplit[0].toLowerCase(), attrSplit[1]);
        }
        return resultAttr;
    }

    /**
     * This function loads the entries from the CSV file into an array of activity classes
     * @return if the operation was sucessful, 0 if successful, -1 if failure.
     */
    public int loadDatabase(){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(databaseFileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                HashMap<String,String> activityString = parseStatement(line);
                System.out.println(activityString);
                Activity activity = new Activity();
                activity.create(activityString);
                allActivities.add(activity);
                line = bufferedReader.readLine();

            }
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }


    //TODO: write utility to load database, including loading csv hashes into activity classes. Activity class - > needs list of accepted attr?

        return 0;
    }



}

