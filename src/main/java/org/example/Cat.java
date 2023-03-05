package org.example;

import com.sun.source.tree.Tree;

public class Cat {

    public Cat(){
    }
    public Cat(String nickname){
        this.nickname = nickname;
    }
    public Cat(String nickname, String catBreed){
        this.nickname = nickname;
        this.catBreed = catBreed;
    }
    public Cat(String nickname, String catBreed, String owner){
        this.nickname = nickname;
        this.catBreed = catBreed;
        this.owner = owner;

    }
    private String nickname;
    private String catBreed;
    private String owner;
    private Boolean sleepState = true;
    private Boolean locationNearby = false;
    private Boolean hungry = true;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSleepState(Boolean sleepState) {
        this.sleepState = sleepState;
    }

    public void setLocationNearby(Boolean locationNearby) {
        this.locationNearby = locationNearby;
    }

    public void setHungry(Boolean hungry) {
        this.hungry = hungry;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public String getOwner() {
        return owner;
    }

    public Boolean getSleepState() {
        return sleepState;
    }

    public Boolean getLocationNearby() {
        return locationNearby;
    }

    public Boolean getHungry() {
        return hungry;
    }

    public void callCat(Person p){
        if (this.sleepState == true) {
            this.sleepState = false;
            System.out.println("Кот спал, но проснулся");
        }
        if (p.getName() == owner) {
            this.locationNearby = true;
            System.out.println("Кот подошел к "+p.getName());
        }
        else {
            System.out.println("Кот предпочитает не подходить к посторонним людям");
        }
    }
    public void banishCat(Person p){
        if (this.locationNearby == true) {
            if (p.getName() == owner) {
                this.locationNearby = false;
                System.out.println("Кот убежал");
            }
            else {
                this.locationNearby = false;
                System.out.println("Кот оцарапал " + p.getName() + " и убежал");
            }
        }
        else {
                System.out.println("Кот итак далеко");
            }

    }
    public void feedCat(){
        if (this.locationNearby == true) {
            if (this.hungry == true) {
                this.hungry = false;
                this.locationNearby = false;
                System.out.println("Кот поел, отошел и лёг спать");
            } else {
                System.out.println("Кот сыт");
            }
        }
        else {
                System.out.println("Что бы покормить кота, его сначала нужно позвать");
            }

    }
}
