package com.alliance.game.fakeWater.domain;

import com.alliance.game.fakeWater.domain.enums.LotteryType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ManualTimer {

    private static final String path = System.getProperty("user.dir") + "/props/";

    private static final Logger logger = LoggerFactory.getLogger(ManualTimer.class);

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    /**
     *
     * @param targetTime 可能是目前時間
     * @return
     */
    public static long getGameSeq(LotteryType lotteryType, LocalDateTime targetTime){
       Properties prop = getPropByGame(lotteryType);
       if(prop == null) return 0L;
       return getGameSeqByProp(prop, targetTime);
    }
    /**
     * 依照遊戲及期號 取得對應的開獎時間
     * @param lotteryType
     * @param gameSeq
     * @return
     */
    public static LocalDateTime getOpenDate(LotteryType lotteryType, long gameSeq){
        var prop = getPropByGame(lotteryType);
        if(prop == null) return null;
        return getOpenTimeByProp(prop, gameSeq);
    }





    /**
     * 依照目前時間取得 最近的開獎時間
     * @param prop
     * @param targetTime 目前時間
     * @return 取得 targetTime 之前的最近的開獎期號
     */
    private static Long getGameSeqByProp(Properties prop, LocalDateTime targetTime) {
        Set<Long> gameSeqSet = new TreeSet<>(Collections.reverseOrder());
        for(Object key : prop.keySet()){
            String value = prop.getProperty((String) key);
            LocalDateTime valueDate = LocalDateTime.parse(value, formatter);
            if(targetTime.isAfter(valueDate)){
                gameSeqSet.add(Long.valueOf((String) key));
            }
        }
        return gameSeqSet.stream().findFirst().orElse(null);
    }


    private static LocalDateTime getOpenTimeByProp(Properties prop, Long gameSeq){
        if(prop.containsKey(gameSeq.toString())){
            String openTimeStr = prop.getProperty(gameSeq.toString());
            return LocalDateTime.parse(openTimeStr, formatter);
        }
        return null;
    }


    public static Properties getPropByGame(LotteryType lotteryType){
        String propPath = getPath(lotteryType.name());
        if(!checkFile(propPath)) return null;
        try{
            InputStream inputStream = new FileInputStream(propPath);
            Properties prop = new Properties();
            prop.load(inputStream);
            return prop;
        }catch (Exception e){
            logger.error("FIS Exc, e:", e);
        }
        return null;
    }
    private static String getPath(String lotteryType){
        return path + lotteryType + ".properties";
    }
    private static boolean checkFile(String path){
        File f = new File(path);
        boolean isC = false;
        if(!f.exists()){
            try{
                isC = f.createNewFile();
            }catch (Exception e){
                logger.error("create file exc: ", e);
            }
        }else{
            isC = true;
        }
        return isC;
    }
}
