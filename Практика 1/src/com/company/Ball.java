package com.company;
public class Ball {
    private String game;
    private String color;
    public Ball(String game, String color){
        this.game = game;
        this.color = color;
    }
    public Ball(String game) {
        this.game = game;
        color = "Blue";
    }
    public void setGame(String game) {
        this.game = game;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getGame() {
        return this.game;
    }
    public String getColor() {
        return this.color;
    }
    public void isBall() {
        System.out.println(color+" ball for "+game+" is here");
    }
    public String toString() {
        return this.color+" ball for "+this.game;
    }
}