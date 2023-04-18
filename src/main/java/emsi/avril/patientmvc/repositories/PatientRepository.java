package emsi.avril.patientmvc.repositories;

import emsi.avril.patientmvc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient,Long>{
}
