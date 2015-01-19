package isufiles;

import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue {

    private int size;
    private ArrayList list[];

    public LinkedPriorityQueue(int s) {
        size = s;
        list = new ArrayList[size];
        for (int x = 0; x < size; x++) {
            list[x] = new ArrayList();
        }
        
    }

    public void enqueue(Object obj, int priority) {
        list[priority].add(obj);//adds the patient to the proper queue
    }

    public Object peekFront() {
        if(list[0].isEmpty()){
            if(list[1].isEmpty()){
                if(list[2].isEmpty())return "";
                return list[2].get(0);
            }
            return list[1].get(0);
        }
        return list[0].get(0);
    }
    
    
    public Object dequeue(){    
        
        if(list[0].isEmpty()){//checks critical queue first 
            if(list[1].isEmpty()){//then serious queue
                if(list[2].isEmpty())return "\tNo one to treat";//returns this if all queues are empty
                return list[2].remove(0);                
            }
            return list[1].remove(0);
        }
        return list[0].remove(0);
    }

    public void enqueue(Object o) {//they didnt give a priority, so we cant 
        throw new IllegalStateException("Must give a priority");//not used at all
    }

    public int size() {
        return list.length;
    }
    public int queueSize(int i){
        return list[i].size();
    }
    public boolean hasData(){
        for (int i = 0; i<size; i++){
            if(queueSize(i)>0)
                return true;
        }
        return false;
    }

}
