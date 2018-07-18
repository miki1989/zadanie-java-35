public class Sport {
        private String name;
        private String origin;
        private int popularity;

    public Sport(String name, String origin, int popularity) {
        this.name = name;
        this.origin = origin;
        this.popularity = popularity;
    }

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
        if(o == null){
            return false;
        }
        if(!(o instanceof Sport)){
            return false;
        }
        Sport sport = (Sport) o;
        if (!name.equals(sport.name)){
            return false;
        }
        if (!origin.equals(sport.origin)){
            return false;
        }
        if (popularity != sport.popularity){
            return false;
        }
        return true;
    }

    public String toString(){
        return "Nazwa dyscypliny to "+ name + " kraj pochodzenia to " + origin + " poziom popularnosci " + popularity;
    }
}
