package selfishtalk.app.voice;

import java.io.Serializable;

public class VoiceForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private String bodyText;
    
    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }



}
