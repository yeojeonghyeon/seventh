package com.scci.beans;

public class TextEditor {
	// 생성자를 통해서 주입(depencency injection)
	private SpellChecker spellChecker;
	private String version;
	public TextEditor(SpellChecker spellChecker, String version) {
		this.spellChecker = spellChecker;
		this.version = version;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
