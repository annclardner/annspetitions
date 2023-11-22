package annspetitions.annspetitions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import annspetitions.annspetitions.service.PetitionService;
import annspetitions.annspetitions.service.SignatureService;

@Controller
@SessionAttributes("id")

public class SignPetitionController {


    @Autowired
    PetitionService service;
    @Autowired
    SignatureService signatureService;

    @RequestMapping(value="/SignPetition", method = RequestMethod.GET)
    public String signPetitions(ModelMap model, @RequestParam int id){
        model.put("id", id);
        model.put("petitions", service.retrievePetitions());
        return "sign-petition";
    }

    @RequestMapping(value="/Signature", method = RequestMethod.GET)
    public String addSignature(ModelMap model, @RequestParam int id, @RequestParam String name, @RequestParam String email){
        model.put("id", id);

        signatureService.addSignature(id, name, email);
        model.put("signatures", signatureService.retrieveSignatures(id));
        return "signatures-petitions";
    }


}