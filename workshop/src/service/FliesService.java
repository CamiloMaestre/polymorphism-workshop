package service;

import entities.Flies;
import entities.Passengers;
import repository.FliesRepository;

public class FliesService {
    private FliesRepository repo= new FliesRepository();

    public void saveData(Flies f){


        if(repo.Getflies(f.getCodeFly()) != null){
            System.out.println("el pasajero ya existe");
            return;
        }
        if(f.getCapacity()<0){
            System.out.println("la capacidad no puede ser negativa");
            return;
        }
        if(f.getPriceticket()<0){
            System.out.println("el precio no puede ser negativo");
            return;
        }
        repo.fliesSave(f);
    }


}
