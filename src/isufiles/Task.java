package isufiles;

public class Task {
    
    private String name;
    private String description;
    public Task(String nm, String d){
        name = nm;
        description = d;
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public boolean validate(){
        if(name== null||description == null ||name.equals(""))
            return false;
        else
            return true;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString() {
        return "" + "name: " + name + ", description: " + description;
    }    
}