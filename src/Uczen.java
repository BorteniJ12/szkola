public class Uczen extends Osoba implements Dyzurny{
//dziedziczenie dziedziczyny wszystko publiczne i chronione
    private int nrEwidencyjny;
    public static int liczbaUczniow = 0;

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaUczniow++;
        nrEwidencyjny = liczbaUczniow;

    }

    @Override
    public String toString() {
        return "Uczen: " +
                "imie:"+getImie()+
                "nazwisko:"+getNazwisko()+
                "nrEwidencyjny=" + nrEwidencyjny;

    }

    @Override
    public void wykonajDyzur() {
        System.out.println("scieram tablice");
    }
}
