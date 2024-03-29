package annspetitions.annspetitions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import annspetitions.annspetitions.service.PetitionService;




@Controller


public class CreatePetitionController {

    @Autowired
    PetitionService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String CreatePetition() {

        return "create-petition";
    }
    @RequestMapping(value = "/add-petition", method = RequestMethod.POST)
    public String addPetitions(ModelMap model, @RequestParam String petition) {
        service.addPetition(petition);
        model.put("petitions", service.retrievePetitions());
        return "view-petitions";
    }

    @RequestMapping(value="/search-petitions")
    public String searchPetitions(ModelMap model){
        return "search-petition";
    }


    @RequestMapping(value="/search-result-petition")
    public String searchResultPetitions(ModelMap model, @RequestParam String search){
        model.put("petitions", service.retrieveSearchPetitions(search));

        return "search-result-petition";
    }
}