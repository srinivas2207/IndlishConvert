package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class GujaratiConverter implements LanguageConverter
{
	private Map<String, String> unicodeMap = null;
	public static final int langBegin	= Integer.parseInt("0A80", 16);
	public static final int langEnd		= Integer.parseInt("0AFE", 16);
	
	private int consBegin	= Integer.parseInt("0915", 16);
	private int consEnd		= Integer.parseInt("0939", 16);
	
	private int vowelBegin	= Integer.parseInt("0901", 16);
	private int vowelEnd	= Integer.parseInt("0914", 16);
	
	private int antraBegin	= Integer.parseInt("093C", 16);
	private int antraEnd	= Integer.parseInt("094D", 16);
	
	private int angCode 	= Integer.parseInt("0902", 16);
	
	private int vaCode 		= Integer.parseInt("0935", 16);
	private int shankarSCode= Integer.parseInt("0936", 16);
	
	private int halfChar	=  Integer.parseInt("094D", 16);
	
	public GujaratiConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0A81", "");   // ઁ
		unicodeMap.put("0A82", "");   // ં
		unicodeMap.put("0A83", "");   // ઃ
		unicodeMap.put("0A85", "");   // અ
		unicodeMap.put("0A86", "");   // આ
		unicodeMap.put("0A87", "");   // ઇ
		unicodeMap.put("0A88", "");   // ઈ
		unicodeMap.put("0A89", "");   // ઉ
		unicodeMap.put("0A8A", "");   // ઊ
		unicodeMap.put("0A8B", "");   // ઋ
		unicodeMap.put("0A8C", "");   // ઌ
		unicodeMap.put("0A8D", "");   // ઍ
		unicodeMap.put("0A8F", "");   // એ
		unicodeMap.put("0A90", "");   // ઐ
		unicodeMap.put("0A91", "");   // ઑ
		unicodeMap.put("0A93", "");   // ઓ
		unicodeMap.put("0A94", "");   // ઔ
		unicodeMap.put("0A95", "");   // ક
		unicodeMap.put("0A96", "");   // ખ
		unicodeMap.put("0A97", "");   // ગ
		unicodeMap.put("0A98", "");   // ઘ
		unicodeMap.put("0A99", "");   // ઙ
		unicodeMap.put("0A9A", "");   // ચ
		unicodeMap.put("0A9B", "");   // છ
		unicodeMap.put("0A9C", "");   // જ
		unicodeMap.put("0A9D", "");   // ઝ
		unicodeMap.put("0A9E", "");   // ઞ
		unicodeMap.put("0A9F", "");   // ટ
		unicodeMap.put("0AA0", "");   // ઠ
		unicodeMap.put("0AA1", "");   // ડ
		unicodeMap.put("0AA2", "");   // ઢ
		unicodeMap.put("0AA3", "");   // ણ
		unicodeMap.put("0AA4", "");   // ત
		unicodeMap.put("0AA5", "");   // થ
		unicodeMap.put("0AA6", "");   // દ
		unicodeMap.put("0AA7", "");   // ધ
		unicodeMap.put("0AA8", "");   // ન
		unicodeMap.put("0AAA", "");   // પ
		unicodeMap.put("0AAB", "");   // ફ
		unicodeMap.put("0AAC", "");   // બ
		unicodeMap.put("0AAD", "");   // ભ
		unicodeMap.put("0AAE", "");   // મ
		unicodeMap.put("0AAF", "");   // ય
		unicodeMap.put("0AB0", "");   // ર
		unicodeMap.put("0AB2", "");   // લ
		unicodeMap.put("0AB3", "");   // ળ
		unicodeMap.put("0AB5", "");   // વ
		unicodeMap.put("0AB6", "");   // શ
		unicodeMap.put("0AB7", "");   // ષ
		unicodeMap.put("0AB8", "");   // સ
		unicodeMap.put("0AB9", "");   // હ
		unicodeMap.put("0ABC", "");   // ઼
		unicodeMap.put("0ABD", "");   // ઽ
		unicodeMap.put("0ABE", "");   // ા
		unicodeMap.put("0ABF", "");   // િ
		unicodeMap.put("0AC0", "");   // ી
		unicodeMap.put("0AC1", "");   // ુ
		unicodeMap.put("0AC2", "");   // ૂ
		unicodeMap.put("0AC3", "");   // ૃ
		unicodeMap.put("0AC4", "");   // ૄ
		unicodeMap.put("0AC5", "");   // ૅ
		unicodeMap.put("0AC7", "");   // ે
		unicodeMap.put("0AC8", "");   // ૈ
		unicodeMap.put("0AC9", "");   // ૉ
		unicodeMap.put("0ACB", "");   // ો
		unicodeMap.put("0ACC", "");   // ૌ
		unicodeMap.put("0ACD", "");   // ્
		unicodeMap.put("0AD0", "");   // ૐ
		unicodeMap.put("0AE0", "");   // ૠ
		unicodeMap.put("0AE1", "");   // ૡ
		unicodeMap.put("0AE2", "");   // ૢ
		unicodeMap.put("0AE3", "");   // ૣ
		unicodeMap.put("0AE6", "");   // ૦
		unicodeMap.put("0AE7", "");   // ૧
		unicodeMap.put("0AE8", "");   // ૨
		unicodeMap.put("0AE9", "");   // ૩
		unicodeMap.put("0AEA", "");   // ૪
		unicodeMap.put("0AEB", "");   // ૫
		unicodeMap.put("0AEC", "");   // ૬
		unicodeMap.put("0AED", "");   // ૭
		unicodeMap.put("0AEE", "");   // ૮
		unicodeMap.put("0AEF", "");   // ૯
		unicodeMap.put("0AF1", "");   // ૱
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
					
					if ((nextCode >= consBegin && nextCode <=consEnd) || nextCode == angCode ) {
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
