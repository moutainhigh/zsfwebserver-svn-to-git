package com.database.model.bean;

public class TechnologyTreeBean {//科技树
	private int id;
	private int level;
	private int goodID;
	private String name;
	private int cate;//1宝石 2碎片 3图纸 4炮塔 5怪物 6材料 7奴隶 8城堡 9关 10道具 11称号 12礼品盒 13任务 14灵魂塔 15矿场 16科技塔 17科技树
	private String resourceName;//资源编号
	private int upgradeTime;//升级时间
	private int upgradeNeedCoin;//升级需金币
	private int upgradeNeedRock;//升级需石头
	private int upgradeNeedMetal;//升级需金属
	private int upgradeNeedCrystal;//升级需水晶
	private int upgradeNeedTecTowerLevel;//升级需科技塔等级
	private double effectPara;//效果值（提升的百分比）
	private String comment;//备注
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getGoodID() {
		return goodID;
	}
	public void setGoodID(int goodID) {
		this.goodID = goodID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCate() {
		return cate;
	}
	public void setCate(int cate) {
		this.cate = cate;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public int getUpgradeTime() {
		return upgradeTime;
	}
	public void setUpgradeTime(int upgradeTime) {
		this.upgradeTime = upgradeTime;
	}
	public int getUpgradeNeedCoin() {
		return upgradeNeedCoin;
	}
	public void setUpgradeNeedCoin(int upgradeNeedCoin) {
		this.upgradeNeedCoin = upgradeNeedCoin;
	}
	public int getUpgradeNeedRock() {
		return upgradeNeedRock;
	}
	public void setUpgradeNeedRock(int upgradeNeedRock) {
		this.upgradeNeedRock = upgradeNeedRock;
	}
	public int getUpgradeNeedMetal() {
		return upgradeNeedMetal;
	}
	public void setUpgradeNeedMetal(int upgradeNeedMetal) {
		this.upgradeNeedMetal = upgradeNeedMetal;
	}
	public int getUpgradeNeedCrystal() {
		return upgradeNeedCrystal;
	}
	public void setUpgradeNeedCrystal(int upgradeNeedCrystal) {
		this.upgradeNeedCrystal = upgradeNeedCrystal;
	}
	public int getUpgradeNeedTecTowerLevel() {
		return upgradeNeedTecTowerLevel;
	}
	public void setUpgradeNeedTecTowerLevel(int upgradeNeedTecTowerLevel) {
		this.upgradeNeedTecTowerLevel = upgradeNeedTecTowerLevel;
	}
	public double getEffectPara() {
		return effectPara;
	}
	public void setEffectPara(double effectPara) {
		this.effectPara = effectPara;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
