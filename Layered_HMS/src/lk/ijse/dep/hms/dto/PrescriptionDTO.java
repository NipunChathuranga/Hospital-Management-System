package lk.ijse.dep.hms.dto;

import java.sql.Date;
import java.util.List;

public class PrescriptionDTO {

    private String prescriptionid;
    private String appoinmentid;
    private List<PrescriptionDetailDTO> prescriptionDetails;

    public PrescriptionDTO() {
    }

    public PrescriptionDTO(String prescriptionid, String appoinmentid, List<PrescriptionDetailDTO> prescriptionDetails) {
        this.prescriptionid = prescriptionid;
        this.appoinmentid = appoinmentid;
        this.prescriptionDetails = prescriptionDetails;
    }

    public String getPrescriptionid() {
        return prescriptionid;
    }

    public void setPrescriptionid(String prescriptionid) {
        this.prescriptionid = prescriptionid;
    }

    public String getAppoinmentid() {
        return appoinmentid;
    }

    public void setAppoinmentid(String appoinmentid) {
        this.appoinmentid = appoinmentid;
    }

    public List<PrescriptionDetailDTO> getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(List<PrescriptionDetailDTO> prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    @Override
    public String toString() {
        return "PrescriptionDTO{" +
                "prescriptionid='" + prescriptionid + '\'' +
                ", appoinmentid='" + appoinmentid + '\'' +
                ", prescriptionDetails=" + prescriptionDetails +
                '}';
    }
}
