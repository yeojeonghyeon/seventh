package com.scci.beans;

public class SpellCheckerClient {
	public static void main(String[] args) {
		SpellChecker checker = new SpellChecker("kor");
		TextEditor editor = new TextEditor(checker, "1.1");
		System.out.println(editor.getSpellChecker().getLanguage());
	}
}
