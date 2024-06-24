import java.util.Objects;

public class BestSeller extends Book{

    private String summary;
    private int worldCopies;

    public BestSeller(int id,String name,double price,String summary,int worldCopies){
        super(id,name,price);
        this.summary=summary;
        this.worldCopies=worldCopies;
    }

    public int getWorldCopies() {
        return worldCopies;
    }

    public void setWorldCopies(int worldCopies) {
        this.worldCopies = worldCopies;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BestSeller that = (BestSeller) o;
        return worldCopies == that.worldCopies && Objects.equals(summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), summary, worldCopies);
    }

    @Override
    public String toString() {
        return "BestSeller{" +
                "summary='" + summary + '\'' +
                ", worldCopies=" + worldCopies +
                '}';
    }
}
