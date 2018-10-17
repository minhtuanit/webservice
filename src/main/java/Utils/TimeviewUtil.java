package Utils;

import java.util.Date;

public class TimeviewUtil {
    public static Date GetDateByTimeView(int timeview){
        if(timeview == 0){
            return new Date();
        }
        else if(timeview == 1){
            return new Date(new Date().getTime() - 604800000);
        }
        else if( timeview == 2 ){
            return new Date(new Date().getTime() - 2592000000L);
        }
        else{
            return new Date();
        }
    }
}
