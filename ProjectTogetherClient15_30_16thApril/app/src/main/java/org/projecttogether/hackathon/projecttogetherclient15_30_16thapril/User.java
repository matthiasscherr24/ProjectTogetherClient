package org.projecttogether.hackathon.projecttogetherclient15_30_16thapril;

/**
 * Created by Max on 16.04.2016.
 */
public class User {
    int id, indexSkills;
    String email, password, skills[];
    boolean interests;

    public User(String email, String password){
        this.email = email;
        this.password = password;
        interests = new boolean[10];
        skills = String[20];
        indexSkills = 0;
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
