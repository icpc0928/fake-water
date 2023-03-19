package com.alliance.game.fakeWater.domain;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Timer {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        long l = getGameSeq(60, localDateTime);
        System.out.println(l);
        System.out.println(getOpenDate(60, l));

    }

    public static long getGameSeq(long roundTime, LocalDateTime targetTime) {
        var cal = LocalDateTime.of(2017, 1, 1, 0, 0, 0);
        var millisStart = cal.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        var targetTimeSec = targetTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        return ((targetTimeSec - millisStart) / (roundTime * 1000)) + 1;
    }

    public static LocalDateTime getOpenDate(long roundTime, long gameSeq){
        var cal = LocalDateTime.of(2017, 1, 1, 0, 0, 0);
        var millisStart = cal.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long resultSec = gameSeq - 1;
        resultSec = resultSec * (roundTime * 1000);
        resultSec = resultSec + millisStart;
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(resultSec), ZoneId.systemDefault());
    }

    public static String getOpenDateString(long roundTime, long gameSeq){
        var date = getOpenDate(roundTime, gameSeq);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return date.format(formatter);
    }
}
