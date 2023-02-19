package com.example.superheltev3.Services;

import com.example.superheltev3.Model.Superhelt;
import com.example.superheltev3.Repositories.SuperheltRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheltService {
    private SuperheltRepository repository;

    public SuperheltService(SuperheltRepository superheroes) {
        this.repository = new SuperheltRepository();
    }

    public List<Superhelt> getSuperheroes() {
        return repository.getSuperheroes();
    }
    public Superhelt postSuperheroes(Superhelt superhelt) {
        Superhelt returnSuperhelt = repository.addSuperheroes(superhelt);
        return returnSuperhelt;
    }
    public Superhelt putSuperheroes(Superhelt superhelt) {
        Superhelt returnSuperhelt = repository.changeSuperhero(superhelt);
        return superhelt;
    }
    public void deleteSuperheroByName(String heroName){
        repository.deleteSuperhero(heroName);
    }
}
