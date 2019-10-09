package lk.ijse.dep.hms.dao.custom.impl;

import lk.ijse.dep.hms.dao.CrudUtil;
import lk.ijse.dep.hms.dao.custom.DoctorDAO;
import lk.ijse.dep.hms.entity.Doctor;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO {
    @Override
    public List<Doctor> findAll() throws Exception {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM DoctorDTO");
        ArrayList<Doctor> doctors = new ArrayList<>();
        while (resultSet.next()) {
            doctors.add(new Doctor(resultSet.getString(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4), resultSet.getString(5),
                    resultSet.getString(6), resultSet.getDouble(7)));
        }
        return doctors;
    }

    @Override
    public Doctor find(String s) throws Exception {

        ResultSet resultSet = CrudUtil.execute("SELECT * FROM DoctorDTO WHERE doctorid = ?", s);
        if (resultSet.next()) {
            return new Doctor(resultSet.getString(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4), resultSet.getString(5),
                    resultSet.getString(6), resultSet.getDouble(7));
        }


        return null;
    }

    @Override
    public boolean save(Doctor entity) throws Exception {
        return CrudUtil.execute("INSERT INTO DoctorDTO VALUES(?,?,?,?,?,?,?)", entity.getDoctorid(), entity.getFirstname(), entity.getLastname(),
                entity.getFee(), entity.getSpecialization(), entity.getEmail(), entity.getPassword());
    }

    @Override
    public boolean update(Doctor entity) throws Exception {
        return CrudUtil.execute("UPDATE DoctorDTO SET doctorid=?,firstname=?,lastname=?,fee=?,specialization=?,email=?,password=?",
                entity.getDoctorid(),entity.getFirstname(),entity.getLastname(),entity.getFee(),entity.getSpecialization()
        ,entity.getEmail(),entity.getPassword());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return CrudUtil.execute("DELETE FROM DoctorDTO WHERE doctorid=?",s);
    }

    @Override
    public String getLastDoctorId() throws Exception {

        ResultSet resultSet = CrudUtil.execute("SELECT doctorid FROM DoctorDTO ORDER BY doctorid DESC LIMIT 1");
        if(resultSet.next()){
            resultSet.getString(1);
        }

        return null;
    }
}
