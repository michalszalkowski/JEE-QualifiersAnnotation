package pl.btbw.service;

import javax.enterprise.inject.Default;

@Default
public class DogService implements AnimalService {

    public String getType() {
        return "My type is Dog";
    }
}
