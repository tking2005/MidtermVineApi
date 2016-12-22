package nyc.c4q.tarynking.exam12122016;

import java.util.List;

/**
 * Created by tarynking on 12/21/16.
 */
public class AnimalModel {


    private Boolean success;

    private List<Animal> animals = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

}
