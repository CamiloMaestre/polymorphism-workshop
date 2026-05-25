package repository;

import entities.Flies;
import entities.Passengers;

import java.util.ArrayList;

public class FliesRepository {
    private ArrayList<Flies> list= new ArrayList<>();

    public void fliesSave(Flies f){

        list.add(f);

    }

    public ArrayList<Flies> listAll(){
        return list;
    }
    public Flies Getflies(String id){
        for (Flies f: list){
            if(f.getCodeFly().equals(id)){
                return f;
            }
        }
        return null;
    }

}
