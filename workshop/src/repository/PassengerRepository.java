package repository;

import entities.Passengers;

import java.util.ArrayList;

public class PassengerRepository {

    private ArrayList<Passengers> list= new ArrayList<>();

    public void passajerSave(Passengers p){

        list.add(p);

    }

    public ArrayList<Passengers> listAll(){
        return list;
    }
    public Passengers Getpassangers(long id){
        for (Passengers p: list){
            if(p.getId()== id){
                return p;
            }
        }
        return null;
    }
    public Passengers GetpassangersPasspor(long id){
        for (Passengers p: list){
            if(p.getPassNumber()== id){
                return p;
            }
        }
        return null;
    }




}
