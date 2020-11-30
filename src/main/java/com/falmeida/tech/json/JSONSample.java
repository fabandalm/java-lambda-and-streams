package com.falmeida.tech.json;

import java.util.Date;

public class JSONSample {


}

class FormatShort{

    String status = "OK";

    FormatShort(){

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class FormatFull{

    Date currentTime = new Date();

    String application = "OK";

    FormatFull(){}

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

}
