package annspetitions.annspetitions.service;

import java.util.ArrayList;
import java.util.List;
import annspetitions.annspetitions.model.Signatures;
import org.springframework.stereotype.Service;


@Service
public class SignatureService {
    private static ArrayList<Signatures> signatures = new ArrayList<Signatures>();
    private static int SignaturesCount = 3;

    static {
        signatures.add(new Signatures(1, 1, "John Smith", "JohnSmith@Petitions.com" ));
        signatures.add(new Signatures(2, 2, "Joe Bloggs", "JoeBloggs@Petitions.com"));
        signatures.add(new Signatures(3, 3 ,"Jane Burke", "JaneBurke@Petitions.com"));

    }

    public List<Signatures> retrieveSignatures(int id) {
        List<Signatures> filteredSignatures = new ArrayList<Signatures>();
        for (Signatures signatures : signatures) {
            if (signatures.getId() == id) {
                filteredSignatures.add(signatures);
            }
        }

        return filteredSignatures;
    }

    public void addSignature(int petitionId, String name, String email) {
        signatures.add(new Signatures(++SignaturesCount, petitionId, name, email ));
    }

}