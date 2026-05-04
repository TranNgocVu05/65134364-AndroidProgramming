package tranngocvu.tranngocvu.vieccanlam;

import java.util.HashMap;

public class TASKS {
    String name;
    String date;
    String message;
    String priority;

    public TASKS(String name, String date, String message, String priority) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.priority = priority;
    }

    public TASKS() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    //
    public HashMap<String, String> toFirebaseObject() {
        HashMap<String, String>taskObject = new HashMap<String, String>();
        taskObject.put("name", name);
        taskObject.put("date",date);
        taskObject.put("message",message);
        taskObject.put("priority",priority);
        return taskObject;
    }


}
