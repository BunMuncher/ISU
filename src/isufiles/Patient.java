package isufiles;


public class Patient {
    private String name;
    private String condition;
    public Patient(String nm, int con){
        name=nm;
        if(con==0)condition="Critcal";
        if(con==1)condition="Serious";
        if(con==2)condition="Fair";
    }
    public String getName(){
        return name;
    }
    public String getCondition(){
        return condition;
    }
    
    public String toString(){
        String str="";        
        str+="\n" + name + "\t" + condition;
        return str;
    }
}
