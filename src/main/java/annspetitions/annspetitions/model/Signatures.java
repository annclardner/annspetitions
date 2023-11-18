package annspetitions.annspetitions.model;

public class Signatures {

    private int signatureId;
    private int id;

    private String name;
    private String email;

    public Signatures(int signatureId, int id, String name, String email) {
        super();
        this.signatureId = signatureId;
        this.id = id;
        this.name = name;
        this.email = email;

    }

    public int getSignatureId() {

        return signatureId;
    }

    public void setSignatureId(int signatureId) {

        this.signatureId = signatureId;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
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
        Signatures other = (Signatures) obj;
        if (id != other.getId()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return this.name;
    }

}