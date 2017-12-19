package Lesson2.Podarok;

public class Candy extends Presents {
    private String nachinka;


    public Candy(String nazvanie, int amount, int ves, String nachinka, char id) {
        super(nazvanie, amount, ves, id);
        this.nachinka = nachinka;
    }

    public String getNachinka() {
        return nachinka;
    }

    public void setNachinka(String nachinka) {
        this.nachinka = nachinka;
    }

    @Override
    public String toString() {
        return id + " - Шоколадные конфеты {" + super.toString() +
                " с начинкой " + nachinka + '}';
    }
}
