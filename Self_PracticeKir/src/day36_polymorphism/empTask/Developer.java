package src.day36_polymorphism.empTask;

public class Developer extends Employee {

    private String progLang;

    public Developer(String name, int age, char gender, String id, String id2, double salary, String progLang) {
        super(name, age, gender, id, id2, salary);
        setProgLang(progLang);
    }

    public String getProgLang() {
        return progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }
}
