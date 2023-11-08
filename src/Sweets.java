public class Sweets {

    private String title;
    private int units;
    private boolean hasChocolate;

    private boolean hasGluten;

    public Sweets() {
    }

    public Sweets(String title, int units, boolean hasChocolate, boolean hasGluten) {
        this.title = title;
        this.units = units;
        this.hasChocolate = hasChocolate;
        this.hasGluten = hasGluten;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public boolean isHasChocolate() {
        return hasChocolate;
    }

    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public boolean isHasGluten() {
        return hasGluten;
    }

    public void setHasGluten(boolean hasGluten) {
        this.hasGluten = hasGluten;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "title='" + title + '\'' +
                ", pakuoteje yra" + units + " " + "saldainiai" +
                ((hasChocolate) ? "yra sokoladinis " : "nera sokoladinis") +
                ((hasGluten) ? "saldainis turi gluteno" : "saldainis be gluteno") +
                '}';
    }
}
