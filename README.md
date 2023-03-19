# 提供免註冊即可進入遊戲試玩的服務

## git

* url = http://gitlab.muzixt.com/ig-wf/quick-login-web-url-for-demo-lottery.git

## Server提供兩種方式登入: 快速登入以及Post Api取得連結

* ~~快速登入: 302重定向直接進入遊戲頁面~~
* PostApi: 回傳遊戲網址，作為前端的呼叫方式

# KG 測試站:

## vm:

- kgwftest-loginapi
- consul ui
  * http://103.96.76.91:10139/ui/kg-uat/nodes

## 增加測試帳號, 調用這個class

- com.alliance.game.fakeWater.domain.service.NewYFUser

## 目前Post Api 的幣別有 CNY及IDR 可不帶此參數, 或帶錯參數都將預設為CNY

***

## KG正式環境

* 機器項目位置: kgwf-loginapi: /home/kg/quick-login/
* ~~快速登入-時時彩: http://kgsscapi.kg88s.com/fastLogin/getSSCLoginUrl~~
* ~~快速登入-六合彩: http://kgsscapi.kg88s.com/fastLogin/getLottoLoginUrl~~
* Post Api-時時彩: http://kgsscapi.kg88s.com/fastLogin/get-ssc-url/{幣別}
* Post Api-六合彩: http://kgsscapi.kg88s.com/fastLogin/get-lotto-url/{幣別}

* Post Api 成功回傳範例:

```json
  {
  "url": "http://kgxlwebapi.kg88s.com/HKLottoryWeb/lottoLogin.html?sessionId=e2022a5a-d0fa-4285-98e9-d6b0f0ceb69c&homeUrl=&type=0&gameUrl=1&webSites=KG"
}
```

* 幣別: CNY
    * hashCode: QuickLoginDL_4f9e17c1-53ba-4eed-a6e2
    * site_code: 7474
    * 玩家user_code: 74750000 ~ 74750599
* 幣別: IDR
    * hashCode: QuickLoginIDR_fff0bdf3-d18e-420e-bc6
    * site_code: 7476
    * 玩家user_code: 74760000 ~ 74760499

***

## KG試玩環境

* 機器項目位置: kgwftest-loginapi: /home/kg/quick-login/
* ~~快速登入-時時彩: http://kgsit-sscapi.kgtests.com/fastLogin/getSSCLoginUrl~~
* ~~快速登入-六合彩: http://kgsit-sscapi.kgtests.com/fastLogin/getLottoLoginUrl~~
* Post Api-時時彩: http://kgsit-sscapi.kgtests.com/fastLogin/get-ssc-url/{幣別}
* Post Api-六合彩: http://kgsit-sscapi.kgtests.com/fastLogin/get-lotto-url/{幣別}

* 幣別: CNY
    * hashCode: Quick_d0fc9f3f-398b-41f1-abf8-aa53b4
    * site_code: 7475
    * user_code: 74750000 ~ 74750499
* 幣別: IDR
    * hashCode: QuickLoginDLIDR_602d65c6-f6a3-45af-a
    * site_code: 7476
    * user_code: 74760000 ~ 74760499

