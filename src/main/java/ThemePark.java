import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    public ArrayList<IReviewed> parkFeatures;

    public ThemePark(ArrayList<IReviewed> parkFeatures) {
        this.parkFeatures = parkFeatures;
    }

//    public ArrayList<IReviewed> getAllReviewed(){
//        for (IReviewed reviewed: parkFeatures)
//            return this.parkFeatures.getRating();
//    }
}
