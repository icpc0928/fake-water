package com.alliance.game.fakeWater.adaptor;


import com.alliance.game.fakeWater.app.dto.LotteryResultDto;

import com.alliance.game.fakeWater.app.service.impl.LotteryResultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("fakeWater")
public class WebAdapter {


    private final Scheduler boundElastic;
//    private final QuickLoginStrategy quickLoginStrategy;

    private final LotteryResultService lotteryResultService;

    private final Scheduler hallBoundElastic;


    public WebAdapter(LotteryResultService lotteryResultService) {

        this.lotteryResultService = lotteryResultService;
        this.boundElastic = Schedulers.newBoundedElastic(10, 30, "live-api-login", 60);
        this.hallBoundElastic = Schedulers.newBoundedElastic(30, 5, "hall-login", 60);
    }


    private Mono<Void> doApiLogin(URI url, ServerHttpResponse response) {
        response.setStatusCode(HttpStatus.FOUND);
        response.getHeaders().setLocation(url);
        return response.setComplete();
    }



//    @PostMapping(value = "hall-login/{currency}",
//            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Mono<HallLoginRsp> loginByCurrency(ServerHttpResponse response, @PathVariable String currency) {
//        return Mono.just(response).publishOn(hallBoundElastic)
//                .map((a) -> quickLoginStrategy.loginHall(Currency.getCurrencyByName(currency)));
//    }

    @GetMapping(value = "{lotteryType}")
    public Mono<List<LotteryResultDto>> getLotteryResult(ServerHttpResponse response, @PathVariable String lotteryType){
        return Mono.just(response).publishOn(hallBoundElastic)
                .map((a) -> lotteryResultService.getResultList(lotteryType));
    }




    /**
     * 目前這些方法已經不用了 先保留著萬一以後用到
     * 防治瀏覽器和CDN快取 導致無法訪問服務api的解法方案
     * @return 一個ajax可快取的js, 用來打post method到本服務
     */
//    @GetMapping("getLoginUrl")
//    public Mono<String> startFetch() {
//        return Mono.just("<form id = \"autoConfirmFormId\" action=\"" + config.getExportUrl() + "\" method=\"post\"> " +
//                "<script type=\"text/javascript\">\n" +
//                "window.onload = function() {\n" +
//                "   document.forms[\"autoConfirmFormId\"].submit();\n" +
//                "}\n" +
//                "</script>");
//
//    }
//    @GetMapping("getSSCLoginUrl")
//    public Mono<String> startFetchSSC() {
//        return Mono.just("<form id = \"autoConfirmFormId\" action=\"" + config.getExportSSCUrl() + "\" method=\"post\"> " +
//                "<script type=\"text/javascript\">\n" +
//                "window.onload = function() {\n" +
//                "   document.forms[\"autoConfirmFormId\"].submit();\n" +
//                "}\n" +
//                "</script>");
//
//    }
//    @GetMapping("getLottoLoginUrl")
//    public Mono<String> startFetchLotto() {
//        return Mono.just("<form id = \"autoConfirmFormId\" action=\"" + config.getExportLottoUrl() + "\" method=\"post\"> " +
//                "<script type=\"text/javascript\">\n" +
//                "window.onload = function() {\n" +
//                "   document.forms[\"autoConfirmFormId\"].submit();\n" +
//                "}\n" +
//                "</script>");
//
//    }
//    //快速進入遊戲
//    @PostMapping("getLoginUrl")
//    public Mono<Void> getLoginUrl(ServerHttpResponse response) {
//        return Mono.just(response).publishOn(boundElastic)
//                .map((a) -> quickLoginService.getLoginUrl())
//                .flatMap((url) -> doApiLogin(url, response));
//    }
//
//    //快速進入遊戲
//    @PostMapping("getSSCLoginUrl")
//    public Mono<Void> getSSCLoginUrl(ServerHttpResponse response) {
//        return Mono.just(response).publishOn(boundElastic)
//                .map((a) -> quickLoginService.getSSCLoginUrl())
//                .flatMap((url) -> doApiLogin(url, response));
//    }
//    //快速進入遊戲
//    @PostMapping("getLottoLoginUrl")
//    public Mono<Void> getLottoLoginUrl(ServerHttpResponse response) {
//        return Mono.just(response).publishOn(boundElastic)
//                .map((a) -> quickLoginService.getLottoLoginUrl())
//                .flatMap((url) -> doApiLogin(url, response));
//    }

}
