package org.projecttogether.hackathon.projecttogetherclient15_30_16thapril;

import org.json.JSONObject;

/**
 * Created by Max on 16.04.2016.
 */
public class User {
    int id, indexSkills;
    String username, email, password, skills[];
    boolean interests[];

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        interests = new boolean[10];
        skills = new String[20];
        indexSkills = 0;




        try
        {
            JSONObject json = new JSONObject();
            json.put("name", username);
            json.put("email", email);
            json.put("password", password);

        }
        catch( Exception e)
        {
     //Hier könnten Exceptions abgearbeitet werden

        }



    }

    public void setSkills(String newSkill){
        if(indexSkills < 20){
            skills[indexSkills] = newSkill;
            indexSkills++;
        }
        // exeption mehr als 20 Skills
    }

    public void setInterests(boolean interests[]){
        this.interests = interests;
    }


}

