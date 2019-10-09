package lk.ijse.dep.hms.dao.custom;

import lk.ijse.dep.hms.dao.CrudDAO;
import lk.ijse.dep.hms.entity.Appoinment;

public interface AppoinmentDAO extends CrudDAO<Appoinment, String> {

    String getLastAppoinmentID() throws Exception;

    boolean existsByPatientID(String patientid) throws Exception;

    boolean existsByDoctorID(String doctorid) throws Exception;


}
