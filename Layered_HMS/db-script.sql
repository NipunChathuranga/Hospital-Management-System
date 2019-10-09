CREATE TABLE patient(
	patientid VARCHAR(10) PRIMARY KEY,
	firstname VARCHAR(15),
	lastname VARCHAR(20),
	gender CHAR(1),
	city VARCHAR(10),
	email VARCHAR(20),
	password VARCHAR(15)
);


CREATE TABLE doctor(
	doctorid VARCHAR(10) PRIMARY KEY,
	firstname VARCHAR(15),
	lastname VARCHAR(20),
	fee decimal(10,2),
	specialization VARCHAR(15),
	email VARCHAR(20),
	password VARCHAR(15)
);


CREATE TABLE appoinment(
    appoinmentid varchar(10) PRIMARY KEY,
    patientid VARCHAR(10),
    doctorid VARCHAR(10),
    appoinmentdate DATE,

CONSTRAINT FOREIGN KEY(patientid) REFERENCES patient(patientid)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY(doctorid) REFERENCES doctor(doctorid)
ON DELETE CASCADE ON UPDATE CASCADE

);

CREATE TABLE prescription(
    prescriptionid VARCHAR(10) PRIMARY KEY,
    appoinmentid varchar(10),
    prescriptiondate DATE,
CONSTRAINT FOREIGN KEY(appoinmentid) REFERENCES appoinment(appoinmentid)
ON DELETE CASCADE ON UPDATE CASCADE

);


CREATE TABLE medicine(
	medicineid VARCHAR(10) PRIMARY KEY,
	drugname VARCHAR(15),
	brandname VARCHAR(20),
	drugtype VARCHAR(10)
);


CREATE TABLE prescripdetail (
        prescriptionid VARCHAR(10),
	medicineid VARCHAR(10),
CONSTRAINT PK_prescripdetail PRIMARY KEY (prescriptionid,medicineid),
CONSTRAINT FOREIGN KEY(prescriptionid) REFERENCES prescription(prescriptionid)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY(medicineid) REFERENCES medicine(medicineid)
ON DELETE CASCADE ON UPDATE CASCADE
);





















