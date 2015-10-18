/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continentalconquest;

/**
 *
 * @author x13332576
 */
public class Player {
    
    public String name;    
    public int score;
    public int age;
    public String avatar;
    
    
    public Player(String inName , String inAvatar, int inAge/*, int inScore*/){
        
        score = 0;
        name = "";
        avatar = "";
        age = 0;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    } 
}
