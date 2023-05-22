package no.restaff.fresher.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

@Getter
@Setter
public class Activity {
    private String activityName;
    private String activityCode;
    private String activityComment;
    private String customTitle;

    public Activity() {
        this.activityName = RandomStringUtils.randomAlphanumeric(10).toUpperCase();
        this.activityCode = RandomStringUtils.randomAlphanumeric(3).toUpperCase();
        this.activityComment = RandomStringUtils.randomAlphanumeric(10);
    }

}
