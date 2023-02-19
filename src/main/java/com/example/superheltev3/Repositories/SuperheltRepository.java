package com.example.superheltev3.Repositories;

import com.example.superheltev3.Model.Superhelt;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheltRepository {
    private List<Superhelt> superheroes = new ArrayList<Superhelt>(List.of(
            new Superhelt("Superman", "Clark kent", "Superhuman strength", false),
            new Superhelt("Batman", "Bruce Wayne", "gadgets", true),
            new Superhelt("Aquaman", "Arthur Curry", "Breathing Underwater", true)
    ));

    public List<Superhelt> getSuperheroes() {
        return superheroes;
    }

    public Superhelt addSuperheroes(Superhelt superhelt) {
        superheroes.add(superhelt);

        return superhelt;
    }

    public Superhelt changeSuperhero(Superhelt superhelt) {
        int i = 0;
        while (i < superheroes.size()) {
            if (superhelt.getHeroName() == superheroes.get(i).getHeroName()) {
                superheroes.set(i, superhelt);
                return superhelt;
            } else if (superhelt.getRealName() == superheroes.get(i).getRealName()) {
                superheroes.set(i, superhelt);
                return superhelt;
            }

        }
        return null;
    }

    public void deleteSuperhero(String heroName) {
    }
}


