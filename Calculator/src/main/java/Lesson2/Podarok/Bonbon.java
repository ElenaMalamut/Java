package Lesson2.Podarok;

public class Bonbon extends Presents {
    private String forma;

    public Bonbon(String nazvanie, int amount, int ves, String forma, char id) {
        super(nazvanie, amount, ves, id);
        this.forma = forma;
    }

    public Bonbon() {
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }


    @Override
    public String toString() {
        return id + " - Конфеты {" + super.toString() +
                " форма " + forma + '}';
    }
}





