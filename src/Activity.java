import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Activity {

    private ArrayList<String> acceptedActivities = new ArrayList<>();
    private String name;
    private String location;

    public Activity(){
        acceptedActivities.add("name");
        acceptedActivities.add("location");
    }

    public void create(HashMap<String,String> activityMap) {
        activityMap = sanitize(activityMap);
        for (Map.Entry<String, String> entry : activityMap.entrySet()) {
            switch (entry.getKey()){
                case "name":
                    name = entry.getValue();
                case "location":
                    location = entry.getValue();
            }
        }
    }

    public HashMap<String,String> sanitize(HashMap<String,String> activityMap) {
        //TODO: create
        return activityMap;
    }
}
