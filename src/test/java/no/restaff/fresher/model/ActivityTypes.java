package no.restaff.fresher.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivityTypes {
    private String activityTypeName;

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

}
