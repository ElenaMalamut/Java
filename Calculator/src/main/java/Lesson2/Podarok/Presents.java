package Lesson2.Podarok;

public abstract class Presents {

    private String nazvanie;
    public char id;
    private int amount;
    private int ves;

    public Presents(String nazvanie, int amount, int ves, char id) {
        this.nazvanie = nazvanie;
        this.amount = amount;
        this.ves = ves;
        this.id = id;
    }

    public Presents() {
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    @Override
    public String toString() {
        return nazvanie +
                ", стоимость = " + amount +
                " руб., вес = " + ves +
                " грамм" + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}



