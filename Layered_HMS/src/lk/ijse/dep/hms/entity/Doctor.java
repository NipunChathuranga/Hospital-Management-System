package lk.ijse.dep.hms.entity;

public class Doctor implements SuperEntity {

    private String doctorid ;
    private String firstname;
    private String lastname;
    private String specialization;
    private String email;
    private String password;
    private double fee;

    public Doctor() {
    }

    public Doctor(String doctorid, String firstname, String lastname, String specialization, String email, String password, double fee) {
        this.doctorid = doctorid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialization = specialization;
        this.email = email;
        this.password = password;
        this.fee = fee;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorid='" + doctorid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fee=" + fee +
                '}';
    }
}
