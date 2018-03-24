package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class MalayalamConverter implements LanguageConverter
{

	public static final int langBegin	= Integer.parseInt("0D00", 16);
	public static final int langEnd	= Integer.parseInt("0D7E", 16);
	
	private Map<String, String> unicodeMap = null;
	
	private int consBegin	= Integer.parseInt("0B95", 16);
	private int consEnd		= Integer.parseInt("0BB5", 16);
	
	private int vowelBegin	= Integer.parseInt("0B85", 16);
	private int vowelEnd	= Integer.parseInt("0B94", 16);
	
	private int anthraBegin	= Integer.parseInt("0BBE", 16);
	private int anthraEnd	= Integer.parseInt("0BCC", 16);
	
	private int vaCode 		= Integer.parseInt("0BB5", 16);
	private int shankarSCode= Integer.parseInt("0BB8", 16);
	
	private int halfChar 	= Integer.parseInt("0BCD", 16);
	
	public MalayalamConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0D00", "");   // ഀ
		unicodeMap.put("0D01", "");   // ഁ
		unicodeMap.put("0D02", "");   // ം
		unicodeMap.put("0D03", "");   // ഃ
		unicodeMap.put("0D04", "");   // ഄ
		unicodeMap.put("0D05", "");   // അ
		unicodeMap.put("0D06", "");   // ആ
		unicodeMap.put("0D07", "");   // ഇ
		unicodeMap.put("0D08", "");   // ഈ
		unicodeMap.put("0D09", "");   // ഉ
		unicodeMap.put("0D0A", "");   // ഊ
		unicodeMap.put("0D0B", "");   // ഋ
		unicodeMap.put("0D0C", "");   // ഌ
		unicodeMap.put("0D0D", "");   // ഍
		unicodeMap.put("0D0E", "");   // എ
		unicodeMap.put("0D0F", "");   // ഏ
		unicodeMap.put("0D10", "");   // ഐ
		unicodeMap.put("0D11", "");   // ഑
		unicodeMap.put("0D12", "");   // ഒ
		unicodeMap.put("0D13", "");   // ഓ
		unicodeMap.put("0D14", "");   // ഔ
		unicodeMap.put("0D15", "");   // ക
		unicodeMap.put("0D16", "");   // ഖ
		unicodeMap.put("0D17", "");   // ഗ
		unicodeMap.put("0D18", "");   // ഘ
		unicodeMap.put("0D19", "");   // ങ
		unicodeMap.put("0D1A", "");   // ച
		unicodeMap.put("0D1B", "");   // ഛ
		unicodeMap.put("0D1C", "");   // ജ
		unicodeMap.put("0D1D", "");   // ഝ
		unicodeMap.put("0D1E", "");   // ഞ
		unicodeMap.put("0D1F", "");   // ട
		unicodeMap.put("0D20", "");   // ഠ
		unicodeMap.put("0D21", "");   // ഡ
		unicodeMap.put("0D22", "");   // ഢ
		unicodeMap.put("0D23", "");   // ണ
		unicodeMap.put("0D24", "");   // ത
		unicodeMap.put("0D25", "");   // ഥ
		unicodeMap.put("0D26", "");   // ദ
		unicodeMap.put("0D27", "");   // ധ
		unicodeMap.put("0D28", "");   // ന
		unicodeMap.put("0D29", "");   // ഩ
		unicodeMap.put("0D2A", "");   // പ
		unicodeMap.put("0D2B", "");   // ഫ
		unicodeMap.put("0D2C", "");   // ബ
		unicodeMap.put("0D2D", "");   // ഭ
		unicodeMap.put("0D2E", "");   // മ
		unicodeMap.put("0D2F", "");   // യ
		unicodeMap.put("0D30", "");   // ര
		unicodeMap.put("0D31", "");   // റ
		unicodeMap.put("0D32", "");   // ല
		unicodeMap.put("0D33", "");   // ള
		unicodeMap.put("0D34", "");   // ഴ
		unicodeMap.put("0D35", "");   // വ
		unicodeMap.put("0D36", "");   // ശ
		unicodeMap.put("0D37", "");   // ഷ
		unicodeMap.put("0D38", "");   // സ
		unicodeMap.put("0D39", "");   // ഹ
		unicodeMap.put("0D3A", "");   // ഺ
		unicodeMap.put("0D3B", "");   // ഻
		unicodeMap.put("0D3C", "");   // ഼
		unicodeMap.put("0D3D", "");   // ഽ
		unicodeMap.put("0D3E", "");   // ാ
		unicodeMap.put("0D3F", "");   // ി
		unicodeMap.put("0D40", "");   // ീ
		unicodeMap.put("0D41", "");   // ു
		unicodeMap.put("0D42", "");   // ൂ
		unicodeMap.put("0D43", "");   // ൃ
		unicodeMap.put("0D44", "");   // ൄ
		unicodeMap.put("0D45", "");   // ൅
		unicodeMap.put("0D46", "");   // െ
		unicodeMap.put("0D47", "");   // േ
		unicodeMap.put("0D48", "");   // ൈ
		unicodeMap.put("0D49", "");   // ൉
		unicodeMap.put("0D4A", "");   // ൊ
		unicodeMap.put("0D4B", "");   // ോ
		unicodeMap.put("0D4C", "");   // ൌ
		unicodeMap.put("0D4D", "");   // ്
		unicodeMap.put("0D4E", "");   // ൎ
		unicodeMap.put("0D4F", "");   // ൏
		unicodeMap.put("0D50", "");   // ൐
		unicodeMap.put("0D51", "");   // ൑
		unicodeMap.put("0D52", "");   // ൒
		unicodeMap.put("0D53", "");   // ൓
		unicodeMap.put("0D54", "");   // ൔ
		unicodeMap.put("0D55", "");   // ൕ
		unicodeMap.put("0D56", "");   // ൖ
		unicodeMap.put("0D57", "");   // ൗ
		unicodeMap.put("0D58", "");   // ൘
		unicodeMap.put("0D59", "");   // ൙
		unicodeMap.put("0D5A", "");   // ൚
		unicodeMap.put("0D5B", "");   // ൛
		unicodeMap.put("0D5C", "");   // ൜
		unicodeMap.put("0D5D", "");   // ൝
		unicodeMap.put("0D5E", "");   // ൞
		unicodeMap.put("0D5F", "");   // ൟ
		unicodeMap.put("0D60", "");   // ൠ
		unicodeMap.put("0D61", "");   // ൡ
		unicodeMap.put("0D62", "");   // ൢ
		unicodeMap.put("0D63", "");   // ൣ
		unicodeMap.put("0D64", "");   // ൤
		unicodeMap.put("0D65", "");   // ൥
		unicodeMap.put("0D66", "");   // ൦
		unicodeMap.put("0D67", "");   // ൧
		unicodeMap.put("0D68", "");   // ൨
		unicodeMap.put("0D69", "");   // ൩
		unicodeMap.put("0D6A", "");   // ൪
		unicodeMap.put("0D6B", "");   // ൫
		unicodeMap.put("0D6C", "");   // ൬
		unicodeMap.put("0D6D", "");   // ൭
		unicodeMap.put("0D6E", "");   // ൮
		unicodeMap.put("0D6F", "");   // ൯
		unicodeMap.put("0D70", "");   // ൰
		unicodeMap.put("0D71", "");   // ൱
		unicodeMap.put("0D72", "");   // ൲
		unicodeMap.put("0D73", "");   // ൳
		unicodeMap.put("0D74", "");   // ൴
		unicodeMap.put("0D75", "");   // ൵
		unicodeMap.put("0D76", "");   // ൶
		unicodeMap.put("0D77", "");   // ൷
		unicodeMap.put("0D78", "");   // ൸
		unicodeMap.put("0D79", "");   // ൹
		unicodeMap.put("0D7A", "");   // ൺ
		unicodeMap.put("0D7B", "");   // ൻ
		unicodeMap.put("0D7C", "");   // ർ
		unicodeMap.put("0D7D", "");   // ൽ
		unicodeMap.put("0D7E", "");   // ൾ


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
				
				if (code >= consBegin && code <=consEnd) {
					//Handling Va case, using v and w
					if (code == vaCode && prevCode == halfChar) {
						letter = "w";
					}
					
					//Handling shankar sa
					if (code == shankarSCode && nextCode == halfChar) {
						letter = "s";
					}
					
					if (nextCode >= anthraBegin && nextCode <= anthraEnd) {
						
					} else if (nextCode >= vowelBegin && nextCode <= vowelEnd) {
							
					} else if (nextCode == halfChar) {
						letter = "i" + letter;
					} else {
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

}
