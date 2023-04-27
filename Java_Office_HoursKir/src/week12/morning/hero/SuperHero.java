package week12.morning.hero;

import java.util.ArrayList;

public class SuperHero {
    private String superHeroName;
    private String realName;
    private String universe;
    private ArrayList<String> powers;

    public SuperHero(String superHeroName, String realName, String universe, ArrayList<String> powers) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.universe = universe;
        this.powers = powers;
    }

    public void protect(){
        System.out.println(superHeroName + " protecting ");
    }


    public String toString() {
        return superHeroName+" from "+ universe + " They have these powers:\n"+ powers;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }
}
