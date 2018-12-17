package com.zubiri.agenda;

public class Note {
	private String text = "none";
	
	public Note(String text) {
		this.text=text;
	}
	
	public void setText(String text) {
		this.text=text;
	}
	public String getText() {
		return this.text;
	}
}
