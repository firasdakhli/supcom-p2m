package com.jurry.demojurry.models;

import org.bson.types.ObjectId;
/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/*import org.springframework.data.mongodb.core.mapping.Field;*/
 /**
  * jurry
  */
  @Document(collection = "mark")
 public class Mark {

 
    @Id /* to tell spring that_id will be used as the primary identifier*/
    //public ObjectId _id;
    public String _id;

   /* @Field(value="name")*/
    @Indexed(unique = true)
 
     public String president_Name;
     public String note_Final;
     public String jurry_Name_1;
     public String jurry_Name_2;
     public String jurry_Name_3;
     public String jurry_Name_4;
     public String jurry_Name_5;
     public String member_Presence_1; 
     public String member_Presence_2;
     public String member_Presence_3;
     public String member_Presence_4;
     public String member_Presence_5;
     public String jurry_1_Validation;
     public String jurry_2_Validation;
     public String jurry_3_Validation; 
     public String jurry_4_Validation;
     public String jurry_5_Validation;
     public String reviewer_Validation;
     public String reviewer_Presence; 
     public String reviewer_Mark; 
     public String reviewer_Name;
     public String student_Name;
     public String project_Name;
     public String supervisor_1;
     public String supervisor_1_Validation;
     public String supervisor_1_Mark;
     public String supervisor_1_Presence;
     public String president_Validation;
     
     
    
    

   /* @Field(value="adresse")*/
   @Indexed(unique = true)
    public String adresse;
    public Mark(){}
    public Mark(String reviewer_name,String reviewer_mark,
    String jurry_name_1,String jurry_name_2,String jurry_name_3,String jurry_name_4,String jurry_name_5,String student_name,String president_name,
      String _id, String supervisor_1,String project_name,String supervisor_1_mark, String note_final,String jurry_name_1_validation,String jurry_name_2_validation,
      String jurry_name_3_validation,String jurry_name_4_validation,String jurry_name_5_validation,String reviewer_name_validation,
      String member_Presence_1, String member_Presence_2, String member_Presence_3, String member_Presence_4, String member_Presence_5,String reviewer_Presence ){
     
        
        this.reviewer_Name = reviewer_name;
        this.reviewer_Mark = reviewer_mark;
        this.jurry_1_Validation = jurry_name_1_validation;
        this.jurry_2_Validation = jurry_name_2_validation;
        this.jurry_3_Validation = jurry_name_3_validation;
        this.jurry_4_Validation = jurry_name_4_validation;
        this.jurry_5_Validation = jurry_name_5_validation;
        this.reviewer_Validation = reviewer_name_validation;
        this.jurry_Name_1 =jurry_name_1;
        this. member_Presence_1 = member_Presence_1;this. member_Presence_1 = member_Presence_1;this. member_Presence_1 = member_Presence_1;this. member_Presence_1 = member_Presence_1;this. member_Presence_1 = member_Presence_1;this.reviewer_Presence = reviewer_Presence;
        this.jurry_Name_2 =jurry_name_2;
        this.jurry_Name_3 =jurry_name_3;
        this.jurry_Name_4 =jurry_name_4;
        this.jurry_Name_5 =jurry_name_5;
        this.note_Final = note_final;
        this.student_Name =student_name;
        this.president_Name =president_name;
        this.supervisor_1 = supervisor_1;
        this.supervisor_1_Mark = supervisor_1_mark;
        this.project_Name  = project_name;   
        this._id = (ObjectId.get().toHexString());

    }
    public String get_id(){return _id;}
    public void set_id(String _id) { this._id = _id; }

    /*@Override
	public String toString() {
		return "Jurry [id=" + _id + ", Name=" + name + ", adresse=" + adresse +",password="+password
				+ "]";
	}	*/


 }