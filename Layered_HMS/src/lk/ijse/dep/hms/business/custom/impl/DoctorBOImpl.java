package lk.ijse.dep.hms.business.custom.impl;

import lk.ijse.dep.hms.business.custom.DoctorBO;
import lk.ijse.dep.hms.dao.DAOFactory;
import lk.ijse.dep.hms.dao.DAOTypes;
import lk.ijse.dep.hms.dao.custom.DoctorDAO;
import lk.ijse.dep.hms.dto.DoctorDTO;
import lk.ijse.dep.hms.entity.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorBOImpl implements DoctorBO {

    private DoctorDAO doctorDAO = DAOFactory.getInstance().getDAO(DAOTypes.DOCTOR);

    @Override
    public boolean saveDoctor(DoctorDTO doctor) throws Exception {

        return doctorDAO.save(new Doctor(doctor.getDoctorid(), doctor.getFirstname(), doctor.getLastname(), doctor.getSpecialization(),
                doctor.getEmail(), doctor.getPassword(), doctor.getFee()));
    }

    @Override
    public boolean updateDoctor(DoctorDTO doctor) throws Exception {
        return doctorDAO.update(new Doctor(doctor.getDoctorid(), doctor.getFirstname(), doctor.getLastname(), doctor.getSpecialization(),
                doctor.getEmail(), doctor.getPassword(), doctor.getFee()));
    }

    @Override
    public boolean deleteDoctor(String doctorid) throws Exception {
        return doctorDAO.delete(doctorid);
    }

    @Override
    public List<DoctorDTO> findAllDoctors() throws Exception {
        List<Doctor> doctors = doctorDAO.findAll();
        List<DoctorDTO> doctorDTOS = new ArrayList<>();
        for (Doctor doctor : doctors) {
            doctorDTOS.add(new DoctorDTO(doctor.getDoctorid(), doctor.getFirstname(), doctor.getLastname(), doctor.getSpecialization(), doctor.getEmail(), doctor.getPassword(), doctor.getFee()));
        }

        return doctorDTOS;
    }

    @Override
    public String getLastDoctorId() throws Exception {
        return doctorDAO.getLastDoctorId();
    }

    @Override
    public DoctorDTO findDoctor(String doctorid) throws Exception {
        Doctor doctor = doctorDAO.find(doctorid);

        return new DoctorDTO(doctor.getDoctorid(), doctor.getFirstname(), doctor.getLastname(), doctor.getSpecialization(),
                doctor.getEmail(), doctor.getPassword(), doctor.getFee());
    }

    @Override
    public List<String> getAllDoctorIDs() throws Exception {
        List<Doctor> doctors = doctorDAO.findAll();
        List<String> doctorids = new ArrayList<>();

        for (Doctor doctor : doctors) {
            doctorids.add(doctor.getDoctorid());
        }

        return doctorids;

    }
}
