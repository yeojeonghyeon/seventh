package com.scci.beans;

public class SpellChecker {
	private String language;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	// overloading
	public SpellChecker() {}
	public SpellChecker(String language) {
		this.language = language;
	}
	public boolean doCheck() {
		return true;
	}
}
