package pl.btbw.service;

@HumanSelector
public class HumanService implements AnimalService {

    public String getType() {
        return "My type is Human";
    }
}
