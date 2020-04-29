package com.jurry.demojurry.models;

//import org.bson.types.ObjectId;
/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/*import org.springframework.data.mongodb.core.mapping.Field;*/
 /**
  * jurry
  */
  @Document(collection = "jurry")
 public class Jurry {

 
    @Id /* to tell spring that_id will be used as the primary identifier*/
    //public ObjectId _id;
    public String _id;

   /* @Field(value="name")*/
    @Indexed(unique = true)
    public String name;
    public String phone;
    public String password;

   /* @Field(value="adresse")*/
   @Indexed(unique = true)
    public String adresse;
    public Jurry(){}
    public Jurry(String name, String adresse, String id,String password,String phone){
     
        this.name = name;
        this.phone = phone;
        this.adresse = adresse;
        this._id = id;
        this.password = password;

    }
    public String get_id(){return _id;}
    public void set_id(String _id) { this._id = _id; }

    public String getName(){return name;}
    public void setName(String name) { this.name = name; }

    public String getPhone(){return phone;}
    public void setPhone(String ph) { this.phone = ph; }

    public String getAdresse(){return adresse;}
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public String getPassword(){return password;}
    public void setPassword(String password) { this.password = password; }

    @Override
	public String toString() {
		return "Jurry [id=" + _id + ", Name=" + name + ", adresse=" + adresse +",password="+password
				+ "]";
	}	


 }