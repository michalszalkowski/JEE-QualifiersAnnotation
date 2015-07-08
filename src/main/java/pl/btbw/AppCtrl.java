package pl.btbw;

import pl.btbw.service.AnimalService;
import pl.btbw.service.HumanSelector;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class AppCtrl {

    @Inject @HumanSelector
    private AnimalService animalServiceWithCustomAno;

    @Inject
    private AnimalService animalService1WithDefAno;

    @GET
    public String getString() {
        String returnMessage = "";
        returnMessage += "Animal Service type 1: " + animalServiceWithCustomAno.getType();
        returnMessage += "<br/>Animal Service type 2: " + animalService1WithDefAno.getType();
        return returnMessage;
    }

}
