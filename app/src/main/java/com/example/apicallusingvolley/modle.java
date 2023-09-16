package com.example.apicallusingvolley;

import java.util.List;

public class modle {
  String  Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<address> getPostOffice() {
        return PostOffice;
    }

    public void setPostOffice(List<address> postOffice) {
        PostOffice = postOffice;
    }

    String Status;

    public modle(String message, String status, List<address> postOffice) {
        Message = message;
        Status = status;
        PostOffice = postOffice;
    }

    List<address>PostOffice;
    public  modle(){

    }


}
