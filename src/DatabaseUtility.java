import java.util.ArrayList;
import java.util.HashMap;


public class DatabaseUtility {

    private ArrayList<Activity>  allActivities;

    public DatabaseUtility(){}

    public ArrayList<Activity> getAllActivities(){
        return allActivities;
    }

    /**
     * This function parses attributes in the format: "title:value,title2:value2..."
     * @param statement CSV statement to parse
     * @return pased key/value pairs for attributes
     */
    public HashMap<String,String> parseStatement(String statement){

        String[] statementAttrs = statement.split(",");
        HashMap<String,String> resultAttr = new HashMap<>();

        for (String attr: statementAttrs){
            attr = attr.trim();
            String[] attrSplit = attr.split(":");

            resultAttr.put(attrSplit[0],attrSplit[1]);
        }
        return resultAttr;
    }

    /**
     * This function loads the entries from the CSV file into an array of activity classes
     * @return if the operation was sucessful, 0 if successful, 1 if failure.
     */
    public int loadDatabase(){

    //TODO: write utility to load database, including loading csv hashes into activity classes. Activity class - > needs list of accepted attr?

        return 1;
    }



}

