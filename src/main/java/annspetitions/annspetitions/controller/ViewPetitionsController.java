package annspetitions.annspetitions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import annspetitions.annspetitions.service.PetitionService;


@Controller
public class ViewPetitionsController {
    @Autowired
    PetitionService service;

    @RequestMapping(value="/petitions")
    public String showPetitions(ModelMap model){
        model.put("petitions", service.retrievePetitions());
        return "view-petitions";
    }




}