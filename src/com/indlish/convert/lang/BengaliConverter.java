package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class BengaliConverter implements LanguageConverter
{

	private Map<String, String> unicodeMap = null;
	public static final int langBegin	= Integer.parseInt("0980", 16);
	public static final int langEnd	= Integer.parseInt("09FF", 16);
	
	private int consBegin	= Integer.parseInt("0995", 16);
	private int consEnd		= Integer.parseInt("09B9", 16);
	
	private int vowelBegin	= Integer.parseInt("0985", 16);
	private int vowelEnd	= Integer.parseInt("0994", 16);
	
	private int antraBegin	= Integer.parseInt("09BC", 16);
	private int antraEnd	= Integer.parseInt("09D7", 16);
	
	
	// VA letter of the language, V or W can replace this char
	private int vaCode 		= Integer.parseInt("0935", 16);
	
	// Sa or Sha used in word Shankar
	private int shankarSCode= Integer.parseInt("0936", 16);
	
	// Half char is used for ending the word abruptly, differene in SAM AND SAMA
	private int halfChar	=  Integer.parseInt("094D", 16);
	
	public BengaliConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();	
		
		unicodeMap.put("0981", "n");   // ঁ
		unicodeMap.put("0982", "n");   // ং
		unicodeMap.put("0983", "ah");   // ঃ
		unicodeMap.put("0985", "a");   // অ
		unicodeMap.put("0986", "aa");   // আ
		unicodeMap.put("0987", "i");   // ই
		unicodeMap.put("0988", "Ee");   // ঈ
		unicodeMap.put("0989", "");   // উ
		unicodeMap.put("098A", "");   // ঊ
		unicodeMap.put("098B", "");   // ঋ
		unicodeMap.put("098C", "");   // ঌ
		unicodeMap.put("098F", "");   // এ
		unicodeMap.put("0990", "");   // ঐ
		unicodeMap.put("0993", "");   // ও
		unicodeMap.put("0994", "");   // ঔ
		
		unicodeMap.put("0995", "k");   // ক
		unicodeMap.put("0996", "kh");   // খ
		unicodeMap.put("0997", "g");   // গ
		unicodeMap.put("0998", "gh");   // ঘ
		unicodeMap.put("0999", "");   // ঙ
		unicodeMap.put("099A", "");   // চ
		unicodeMap.put("099B", "");   // ছ
		unicodeMap.put("099C", "");   // জ
		unicodeMap.put("099D", "");   // ঝ
		unicodeMap.put("099E", "");   // ঞ
		unicodeMap.put("099F", "");   // ট
		unicodeMap.put("09A0", "");   // ঠ
		unicodeMap.put("09A1", "");   // ড
		unicodeMap.put("09A2", "");   // ঢ
		unicodeMap.put("09A3", "");   // ণ
		unicodeMap.put("09A4", "");   // ত
		unicodeMap.put("09A5", "");   // থ
		unicodeMap.put("09A6", "");   // দ
		unicodeMap.put("09A7", "");   // ধ
		unicodeMap.put("09A8", "");   // ন
		unicodeMap.put("09AA", "");   // প
		unicodeMap.put("09AB", "");   // ফ
		unicodeMap.put("09AC", "");   // ব
		unicodeMap.put("09AD", "");   // ভ
		unicodeMap.put("09AE", "");   // ম
		unicodeMap.put("09AF", "");   // য
		unicodeMap.put("09B0", "");   // র
		unicodeMap.put("09B2", "");   // ল
		unicodeMap.put("09B6", "");   // শ
		unicodeMap.put("09B7", "");   // ষ
		unicodeMap.put("09B8", "");   // স
		unicodeMap.put("09B9", "");   // হ
		
		unicodeMap.put("09BC", "");   // ়
		unicodeMap.put("09BD", "");   // ঽ
		unicodeMap.put("09BE", "");   // া
		unicodeMap.put("09BF", "");   // ি
		unicodeMap.put("09C0", "");   // ী
		unicodeMap.put("09C1", "");   // ু
		unicodeMap.put("09C2", "");   // ূ
		unicodeMap.put("09C3", "");   // ৃ
		unicodeMap.put("09C4", "");   // ৄ
		unicodeMap.put("09C7", "");   // ে
		unicodeMap.put("09C8", "");   // ৈ
		unicodeMap.put("09CB", "");   // ো
		unicodeMap.put("09CC", "");   // ৌ
		unicodeMap.put("09CD", "");   // ্
		unicodeMap.put("09CE", "");   // ৎ
		unicodeMap.put("09D7", "");   // ৗ
		unicodeMap.put("09DC", "");   // ড়
		unicodeMap.put("09DD", "");   // ঢ়
		unicodeMap.put("09DF", "");   // য়
		unicodeMap.put("09E0", "");   // ৠ
		unicodeMap.put("09E1", "");   // ৡ
		unicodeMap.put("09E2", "");   // ৢ
		unicodeMap.put("09E3", "");   // ৣ
		unicodeMap.put("09E6", "");   // ০
		unicodeMap.put("09E7", "");   // ১
		unicodeMap.put("09E8", "");   // ২
		unicodeMap.put("09E9", "");   // ৩
		unicodeMap.put("09EA", "");   // ৪
		unicodeMap.put("09EB", "");   // ৫
		unicodeMap.put("09EC", "");   // ৬
		unicodeMap.put("09ED", "");   // ৭
		unicodeMap.put("09EE", "");   // ৮
		unicodeMap.put("09EF", "");   // ৯
		unicodeMap.put("09F0", "");   // ৰ
		unicodeMap.put("09F1", "");   // ৱ
		unicodeMap.put("09F2", "");   // ৲
		unicodeMap.put("09F3", "");   // ৳
		unicodeMap.put("09F4", "");   // ৴
		unicodeMap.put("09F5", "");   // ৵
		unicodeMap.put("09F6", "");   // ৶
		unicodeMap.put("09F7", "");   // ৷
		unicodeMap.put("09F8", "");   // ৸
		unicodeMap.put("09F9", "");   // ৹
		unicodeMap.put("09FA", "");   // ৺

	}

	@Override
	public String convert(String data)
	{
		String englishRes = "";
		int strLen =  data.length();
		for (int i = 0; i < strLen; i++) {
			int code = (int)data.charAt(i);
			if (code >= langBegin && code <= langEnd) {
				int nextCode = 0;
				int prevCode = 0;
				
				if (i > 0) {
					prevCode = (int)data.charAt(i-1);
				}
				
				if (i < strLen-1) {
					nextCode = (int)data.charAt(i+1);
				}
				
				String unicode = String.format("%04x", code);
				if (unicode.length() == 3) {
					unicode = "0" + unicode;
				}
				unicode = unicode.toUpperCase();
				
				String letter = unicodeMap.get(unicode) != null ? unicodeMap.get(unicode) : data.charAt(i) + "";
				
				// if the code is consonant
				if (code >= consBegin && code <=consEnd) {
					
					//Handling Va case, using v and w
					if (code == vaCode && prevCode == halfChar) {
						letter = "w";
					}
					
					//Handling shankar sa
					if (code == shankarSCode && nextCode == halfChar) {
						letter = "s";
					}
					
					// If the next code is not a consonant, adding extra a to the char
					if (nextCode >= consBegin && nextCode <=consEnd) {
							letter = letter + "a";
					 }
				}
				englishRes += letter;
			} else {
				englishRes += data.charAt(i);
			}
		}
		if (englishRes != null && englishRes.trim().length() > 0) {
			englishRes = englishRes.toLowerCase();
		}
		return englishRes;
	}
	
	public static void main(String args[]) {
		BengaliConverter converter = new BengaliConverter();
		String source = "অন্যায়ের প্রতিকার কখনও অন্যায়ের মাধ্যমে হয়নি, পৃথিবীর ইতিহাস তার সাক্ষী। বিলোনিয়ায় লেনিন মূর্তি ভাঙার ";
		String result = converter.convert(source);
		System.out.println(source);
		System.out.println(result);
	}

}
