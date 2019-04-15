package com.grunde.burke;

import java.awt.*;

public abstract class Country {

    protected int Army;
    protected int Navy;
    protected int Industry;
    protected int Colonies;
    protected int Money;
    protected ID id;

    public Country (int Army, int Navy, int Industry, int Colonies, int Money, ID id) {
        this.Army = Army;
        this.Navy = Navy;
        this.Industry = Industry;
        this.Colonies = Colonies;
        this.Money = Money;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public void setArmy(int army) {this.Army = army;}
    public void setNavy(int navy) {this.Navy = navy;}
    public void setIndustry(int industry) {this.Industry = industry;}
    public void setColonies(int colonies) {this.Colonies = colonies;}
    public void setMoney(int money) {this.Money = money;}
    public void setId(ID id) {this.id = id;}

    public ID getId() {return id;}
    public int getArmy() {return Army;}
    public int getNavy() {return Navy;}
    public int getIndustry() {return Industry;}
    public int getColonies() {return Colonies;}
}
