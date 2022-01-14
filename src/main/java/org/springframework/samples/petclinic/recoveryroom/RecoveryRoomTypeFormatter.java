package org.springframework.samples.petclinic.recoveryroom;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class RecoveryRoomTypeFormatter implements Formatter<RecoveryRoomType>{

    @Autowired
    RecoveryRoomService recoveryRoomService;

    @Override
    public String print(RecoveryRoomType object, Locale locale) {
        String sol= object.getName();
        return sol;
    }

    @Override
    public RecoveryRoomType parse(String text, Locale locale) throws ParseException {
        RecoveryRoomType recoveryRoomType= recoveryRoomService.getRecoveryRoomType(text);
        if(recoveryRoomType == null){
            throw new ParseException("Room type not found"+text, 0);
        } 
        return recoveryRoomType;
    }
    
}
