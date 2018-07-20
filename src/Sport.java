import java.util.Objects;

public class Sport {
        private String name;
        private String origin;
        private int popularity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()) return false;
        Sport sport = (Sport) o;
        return Integer.compare(sport.popularity, popularity) == 0 && Objects.equals(name, sport.name) && Objects.equals(origin, sport.origin);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,popularity,origin);
    }

    public String toString(){
        return "Nazwa dyscypliny to "+ name + " kraj pochodzenia to " + origin + " poziom popularnosci " + popularity;
    }


}
