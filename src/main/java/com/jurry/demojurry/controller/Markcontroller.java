package com.jurry.demojurry.controller;
import com.jurry.demojurry.models.Mark;
import com.jurry.demojurry.repositories.MarkRepository;
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
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/*import javax.sound.midi.Sequence;*/
//import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")/*to connect with mongodb */
@RestController /* tell spring that tis classe wil be requested by url and return data to the request */
@RequestMapping("/api")/*any request starting with /jurry wil be switched to this controller */
/**
 * Jurrycontroller
 */
public class Markcontroller {

    @Autowired /* allow us to acces and modifiy the database */
    private MarkRepository repository;
    /*private SequenceGeneratorService sequenceGeneratorService;*/
    @GetMapping("/mark")
    public List<Mark> getAlMark(){
        return repository.findAll();
    }

    /*/*@RequestMapping(value = "/")/*, method = RequestMethod)*/
    @GetMapping("/mark/{id}")
    public ResponseEntity<Mark> getMarkById(@PathVariable("id") String id){
        Mark form = repository.findById(id).get();
        return ResponseEntity.ok().body(form);
   }
   @PostMapping("/mark")
   public Mark createMark(@Valid @RequestBody Mark form){
       repository.save(form);
      //form.set_id(ObjectId.get());
      
      return form;
   }

   /*@PutMapping("/formulaire/{id}")
   public ResponseEntity<Formulaire> updateFormualire(@PathVariable(value = "id") String id_form, @Valid @RequestBody Formulaire details_form){
       Formulaire form = repository.findById(id_form).get();
       form.setProject_Name(details_form. getProject_Name());
       form.setJurry_Name_1(details_form.getJurry_Name_1());
       form.setJurry_Name_2(details_form. getJurry_Name_2());   
       form.setJurry_Name_3(details_form.getJurry_Name_3());
       form.setJurry_Name_4(details_form.getJurry_Name_4());
       form.setJurry_Name_5(details_form.getJurry_Name_5());
       form.setPresident_Name(details_form.getPresident_Name());
       form.setSupervisor_1(details_form.getSupervisor_1());
       form.setSupervisor_2(details_form.getSupervisor_2());
       form.setStudent_Name(details_form.getStudent_Name());
  
       form.setJurry_Email_1(details_form.getJurry_Email_1());
       form.setJurry_Email_2(details_form.getJurry_Email_2());
       form.setJurry_Email_3(details_form.getJurry_Email_3());
       form.setJurry_Email_4(details_form.getJurry_Email_4());
       form.setJurry_Email_5(details_form.getJurry_Email_5());
       form.setPresident_Email(details_form.getPresident_Email());
       form.setStudent_Email(details_form.getStudent_Email());
       form.setSupervisor_1_Email(details_form.getSupervisor_1_Email());
       form.setSupervisor_2_Email(details_form.getSupervisor_2_Email());
       form.setIntership(details_form.getIntership());
       form.setDate(details_form.getDate());
       form.setClass_number(details_form.getClass_number());
       form.setTime(details_form.getTime());
      
       Formulaire upadtedForm = repository.save(form);
       return ResponseEntity.ok().body(upadtedForm);
   }*/
   @DeleteMapping("/mark/{id}")
   public void deleteFormulaire(@PathVariable String id) {
      repository.delete(repository.findById(id).get());
   }  
}

