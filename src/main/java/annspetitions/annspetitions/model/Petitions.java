package annspetitions.annspetitions.model;

public class Petitions {
    private int id;
    private String petition;

    public Petitions(int id, String petition) {
        super();
        this.id = id;
        this.petition = petition;
    }
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getPetition() {

        return petition;
    }

    public void setPetition(String petition) {

        this.petition = petition;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Petitions other = (Petitions) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return this.petition;
    }

}