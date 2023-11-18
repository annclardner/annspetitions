package annspetitions.annspetitions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




@Controller


public class CreatePetitionController {

    @Autowired

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String CreatePetition() {

        return "create-petition";
    }
}