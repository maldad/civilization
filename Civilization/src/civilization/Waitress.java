package civilization;
/*
 * @author Zidai
 */
public class Waitress {
    private Civilizacion allBuilds;

    public Waitress(Civilizacion allBuilds) {
        this.allBuilds = allBuilds;
    }

    public void printBuilds() {
        allBuilds.print();
    }
}