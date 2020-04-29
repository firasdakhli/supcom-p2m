package com.jurry.demojurry.repositories;

import com.jurry.demojurry.models.Mark;
/*import java.util.List;*/

//import org.bson.types.ObjectId;
//import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
/*import org.springframework.data.mongodb.repository.Query;*/

public interface MarkRepository extends MongoRepository<Mark , String>{
   /* Formulaire findBy_id(ObjectId _id);
    /*list<Jurry>findBynameLike(String name);
    List<Jurry>findByadresseLike(String adresse);*/

    
}