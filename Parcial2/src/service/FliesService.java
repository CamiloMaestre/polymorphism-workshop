package service;

import entities.Flies;
import entities.Passengers;
import repository.FliesRepository;

public class FliesService {
    private FliesRepository repo= new FliesRepository();

    public FliesService(FliesRepository repo) {
        this.repo = repo;
    }

    public void saveData(Flies f){


        if(repo.Getflies(f.getCodeFly()) != null){
            System.out.println("el vuelo ya existe");
            return;
        }
        if(f.getSeatsAvailable()<0){
            System.out.println("la capacidad no puede ser negativa");
            return;
        }
        if(f.getBasePrice()<0){
            System.out.println("el precio no puede ser negativo");
            return;
        }
        System.out.println("Vuelo registrado exitosamente.");
        repo.fliesSave(f);
    }
    public Flies findByCode(String code) {
       return repo.Getflies(code);
    }


}
