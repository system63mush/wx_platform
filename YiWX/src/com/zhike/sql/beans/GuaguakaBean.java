package com.zhike.sql.beans;

public class GuaguakaBean {

	public long id;//主键
	public long app_id;//app_id
	public String keywords;
	public String title;
	public String img;
	public String desc_service;
	public String starttime;
	public String endtime;
	public int total;
	public String one_prize;//一等奖名称
	public String two_prize;
	public String three_prize;
	public String four_prize;
	public String five_prize;
	public int one_number;//一等奖数量
	public int two_number;
	public int three_number;
	public int four_number;
	public int five_number;
	public String isdisplay;//是否显示数量
	public int probability;//中奖率
	public int totaltime;//抽奖总次数
	public int everydaytime;//每天抽奖次数
	public String password;
	public String explain_service;
	public int state;//活动状态
	
	public String iscontacttype;//是否开启联系种类
	public String contacttype;//联系种类
	public long openid;//用户唯一标识
	public int prize_count;//中奖用户数
	public int all_count;//参与用户数
	public int all_count_time;//参与总次数
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getApp_id() {
		return app_id;
	}
	public void setApp_id(long appId) {
		app_id = appId;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getDesc_service() {
		return desc_service;
	}
	public void setDesc_service(String descService) {
		desc_service = descService;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getOne_prize() {
		return one_prize;
	}
	public void setOne_prize(String onePrize) {
		one_prize = onePrize;
	}
	public String getTwo_prize() {
		return two_prize;
	}
	public void setTwo_prize(String twoPrize) {
		two_prize = twoPrize;
	}
	public String getThree_prize() {
		return three_prize;
	}
	public void setThree_prize(String threePrize) {
		three_prize = threePrize;
	}
	public String getFour_prize() {
		return four_prize;
	}
	public void setFour_prize(String fourPrize) {
		four_prize = fourPrize;
	}
	public String getFive_prize() {
		return five_prize;
	}
	public void setFive_prize(String fivePrize) {
		five_prize = fivePrize;
	}
	public int getOne_number() {
		return one_number;
	}
	public void setOne_number(int oneNumber) {
		one_number = oneNumber;
	}
	public int getTwo_number() {
		return two_number;
	}
	public void setTwo_number(int twoNumber) {
		two_number = twoNumber;
	}
	public int getThree_number() {
		return three_number;
	}
	public void setThree_number(int threeNumber) {
		three_number = threeNumber;
	}
	public int getFour_number() {
		return four_number;
	}
	public void setFour_number(int fourNumber) {
		four_number = fourNumber;
	}
	public int getFive_number() {
		return five_number;
	}
	public void setFive_number(int fiveNumber) {
		five_number = fiveNumber;
	}
	public int getProbability() {
		return probability;
	}
	public void setProbability(int probability) {
		this.probability = probability;
	}
	public int getTotaltime() {
		return totaltime;
	}
	public void setTotaltime(int totaltime) {
		this.totaltime = totaltime;
	}
	public int getEverydaytime() {
		return everydaytime;
	}
	public void setEverydaytime(int everydaytime) {
		this.everydaytime = everydaytime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getExplain_service() {
		return explain_service;
	}
	public void setExplain_service(String explainService) {
		explain_service = explainService;
	}
	
	public long getOpenid() {
		return openid;
	}
	public void setOpenid(long openid) {
		this.openid = openid;
	}
	public String getContacttype() {
		return contacttype;
	}
	public void setContacttype(String contacttype) {
		this.contacttype = contacttype;
	}
	public void setIsdisplay(String isdisplay) {
		this.isdisplay = isdisplay;
	}
	public String getIsdisplay() {
		return isdisplay;
	}
	public int getPrize_count() {
		return prize_count;
	}
	public void setPrize_count(int prizeCount) {
		prize_count = prizeCount;
	}
	public int getAll_count() {
		return all_count;
	}
	public void setAll_count(int allCount) {
		all_count = allCount;
	}
	public int getAll_count_time() {
		return all_count_time;
	}
	public void setAll_count_time(int allCountTime) {
		all_count_time = allCountTime;
	}
	public String getIscontacttype() {
		return iscontacttype;
	}
	public void setIscontacttype(String iscontacttype) {
		this.iscontacttype = iscontacttype;
	}
	
	public String zhuanpan_back;
	public String zhizhen_back;
	
	
	public String getZhuanpan_back() {
		return zhuanpan_back;
	}
	public void setZhuanpan_back(String zhuanpanBack) {
		zhuanpan_back = zhuanpanBack;
	}
	public String getZhizhen_back() {
		return zhizhen_back;
	}
	public void setZhizhen_back(String zhizhenBack) {
		zhizhen_back = zhizhenBack;
	}

	
	
	

}
