package emsi.avril.patientmvc.web;

import emsi.avril.patientmvc.entities.Patient;
import emsi.avril.patientmvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping(path="/index")
    public String patients(Model model,
                           @RequestParam(name="page", defaultValue = "0") int page,
                           @RequestParam(name="keyword",defaultValue = "") String keyword,
                           @RequestParam(name="size", defaultValue = "5") int size){
        //List<Patient> patients = patientRepository.findAll();
        //model.addAttribute("ListPatients",patients);
        Page<Patient> pagePatients = patientRepository.findByNomContains(keyword,PageRequest.of(page,size));
        model.addAttribute("ListPatients",pagePatients.getContent());
        model.addAttribute("pages",new int [pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",keyword);
        return "patients";
    }
    @GetMapping("/delete")
    public String delete(Long id , String keyword , int page) {
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    }
    @GetMapping("/patients")
    @ResponseBody
    public List<Patient> listPatients(){
        return patientRepository.findAll();
    }
     @GetMapping("/formPatients")
    public String formPatient(){
        return "formPatients";
     }
}
