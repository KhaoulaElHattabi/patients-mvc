package emsi.avril.patientmvc.web;

import emsi.avril.patientmvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;


}
