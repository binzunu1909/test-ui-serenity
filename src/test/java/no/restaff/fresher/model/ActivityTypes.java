package no.restaff.fresher.model;

import lombok.Getter;
import lombok.Setter;
import net.serenitybdd.junit.finder.FinderType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static no.restaff.fresher.ui.NewActivityPopUp.*;

@Getter
@Setter
public class ActivityTypes {
    private String activityTypeName;

    public ActivityTypes() {
        this.activityTypeName = null;
    }
//    public ActivityTypes(String activityTypeName) {
//        this.activityTypeName = activityTypeName;
//    }

//    public String getRandomActivityTypeForText() {
//        ActivityTypes activityTypes1 = new ActivityTypes("POINT IN TIME");
//        ActivityTypes activityTypes2 = new ActivityTypes("START");
//        ActivityTypes activityTypes3 = new ActivityTypes("END");
//        ActivityTypes activityTypes4 = new ActivityTypes("DURATION");
//        List<ActivityTypes> activityTypesList = new ArrayList<>();
//        activityTypesList.add(activityTypes1);
//        activityTypesList.add(activityTypes2);
//        activityTypesList.add(activityTypes3);
//        activityTypesList.add(activityTypes4);
//
//        Random random = new Random();
//        int randomIndex = random.nextInt(activityTypesList.size());
//
//        String randomActivityType = activityTypesList.get(randomIndex).getActivityTypeName();
//        return randomActivityType;
//    }

    public String getRandomActivityTypeForXpath() {
        Random random = new Random();
        SELECTION_ITEM_FOR_POSITION_XPATH_LENGTH.
        Integer lengthActivityType = Integer.valueOf(SELECTION_ITEM_FOR_POSITION_XPATH_LENGTH);
        int randomActivityType = random.nextInt(lengthActivityType);

        return String.valueOf(randomActivityType);
    }

    public static void main(String[] args) {
        ActivityTypes activityType = new ActivityTypes();
        System.out.println(activityType.getRandomActivityTypeForXpath());
    }
}
