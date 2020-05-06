package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }



    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight() >= 1.45 && visitor.getAge() >= 12);
        return true;
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 2.0 )
           return  (this.defaultPrice() * 2);
        else
            return this.defaultPrice();
    }


}
