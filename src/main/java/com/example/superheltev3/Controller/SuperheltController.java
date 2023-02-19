package com.example.superheltev3.Controller;

import com.example.superheltev3.Model.Superhelt;
import com.example.superheltev3.Services.SuperheltService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/superhelte")
public class SuperheltController {
    private SuperheltService superheltService;

    public SuperheltController(SuperheltService superheltService) {
        this.superheltService = superheltService;
    }
    @GetMapping(path = "/")
    public ResponseEntity<List<Superhelt>> getSuperheroes() {
        List superheroList = superheltService.getSuperheroes();
        return new ResponseEntity<List<Superhelt>>(superheroList, HttpStatus.OK);
    }
    @PostMapping(path = "/opret")
    public ResponseEntity<Superhelt> postSuperheroes(@RequestBody Superhelt superhelt){
        Superhelt returnSuperhelt = superheltService.postSuperheroes(superhelt);
        return new ResponseEntity<Superhelt>(returnSuperhelt,HttpStatus.OK);
    }
    @PutMapping(path = "/ret")
    public ResponseEntity<Superhelt> putSuperheroes(@RequestBody Superhelt superhelt) {
        Superhelt returnSuperhelt = superheltService.putSuperheroes(superhelt);
        return new ResponseEntity<Superhelt>(returnSuperhelt,HttpStatus.OK);
    }
    @DeleteMapping(path = "/delete/{heroName}")
    public void deleteSuperhero(@PathVariable("heroName")String heroName){
        superheltService.deleteSuperheroByName(heroName);
    }
}
