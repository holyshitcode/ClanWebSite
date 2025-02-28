package demo.csecircle.controller.form;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ClanForm {

    private String clanName;
    private String leaderName;
    private String description;
    private String meetingTime;
    private String clanLocation;
    private String telNum;
    private MultipartFile image;
    private MultipartFile document;
    private Long id;

    public ClanForm() {
    }

    public ClanForm(String clanName, String leaderName, String description, String meetingTime, String clanLocation, String telNum) {
        this.clanName = clanName;
        this.leaderName = leaderName;
        this.description = description;
        this.meetingTime = meetingTime;
        this.clanLocation = clanLocation;
        this.telNum = telNum;
    }
}
