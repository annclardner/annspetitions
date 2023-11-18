package annspetitions.annspetitions.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import annspetitions.annspetitions.model.Petitions;

@Service
public class PetitionService {
    private static ArrayList<Petitions> Petitions = new ArrayList<Petitions>();
    private static int PetitionsCount = 3;

    static {
        Petitions.add(new Petitions(1, "Petition 1"));
        Petitions.add(new Petitions(2, "Petition 2"));
        Petitions.add(new Petitions(3, "Petition 3"));

    }

    public List<Petitions> retrievePetitions() {
        List<Petitions> filteredPetitions = new ArrayList<Petitions>();
        for (Petitions petition : Petitions) {
            filteredPetitions.add(petition);
        }

        return filteredPetitions;
    }

    public List<Petitions> retrieveSearchPetitions(String petition) {
        List<Petitions> filteredSearchPetition = new ArrayList<Petitions>();
        for (Petitions petitions : Petitions) {
            if (petitions.getPetition().equals(petition)) {
                filteredSearchPetition.add(petitions);
            }

        }
        return filteredSearchPetition;
    }

    public void addPetition(String petition) {
        Petitions.add(new Petitions(++PetitionsCount, petition));
    }
}
