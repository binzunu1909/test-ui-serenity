package no.restaff.fresher.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activity {
    private String activityName;
    private String activityCode;
    private String activityComment;
    private String customTitle;

    public Activity() {
    }
    public Activity(String activityName, String activityCode, String activityComment) {
        this.activityName = activityName;
        this.activityCode = activityCode;
        this.activityComment = activityComment;
    }

}
