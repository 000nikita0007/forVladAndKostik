package Lab.Class.service;

import Lab.Class.Worker;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Worker> workerList;

    public Service() {
        workerList = new ArrayList<Worker>();
    }
    public void addWorker(Worker worker){
        workerList.add(worker);
    }
    public void showWorkerList(){
        for (Worker worker : workerList) {
            System.out.println(worker);
        }
    }
}
