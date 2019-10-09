package lk.ijse.dep.hms.entity;

public class Patient implements SuperEntity {
    private String patientid;
    private String firstname;
    private String lastname;
    private String gender;
    private String city;
    private String email;
    private String password;

    public Patient() {
    }

    public Patient(String patientid, String firstname, String lastname, String gender, String city, String email, String password) {
        this.patientid = patientid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.city = city;
        this.email = email;
        this.password = password;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientid='" + patientid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
