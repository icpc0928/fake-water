package com.alliance.game.fakeWater.domain.enums;

import com.alliance.game.fakeWater.domain.StatusSemanticization;

import java.util.*;

public enum LotteryType implements StatusSemanticization<Integer> {
	KLC(1, 3400),   //广东快乐十分 1
	SSC(2, 2900),   //重庆时时彩 2
	BJC(3, 2700),   //北京赛车b 3
	JSC(4, 4000),   //江苏快3 4
	XYC(5, 3900),   //广东幸运农场 5
	
	TJSC(6, 3000),  //天津时时彩 6
	XJSC(7, 3100),  //新疆时时彩 7
	JXSC(8, 3150),  //江西时时彩 8
	YNSC(9, 3200),  //云南时时彩 9
	SHSC(10, 3300),  //上海时时彩 10
	TJKC(11, 3500),  //天津快乐十分 11
	GXKC(12, 3700),  //广西快乐十分 12
	HNKC(13, 3600),  //湖南快乐十分 13
	AHK3(14, 4100),  //安徽快3 14
	GXK3(15, 4200),  //广西快3 15
	JLK3(16, 4300),  //吉林快3 16
	 //二期新增彩种
	XYFT(17, 2800),  //新幸运飞艇 17
    GD115(18, 5000), //广东11选5 18
	JX115(19, 5100), //江西11选5 19
	SD115(20, 5200), //山东11选5 20
	BJ115(21, 5300), //北京11选5 21
	SH115(22, 5400), //上海11选5 22
	LN115(23, 5500), //辽宁11选5 23
	HB115(24, 5600), //湖北11选5 24
	JS115(25, 5700), //江苏十一选5，(新增) 25
	AH115(26, 5800), //安徽十一选5，（新增）26
	
	BJKL8(27, 5900),   //北京快8 27
	AZKL8(28, 6300),   //澳洲快8 28
	HGKL8(29, 6400),   //韩国快8 29
	JNDKL8(30, 6500),  //加拿大快8 30
	JNDDKL8(31, 6600), //加拿大大西部快8 31
	SLFKKL8(32, 6000), //斯洛伐克 32
	METKL8(33, 6100),  //马耳他, 33
	TWBGKL8(34, 6200), //台湾宾果 34
	DJKL8(35, 6700),   //东京快乐８35
	
	FC3D(36, 6800),  //褔彩3D 36
	TC3D(37, 6900),  //排列三 37 (体彩3d)
	//二期后续新增彩种
	YNKC(38, 3800), //云南快乐十分 38
	BJKL8_PCEGG(39, 7000),   //北京快8PC蛋蛋 39
	AZKL8_PCEGG(40, 7100),   //澳洲快8PC蛋蛋  40
	HGKL8_PCEGG(41, 7200),   //韩国快8PC蛋蛋  41
	JNDKL8_PCEGG(42, 7300),  //加拿大快8PC蛋蛋  42
	JNDDKL8_PCEGG(43, 7400), //加拿大大西部快8PC蛋蛋  43
	SLFKKL8_PCEGG(44, 7500), //斯洛伐克PC蛋蛋  44
	METKL8_PCEGG(45, 7600),  //马耳他PC蛋蛋 , 45
	TWBGKL8_PCEGG(46, 7700), //台湾宾果PC蛋蛋  46
	DJKL8_PCEGG(47, 7800), //东京快乐8PC蛋蛋 47
	JSSC(48, 400),//极速赛车48
	JSCQ(49, 900), //极速时时彩49
	
	JSSC60(50, 500),//一分赛车50
	JSCQ60(51, 1000),//一分时时彩51
	KLC_90(52, 1500),//极速快乐十分52
	GD115_90(53, 1700),//极速十一选五53
	JSC_90(54, 1900),//极速快三54  
	BJKL8_90(55, 2100),//极速快乐8 55  
	FC3D_90(56, 2300),//极速3D 56   
	PCEGG_90(57, 2500),//极速PC蛋蛋 57
	LOTTO_90(58, 100),//极速六合彩58
	BJK3(59, 4400),//北京快3
	SHK3(60, 4500),//上海快3
	HBK3(61, 4600),//湖北快三
	HHBK3(62, 4700),//河北快三
	GSK3(63, 4800),//甘肃快三
	JXK3(64, 4900),//江西快三
	JSSC_180(65, 600),//3分赛车（3分PK10）
	JSCQ_180(66, 1100),//3分时时彩
	KLC_180(67, 1600),//3分快乐十分
	JSC_180(68, 2000),//3分快三   18
	GD115_180(69, 1800),//3分十一选五 
	FC3D_180(70, 2400),//3分3D  22
	BJKL8_180(71, 2200),//3分快乐8  
	PCEGG_180(72, 2600),//3分PC蛋蛋	
	JSSC_300(73, 700),//5分赛车（5分PK10）	IG赛车
	JSCQ_300(74, 1200),//5分时时彩	IG时时彩
	LOTTO_300(75, 200),//5分极速六合 IG六合彩
	LOTTO_600(76, 300),//10分极速六合
	XYFT_300(77, 800),//ig飞艇
	HANOI_60(78, 1300),//河内一分彩
	HANOI_300(79, 1400),//河内五分彩
	XYFTOLD(80,801),//幸运飞艇
	ANZAC_1200(81,802),//澳洲赛车pk10
	VENICE_1200(82,1401),//威尼斯时时彩
	MILAN_300(83,1601),//米兰快乐十分
	LIAN_1200(84,1602),//里昂快乐十分
	ROMAN_300(85,1801),//罗马11选5
	PARIS_1200(86,1802),//巴黎11选5
	CANNES_300(87,2201),//戛纳快乐8
	BERLIN_1200(88,2202),//柏林快乐8
	MADRID_300(89,2001),//马德里快3
	MOSCOW_1200(90,2002),//莫斯科快3
	GENEVA_300(91,2401),//日内瓦3D
	VIENNA_1200(92,2402),//维也纳3D
	CANNES_PCEGG(93,2601),//戛纳PC蛋蛋300
	BERLIN_PCEGG(94,2602),//柏林PC蛋蛋1200
	JSC_30(95,2003),//秒速快三
	JSC_60(96,2004), //一分快三
	LOTTO_MACAU(97,400), //澳门六合
	AUS_10(98,2801), //澳洲幸運10 20220504
	JSSC_168(99,2802), //168极速赛车 20220830
	JSFT_168(100,2803), //168极速飞艇 20220830
	JSCQ_168(101,1402), //168极速时时彩 20220830
	KENO_60(102, 8000), 		//一分基諾 20230314				102
	KENO_90(103, 8001),			//極速基諾 20230314			103
	KENO_180(104,8002),			//三分基諾 20230314			104
	KENO_300(105, 8003),		//KG基諾(五分) 20230314			105
	KENO_CAN_300(106, 8004),	//加拿大基諾(五分) 20230314		106
	KENO_SVK_300(107, 8005),	//斯洛伐克基諾(五分) 20230314		107
	FD_300(108, 9000),			//KG_4D		20230414		108
	FD_SGP(109, 9001),			//新加坡_4D	20230414		109 (官方彩種)
	FD_60(110, 9002),			//一分4D		20230906		110
	FD_90(111, 9003),			//極速4D		20230906		111
	FD_180(112, 9004),			//三分4D		20230906		112
	FD_600(113, 9005),			//十分4D		20230906		113
	FD_DAMA(114, 9006),			//大馬彩		20231011		114
	FD_TOTO(115, 9007),			//多多萬字	20231011		115
	FD_MAGNUM(116, 9008),		//萬能4D		20231011		116
	;
	
	public static void sort(List<LotteryType> lotteryTypes){
		lotteryTypes.sort(Comparator.comparingInt(type -> type.sort));
	}
	
	public static int enabledSize(){
		return LotteryType.values().length-DISABLED_TYPES.size();
	}
	
	public static Set<LotteryType> getGroups(){
		return EnumSet.copyOf(GROUP_TYPES_MAP.keySet());
	}
	
	public static LotteryType getLotteryType(int gameId){
		for(LotteryType lotteryType:LotteryType.values()){
			if(lotteryType.gameId==gameId){
				return lotteryType;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public LotteryType getGroupType(){
		for(Map.Entry<LotteryType, EnumSet<LotteryType>> entry:GROUP_TYPES_MAP.entrySet()){
			if(entry.getValue().contains(this)){
				return entry.getKey();
			}
		}
		throw new NoSuchFieldError("the lotteryType can not match group type.type="+this.toString());
	}
	
	public Set<LotteryType> getCurrentGroups(){
		for(Map.Entry<LotteryType, EnumSet<LotteryType>> entry:GROUP_TYPES_MAP.entrySet()){
			if(entry.getValue().contains(this)){
				return entry.getValue().clone();
			}
		}
		throw new NoSuchFieldError("the lotteryType can not match group type.type="+this.toString());
	}
	
	public boolean isEnabled(){
		return !DISABLED_TYPES.contains(this);
	}
	
	public boolean isDisabled(){
		return DISABLED_TYPES.contains(this);
	}
	
	@Override
	public Integer getStatus() {
		return this.gameId;
	}

	public int getGameId(){
		return this.gameId;
	}
	
	private transient int gameId;
	private transient int sort;
	
	private LotteryType(int gameId, int sort){
		this.gameId=gameId;
		this.sort=sort;
	}
	
	public boolean isNeedNoticeGame(){
		return NEED_NOTICE_TYPES.contains(this);
	}
	
	private transient final static EnumSet<LotteryType> NEED_NOTICE_TYPES=EnumSet.of(FC3D,TC3D);
	
	private transient final static Map<LotteryType, EnumSet<LotteryType>> GROUP_TYPES_MAP=new EnumMap<>(LotteryType.class);

	/**
	 * 關閉清單
	 */
	private transient final static EnumSet<LotteryType> DISABLED_TYPES=EnumSet.of(JXSC,JLK3,AZKL8,HGKL8,JNDDKL8,DJKL8,AZKL8_PCEGG,
			HGKL8_PCEGG,JNDDKL8_PCEGG,DJKL8_PCEGG,TJSC,TJKC,METKL8,METKL8_PCEGG,JXK3,AH115,JNDKL8,JNDKL8_PCEGG,XJSC,GXK3,JS115,SHSC,YNSC,YNKC,BJK3,BJ115,SH115);
	static{
		GROUP_TYPES_MAP.put(LotteryType.KLC, EnumSet.of(KLC, XYC, TJKC, HNKC, YNKC, KLC_90, KLC_180,MILAN_300,LIAN_1200));
		
		GROUP_TYPES_MAP.put(LotteryType.SSC, EnumSet.of(SSC, TJSC, XJSC, JXSC, YNSC,JSCQ, JSCQ60, JSCQ_180, JSCQ_300,HANOI_60,HANOI_300,VENICE_1200,JSCQ_168));
		
		GROUP_TYPES_MAP.put(LotteryType.BJC, EnumSet.of(BJC, XYFT, JSSC, JSSC60, JSSC_180, JSSC_300, XYFT_300,XYFTOLD,ANZAC_1200,AUS_10,JSSC_168,JSFT_168));
		
		GROUP_TYPES_MAP.put(LotteryType.JSC, EnumSet.of(JSC, AHK3, GXK3, JLK3, JSC_90, BJK3, SHK3, HBK3, HHBK3, GSK3, JXK3, JSC_180,MADRID_300,MOSCOW_1200,JSC_30,JSC_60));
		
		GROUP_TYPES_MAP.put(LotteryType.GXKC, EnumSet.of(GXKC));
		
		/*GROUP_TYPES_MAP.put(LotteryType.SHSC, EnumSet.of(SHSC));*/
		
		GROUP_TYPES_MAP.put(LotteryType.GD115, EnumSet.of(GD115,JX115,SD115,BJ115,SH115,LN115,HB115,JS115,AH115,GD115_90,GD115_180,ROMAN_300,PARIS_1200));
		
		GROUP_TYPES_MAP.put(LotteryType.BJKL8, EnumSet.of(BJKL8,AZKL8,HGKL8,JNDKL8,JNDDKL8,SLFKKL8,METKL8,TWBGKL8,DJKL8,BJKL8_90,BJKL8_180,CANNES_300,BERLIN_1200));
		
		GROUP_TYPES_MAP.put(LotteryType.BJKL8_PCEGG, EnumSet.of(BJKL8_PCEGG,AZKL8_PCEGG,HGKL8_PCEGG,JNDKL8_PCEGG,JNDDKL8_PCEGG,SLFKKL8_PCEGG,METKL8_PCEGG,TWBGKL8_PCEGG,DJKL8_PCEGG,PCEGG_90,PCEGG_180,CANNES_PCEGG,BERLIN_PCEGG));
		
		GROUP_TYPES_MAP.put(LotteryType.FC3D, EnumSet.of(FC3D,TC3D,FC3D_90,FC3D_180,GENEVA_300,VIENNA_1200));
		
		GROUP_TYPES_MAP.put(LotteryType.LOTTO_90, EnumSet.of(LOTTO_90,LOTTO_300,LOTTO_600,LOTTO_MACAU));

		GROUP_TYPES_MAP.put(LotteryType.KENO_60, EnumSet.of(KENO_60,KENO_180,KENO_90,KENO_300,KENO_CAN_300,KENO_SVK_300));

		for(LotteryType disabledType:DISABLED_TYPES){
			for(EnumSet<LotteryType> types:GROUP_TYPES_MAP.values()){
				if(types.contains(disabledType)){
					types.remove(disabledType);
				}
			}
		}
	}
	
	public enum LotteryNatureType implements StatusSemanticization<Integer>{
		
		SELF_OPEN(0),
		
		NO_SELF_OPEN(1)
		
		;
		private LotteryNatureType(Integer gameNatureId){}
		
		
		private transient Integer gameNatureId;
		
		@Override
		public Integer getStatus() {
			// TODO Auto-generated method stub
			return gameNatureId;
		}
		
		public Set<LotteryType> getCurrentGroups(){
			for (Map.Entry<LotteryNatureType, EnumSet<LotteryType>> entry : LOTTERY_ANTURE.entrySet()) {
				if (entry.getKey().equals(this)) {
					return entry.getValue().clone();
				}
			}
			throw new NoSuchFieldError("the lotteryType can not match group type.type="+this.toString());
		}
		
		
		private transient final static Map<LotteryNatureType, EnumSet<LotteryType>> LOTTERY_ANTURE = new EnumMap<>(LotteryNatureType.class);
		static{                                         
			LOTTERY_ANTURE.put(SELF_OPEN, EnumSet.of(JNDKL8_PCEGG,LOTTO_90,LOTTO_300,LOTTO_600,JSSC,JSSC60,JSSC_180,JSSC_300,
					XYFT_300,JSCQ,JSCQ60,JSCQ_180,JSCQ_300,KLC_90,KLC_180,GD115_90,GD115_180,JSC_90,JSC_180,BJKL8_90,BJKL8_180,
					FC3D_90,FC3D_180,PCEGG_90,PCEGG_180,HANOI_60,HANOI_300,XYFTOLD,ANZAC_1200,VENICE_1200,MILAN_300,LIAN_1200,
					ROMAN_300,PARIS_1200,CANNES_300,BERLIN_1200,MADRID_300,MOSCOW_1200,GENEVA_300,VIENNA_1200,CANNES_PCEGG,
					BERLIN_PCEGG,JSC_30,JSC_60));
			LOTTERY_ANTURE.put(NO_SELF_OPEN, EnumSet.of(BJC,XYFT,SSC,YNSC,KLC,HNKC,GXKC,YNKC,XYC,JSC,AHK3,BJK3,SHK3,HBK3,HHBK3,
					GSK3,GD115,JX115,SD115,BJ115,SH115,LN115,HB115,BJKL8,SLFKKL8,TWBGKL8,FC3D,TC3D,BJKL8_PCEGG,SLFKKL8_PCEGG,
					TWBGKL8_PCEGG,LOTTO_MACAU,AUS_10,JSSC_168,JSFT_168,JSCQ_168));
			for (LotteryType obtainedType : DISABLED_TYPES) {
				for (EnumSet<LotteryType> types : LOTTERY_ANTURE.values()) {
					if (types.contains(obtainedType)) {
						types.remove(obtainedType);
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
//		LotteryType value = LotteryType.values()[98-1];
//		System.out.println(value);
		TreeMap<Integer, LotteryType> sortMap = new TreeMap();
		for(LotteryType key : LotteryType.values()){
			sortMap.put(key.sort, key);
		}

		for(Integer key : sortMap.keySet()){
			System.out.println(key + " : " +sortMap.get(key));
		}
	}

	public static LotteryType getLotteryType(String lotteryTypeStr){
		for(LotteryType l : LotteryType.values()){
			if(l.name().equals(lotteryTypeStr)){
				return l;
			}
		}
		return null;
	}
	
}