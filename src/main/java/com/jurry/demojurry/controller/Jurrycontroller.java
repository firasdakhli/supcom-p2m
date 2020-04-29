package com.jurry.demojurry.controller;
import com.jurry.demojurry.models.Jurry;
import com.jurry.demojurry.repositories.JurryRepository;
//import com.jurry.demojurry.services.SequenceGeneratorService;
//import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import com.jurry.demojurry.exception.NotFoundException;

import java.util.List;

/*import javax.sound.midi.Sequence;*/
//import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")/*to connect with mongodb */
@RestController /* tell spring that tis classe wil be requested by url and return data to the request */
@RequestMapping("/api")/*any request starting with /jurry wil be switched to this controller */
/**
 * Jurrycontroller
 */
public class Jurrycontroller {

    @Autowired /* allow us to acces and modifiy the database */
    private JurryRepository repository;
    /*private SequenceGeneratorService sequenceGeneratorService;*/
    @GetMapping("/jurry")
    public List<Jurry> getAlJurries(){
        return repository.findAll();
    }

    /*/*@RequestMapping(value = "/")/*, method = RequestMethod)*/
    @GetMapping("/jurry/{id}")
    public ResponseEntity<Jurry> getJurryById(@PathVariable("id") String id) throws NotFoundException {
        Jurry j = repository.findById(id) //or ..findById(id).get() : si on ne va pas mettre des exceptions et pour prendre la valeur
           .orElseThrow(() -> new NotFoundException("sorry firas this jurry not foud for this id:" + id));
        return ResponseEntity.ok().body(j);
   }
   @PostMapping("/jurry")
   public Jurry createJurry(@Valid @RequestBody Jurry jurry){
      repository.save(jurry);
      return jurry;
   }

   @PutMapping("/jurry/{id}")
   public ResponseEntity<Jurry> updatejurry(@PathVariable(value = "id") String id_jurry, @Valid @RequestBody Jurry details_jurry) throws NotFoundException {
       Jurry jurry = repository.findById(id_jurry)
             .orElseThrow(() -> new NotFoundException("sorry firas this jurry not foud for this id:" + id_jurry));
     //  jurry.set_id(details_jurry.get_id());
       jurry.setAdresse(details_jurry.getAdresse());
       jurry.setName(details_jurry.getName());
       jurry.setPassword(details_jurry.getPassword());
       Jurry upadtedJurry = repository.save(jurry);
       return ResponseEntity.ok().body(upadtedJurry);
   }
   @DeleteMapping("/jurry/{id}")
   public void deletePet(@PathVariable String id)  throws NotFoundException  {
      repository.delete(repository.findById(id).get());
   }  
}


    

