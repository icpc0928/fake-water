package com.alliance.game.fakeWater.app.dto;

import com.alliance.game.fakeWater.domain.enums.LotteryType;

import java.util.List;

/**
 *
 * @param lotteryType 遊戲類型
 * @param gameNum 期號
 * @param result 結果陣列
 * @param drawingTime ??
 */
public record FdSgpResultDto(LotteryType lotteryType, String gameNum, List<Integer> result, long drawingTime){

}
