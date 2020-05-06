package selfishtalk.domain.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Voice implements Serializable {

    private static final long serialVersionUID = 1L;

    private String VoiceId;

    private String bodyText;

    private Calendar insertDate;

    private Calendar updateDate;

    public String getVoiceId() {
        return VoiceId;
    }

    public void setVoiceId(String voiceId) {
        VoiceId = voiceId;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public Calendar getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Calendar insertDate) {
        this.insertDate = insertDate;
    }

    public Calendar getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Calendar updateDate) {
        this.updateDate = updateDate;
    }

}
