package com.alliance.game.fakeWater.app.service.impl;

import com.alliance.game.fakeWater.app.dto.LotteryResultDto;
import com.alliance.game.fakeWater.domain.ManualTimer;
import com.alliance.game.fakeWater.domain.Sha256;
import com.alliance.game.fakeWater.domain.Timer;
import com.alliance.game.fakeWater.domain.enums.LotteryType;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class LotteryResultService {

    //每次回傳的期數都給50期
    private final int defaultSeqNum = 50;
    //每次回傳的期數都給5期
    private final int defaultManualSeqNul = 5;


    public List<LotteryResultDto> getResultList(String lotteryType) {
        LotteryType lotteryType1 = LotteryType.getLotteryType(lotteryType);
        if(lotteryType1 == null) return null;
        return switch (lotteryType1){
            case KENO_60 -> getKenosResult(lotteryType1, 60);
            case KENO_90 -> getKenosResult(lotteryType1, 90);
            case KENO_180 -> getKenosResult(lotteryType1, 180);
            case KENO_300, KENO_CAN_300, KENO_SVK_300 -> getKenosResult(lotteryType1, 300);
            case FD_DAMA, FD_TOTO, FD_MAGNUM -> getFDDamaResult(lotteryType1);
            default -> null;
        };
    }

    private String resultListToStr(List<Integer> result){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.size(); i++){
            sb.append(result.get(i));
            if(i != result.size() - 1){
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private List<LotteryResultDto> getKenosResult(LotteryType lotteryType, long roundTime){
        List<LotteryResultDto> result = new ArrayList<>();

        LocalDateTime localDateTime = LocalDateTime.now();
        //取得當下期號
        long gameSeq = Timer.getGameSeq(roundTime, localDateTime);

        for(int i = 0; i < defaultSeqNum; i++){
            long nowGameSeq = gameSeq - i;
            String base = nowGameSeq + lotteryType.name();
            var set = Sha256.getResult(base, 20);
            var list = set.stream().toList();
            String openDate = Timer.getOpenDateString(roundTime, nowGameSeq);
            LotteryResultDto dto = new LotteryResultDto(String.valueOf(nowGameSeq),
                    openDate, resultListToStr(list), lotteryType.name(), String.valueOf(nowGameSeq));
            result.add(dto);
        }
        return result;
    }


    private List<LotteryResultDto> getFDDamaResult(LotteryType lotteryType){
        List<LotteryResultDto> result = new ArrayList<>();
        LocalDateTime localDateTime = LocalDateTime.now();
        //取得當下期號
        long gameSeq = ManualTimer.getGameSeq(lotteryType, localDateTime);

        for(int i = 0; i < defaultManualSeqNul; i++){
            long nowGameSeq = gameSeq - i;
            String base = nowGameSeq + lotteryType.name();
            var oneResult = Sha256.getResultCanRepeat(base, 4, 0, 9);
            var openDate = ManualTimer.getOpenDate(lotteryType, nowGameSeq);
            if(openDate == null) continue;
            LotteryResultDto dto = new LotteryResultDto(String.valueOf(nowGameSeq), openDate.toString(), resultListToStr(oneResult), lotteryType.name(), String.valueOf(nowGameSeq));
            result.add(dto);
        }
        return result;
    }

}
