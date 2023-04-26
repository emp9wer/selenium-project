package src.day30_InheritanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person {

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        setElectedDate(electedDate);
    }

    private LocalDate electedDate;

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName()+" is lying");

    }
}
