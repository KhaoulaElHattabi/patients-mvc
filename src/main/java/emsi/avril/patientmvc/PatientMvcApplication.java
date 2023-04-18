package emsi.avril.patientmvc;

import emsi.avril.patientmvc.entities.Patient;
import emsi.avril.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null, "Hassan", new Date(),false,1));
            patientRepository.save(
                    new Patient(null, "Mohammed", new Date(),false,105 ));
            patientRepository.save(
                    new Patient(null, "Yassine", new Date(),false,47));
            patientRepository.save(
                    new Patient(null, "Hanan", new Date(),false,64));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
