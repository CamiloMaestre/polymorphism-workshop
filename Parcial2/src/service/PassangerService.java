package service;

import entities.Passengers;
import repository.PassengerRepository;

import java.util.Queue;

public class PassangerService {

    private PassengerRepository repo= new PassengerRepository();

    public PassangerService(PassengerRepository repo) {
        this.repo = repo;
    }

    public void saveData(Passengers p){


        if(repo.Getpassangers(p.getId()) != null){
            System.out.println("el pasajero ya existe");
            return;
        }
        if(repo.GetpassangersPasspor(p.getPassNumber()) != null){
            System.out.println("el # de pasajero ya existe");
            return;
        }
        if(p.getAge()<0){
            System.out.println("valor ingresadpo incorrecto");
            return;
        }
        if(!p.getEmail().contains("@")){
            System.out.println("el correo debe tener un @");
            return;
        }

        repo.passajerSave(p);

    }

    public int totalPassengers(){
        return repo.listAll().size();
    }


}
