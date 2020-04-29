package com.jurry.demojurry.models;
import com.jurry.demojurry.models.Formulaire;
import org.bson.types.ObjectId;
/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/*import org.springframework.data.mongodb.core.mapping.Field;*/
 /**
  * jurry
  */
  /**
   * Formulaire
   */
 
  @Document(collection = "formulaire")
public class Formulaire  {

 
    @Id /* to tell spring that_id will be used as the primary identifier*/
    public String _id;
   


   /* @Field(value="name")*/

   public String president_Email;
   public String president_Name;public String president_SurName;
    public String jurry_Name_1;public String jurry_SurName_1;
    public String jurry_Email_1;
    public String jurry_Name_2;public String jurry_SurName_2;
    public String jurry_Email_2;
    public String jurry_Name_3; public String jurry_SurName_3;
    public String jurry_Email_3;
    public String jurry_Name_4; public String jurry_SurName_4;
    public String jurry_Email_4;
    public String jurry_Name_5; public String jurry_SurName_5;
    public String jurry_Email_5;
    public String student_Name; public String student_SurName;
    public String student_Email;
    public String intership;
    public String class_number;
    public String date;
    public String time;
    public String supervisor_1; public String supervisor_1_SurName;
    public String supervisor_1_Email;
    public String reviewer_Name; public String reviewer_SurName;
    public String reviewer_Email;
    public String supervisor_2_Email;
    public String supervisor_2; public String supervisor_2_SurName;
    public String project_Name;

   /* @Field(value="adresse")*/
  
    
    public Formulaire(){}
    public Formulaire(String jurry_email_1,String jurry_email_2,String jurry_email_3,String jurry_email_4,String jurry_email_5,String student_email,String president_email,
    String jurry_name_1,String jurry_surname_1,String jurry_name_2,String jurry_surname_2,String jurry_name_3,String jurry_surname_3,String jurry_name_4,String jurry_surname_4,String jurry_name_5,String jurry_surname_5,String student_name,String student_surname,String president_name,String president_surname, String intership,
    String class_number, String date, String time, String _id, String supervisor_1,String supervisor_1_surname,String supervisor_2,String supervisor_2_surname,String project_name,String supervisor_2_email,String supervisor_1_email,
    String reviewer_name, String reviewer_surname,String reviewer_email){
     
        this.jurry_Email_1 =jurry_email_1;
        this.jurry_Name_1 =jurry_name_1;this.jurry_SurName_1 =jurry_surname_1;
        this.reviewer_Email =reviewer_email;
        this.reviewer_Name =reviewer_name; this.reviewer_SurName =reviewer_surname;
        this.jurry_Email_2 =jurry_email_2;
        this.jurry_Name_2 =jurry_name_2; this.jurry_SurName_2 =jurry_surname_2;
        this.jurry_Email_3 =jurry_email_3;
        this.jurry_Name_3 =jurry_name_3;this.jurry_SurName_3 =jurry_surname_3;
        this.jurry_Email_4 =jurry_email_4;
        this.jurry_Name_4 =jurry_name_4; this.jurry_SurName_4 =jurry_surname_4;
        this.jurry_Email_5 =jurry_email_5;
        this.jurry_Name_5 =jurry_name_5;this.jurry_SurName_5 =jurry_surname_5;
        this.student_Email =student_email;
        this.student_Name =student_name;this.student_SurName =student_surname;
        this.president_Email =president_email;
        this.president_Name =president_name;this.president_SurName =president_surname;
        this.intership = intership;
        this.class_number = class_number;
        this.date = date;
        this.time = time; 
        this.supervisor_2 = supervisor_2; this.supervisor_2_SurName = supervisor_2_surname;
        this.supervisor_1 = supervisor_1; this.supervisor_1_SurName = supervisor_1_surname;
        this.supervisor_1_Email = supervisor_1_email;
        this.supervisor_2_Email = supervisor_2_email;
        this.project_Name  = project_name;   
        this._id = (ObjectId.get().toHexString());

    }
    public String get_id(){return _id;}
    public void set_id(String _id) { this._id = _id; }

    public String getProject_Name(){return this.project_Name;}
    public String getJurry_Name_1(){return this.jurry_Name_1;}
    public String getJurry_Name_2(){return this.jurry_Name_2;}
    public String getJurry_Name_3(){return this.jurry_Name_3;}
    public String getJurry_Name_4(){return this.jurry_Name_4;}
    public String getJurry_Name_5(){return this.jurry_Name_5;}
    public String getPresident_Name(){return this.president_Name;}
    public String getSupervisor_1(){return this.supervisor_1;}
    public String getSupervisor_2(){return this.supervisor_2;}
    public String getStudent_Name(){return this.student_Name;}
    public String getReviewer_Name(){return this.reviewer_Name;}

    public String getJurry_SurName_1(){return this.jurry_SurName_1;}
    public String getJurry_SurName_2(){return this.jurry_SurName_2;}
    public String getJurry_SurName_3(){return this.jurry_SurName_3;}
    public String getJurry_SurName_4(){return this.jurry_SurName_4;}
    public String getJurry_SurName_5(){return this.jurry_SurName_5;}
    public String getPresident_SurName(){return this.president_SurName;}
    public String getSupervisor_1_SurName(){return this.supervisor_1_SurName;}
    public String getSupervisor_2_SurName(){return this.supervisor_2_SurName;}
    public String getStudent_SurName(){return this.student_SurName;}
    public String getReviewer_SurName(){return this.reviewer_SurName;}

    public String getReviewer_Email(){return this.reviewer_Email;}
    public String getJurry_Email_1(){return this.jurry_Email_1;}
    public String getJurry_Email_2(){return this.jurry_Email_2;}
    public String getJurry_Email_3(){return this.jurry_Email_3;}
    public String getJurry_Email_4(){return this.jurry_Email_4;}
    public String getJurry_Email_5(){return this.jurry_Email_5;}
    public String getPresident_Email(){return this.president_Email;}
    public String getStudent_Email(){return this.student_Email;}
    public String getSupervisor_1_Email(){return this.supervisor_1_Email;}
    public String getSupervisor_2_Email(){return this.supervisor_2_Email;}
    public String getIntership(){return this.intership;}
    public String getClass_number(){return this.class_number;}
    public String getDate(){return this.date;}
    public String getTime(){return this.time;}

    public void setProject_Name(String project_name){this.project_Name = project_name;}
   public void setJurry_Name_1(String jurry_name_1){this.jurry_Name_1 = jurry_name_1;}
    public void setJurry_Name_2(String jurry_name_2){this.jurry_Name_2 = jurry_name_2;}
    public void  setJurry_Name_3(String jurry_name_3){this.jurry_Name_3 = jurry_name_3;}
    public void  setJurry_Name_4(String jurry_name_4){this.jurry_Name_4 = jurry_name_4;}
    public void  setJurry_Name_5(String jurry_name_5){this.jurry_Name_5 = jurry_name_5;}
    public void  setPresident_Name(String president_name){this.president_Name = president_name;}
    public void  setSupervisor_1(String supervisor_1){this.supervisor_1 = supervisor_1 ;}
    public void  setSupervisor_2(String supervisor_2){this.supervisor_2 = supervisor_2;}
    public void  setStudent_Name(String student_name){this.student_Name = student_name;}
    public void  setReviewer_Email(String reviewer_email){this.reviewer_Email = reviewer_email;}
    public void  setReviewer_Name(String reviewer_name){this.reviewer_Name = reviewer_name;}

    public void setJurry_SurName_1(String jurry_surname_1){this.jurry_SurName_1 = jurry_surname_1;}
    public void setJurry_SurName_2(String jurry_surname_2){this.jurry_SurName_2 = jurry_surname_2;}
    public void  setJurry_SurName_3(String jurry_surname_3){this.jurry_SurName_3 = jurry_surname_3;}
    public void  setJurry_SurName_4(String jurry_surname_4){this.jurry_SurName_4 = jurry_surname_4;}
    public void  setJurry_SurName_5(String jurry_surname_5){this.jurry_SurName_5 = jurry_surname_5;}
    public void  setPresident_SurName(String president_name){this.president_SurName = president_name;}
    public void  setSupervisor_1_SurName(String supervisor_1_sur){this.supervisor_1_SurName = supervisor_1_sur ;}
    public void  setSupervisor_2_SurName(String supervisor_2_sur){this.supervisor_2_SurName = supervisor_2_sur;}
    public void  setStudent_SurName(String student_surname){this.student_SurName = student_surname;}
    public void  setReviewer_SurName(String reviewer_surname){this.reviewer_SurName = reviewer_surname;}

    public void  setJurry_Email_1(String jurry_email_1){this.jurry_Email_1 = jurry_email_1;}
    public void  setJurry_Email_2(String jurry_email_2){this.jurry_Email_2 = jurry_email_2;}
    public void  setJurry_Email_3(String jurry_email_3){this.jurry_Email_3 = jurry_email_3;}
    public void  setJurry_Email_4(String jurry_email_4){this.jurry_Email_4 = jurry_email_4;}
    public void setJurry_Email_5(String jurry_email_5){this.jurry_Email_5 = jurry_email_5;}
    public void setPresident_Email(String president_email){this.president_Email = president_email;}
    public void  setStudent_Email(String student_email){this.student_Email = student_email;}
    public void  setSupervisor_1_Email(String supervisor_1_email){this.supervisor_1_Email = supervisor_1_email;}
    public void  setSupervisor_2_Email(String supervisor_2_email){this.supervisor_2_Email = supervisor_2_email;}
    public void  setIntership(String intership){this.intership = intership;}
    public void  setClass_number(String class_number){this.class_number = class_number;}
    public void  setDate(String date){this.date = date;}
    public void  setTime(String time){this.time = time;}

    @Override
	public String toString() {
		return "le formulaire cbnnnn <3]";
	}	


 }