package com.excelr.model;

public class MusicSystem {
	private String msMfgName;
	private String msModelName;
	
	public MusicSystem() {}
	public MusicSystem(String msMfgName, String msModelName) {
		this.msMfgName = msMfgName;
		this.msModelName = msModelName;
	}
	public String getMsMfgName() {
		return msMfgName;
	}
	public void setMsMfgName(String msMfgName) {
		this.msMfgName = msMfgName;
	}
	public String getMsModelName() {
		return msModelName;
	}
	public void setMsModelName(String msModelName) {
		this.msModelName = msModelName;
	}
	@Override
	public String toString() {
		return "MusicSystem [msMfgName=" + msMfgName + ", msModelName=" + msModelName + "]";
	}
	
	
}
