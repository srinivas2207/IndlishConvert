package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class KannadaConverter implements LanguageConverter
{

	private Map<String, String> unicodeMap = null;
	public static final int langBegin	= Integer.parseInt("0C80", 16);
	public static final int langEnd		= Integer.parseInt("0CFF", 16);
	
	private int consBegin = Integer.parseInt("0C95", 16);
	private int consEnd	  = Integer.parseInt("0CB9", 16);
	
	private int vowelBegin = Integer.parseInt("0C85", 16);
	private int vowelEnd   = Integer.parseInt("0C94", 16);
	
	private int anthraBegin	= Integer.parseInt("0CBC", 16);
	private int anthraEnd	= Integer.parseInt("0CCD", 16);
	
	private int vaCode 		= Integer.parseInt("0CB5", 16);
	private int shankarSCode= Integer.parseInt("0CB6", 16);
	
	private int halfChar	=  Integer.parseInt("0CCD", 16);
	
	private int sunnaCode 	= Integer.parseInt("0C82", 16);
	private int sunnaBegin 	= Integer.parseInt("0C95", 16);
	private int sunnaEnd  	= Integer.parseInt("0CA8", 16);
	
	public KannadaConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0C82", "m");   // ಂ
		unicodeMap.put("0C83", "ah");   // ಃ
		
		unicodeMap.put("0C85", "a");   // ಅ
		unicodeMap.put("0C86", "aa");   // ಆ
		unicodeMap.put("0C87", "i");   // ಇ
		unicodeMap.put("0C88", "ee");   // ಈ
		unicodeMap.put("0C89", "u");   // ಉ
		unicodeMap.put("0C8A", "00");   // ಊ
		unicodeMap.put("0C8B", "ru");   // ಋ
		unicodeMap.put("0C8C", "l");   // ಌ
		unicodeMap.put("0C8E", "e");   // ಎ
		unicodeMap.put("0C8F", "e");   // ಏ
		unicodeMap.put("0C90", "ai");   // ಐ
		unicodeMap.put("0C92", "o");   // ಒ
		unicodeMap.put("0C93", "oo");   // ಓ
		unicodeMap.put("0C94", "au");   // ಔ
		
		unicodeMap.put("0C95", "k");   // ಕ
		unicodeMap.put("0C96", "kh");   // ಖ
		unicodeMap.put("0C97", "g");   // ಗ
		unicodeMap.put("0C98", "gh");   // ಘ
		unicodeMap.put("0C99", "n");   // ಙ
		unicodeMap.put("0C9A", "ch");   // ಚ
		unicodeMap.put("0C9B", "ch");   // ಛ
		unicodeMap.put("0C9C", "j");   // ಜ
		unicodeMap.put("0C9D", "jh");   // ಝ
		unicodeMap.put("0C9E", "n");   // ಞ
		unicodeMap.put("0C9F", "t");   // ಟ
		unicodeMap.put("0CA0", "t");   // ಠ
		unicodeMap.put("0CA1", "d");   // ಡ
		unicodeMap.put("0CA2", "d");   // ಢ
		unicodeMap.put("0CA3", "n");   // ಣ
		unicodeMap.put("0CA4", "t");   // ತ
		unicodeMap.put("0CA5", "th");   // ಥ
		unicodeMap.put("0CA6", "d");   // ದ
		unicodeMap.put("0CA7", "dh");   // ಧ
		unicodeMap.put("0CA8", "n");   // ನ
		unicodeMap.put("0CAA", "p");   // ಪ
		unicodeMap.put("0CAB", "f");   // ಫ
		unicodeMap.put("0CAC", "b");   // ಬ
		unicodeMap.put("0CAD", "bh");   // ಭ
		unicodeMap.put("0CAE", "m");   // ಮ
		unicodeMap.put("0CAF", "y");   // ಯ
		unicodeMap.put("0CB0", "r");   // ರ
		unicodeMap.put("0CB1", "r");   // ಱ
		unicodeMap.put("0CB2", "l");   // ಲ
		unicodeMap.put("0CB3", "l");   // ಳ
		unicodeMap.put("0CB5", "v");   // ವ
		unicodeMap.put("0CB6", "sh");   // ಶ
		unicodeMap.put("0CB7", "sh");   // ಷ
		unicodeMap.put("0CB8", "s");   // ಸ
		unicodeMap.put("0CB9", "h");   // ಹ
		
		unicodeMap.put("0CBC", "");   // ಼
		unicodeMap.put("0CBD", "a");   // ಽ
		unicodeMap.put("0CBE", "a");   // ಾ
		unicodeMap.put("0CBF", "i");   // ಿ
		unicodeMap.put("0CC0", "ee");   // ೀ
		unicodeMap.put("0CC1", "u");   // ು
		unicodeMap.put("0CC2", "oo");   // ೂ
		unicodeMap.put("0CC3", "ru");   // ೃ
		unicodeMap.put("0CC4", "roo");   // ೄ
		unicodeMap.put("0CC6", "e");   // ೆ
		unicodeMap.put("0CC7", "e");   // ೇ
		unicodeMap.put("0CC8", "ai");   // ೈ
		unicodeMap.put("0CCA", "o");   // ೊ
		unicodeMap.put("0CCB", "oo");   // ೋ
		unicodeMap.put("0CCC", "au");   // ೌ
		unicodeMap.put("0CCD", "");   // ್

		unicodeMap.put("0CD5", "a");   // ೕ
		unicodeMap.put("0CD6", "");   // ೖ
		unicodeMap.put("0CDE", "");   // ೞ
		unicodeMap.put("0CE0", "");   // ೠ
		unicodeMap.put("0CE1", "");   // ೡ
		unicodeMap.put("0CE2", "");   // ೢ
		unicodeMap.put("0CE3", "");   // ೣ
		unicodeMap.put("0CE6", "");   // ೦
		unicodeMap.put("0CE7", "");   // ೧
		unicodeMap.put("0CE8", "");   // ೨
		unicodeMap.put("0CE9", "");   // ೩
		unicodeMap.put("0CEA", "");   // ೪
		unicodeMap.put("0CEB", "");   // ೫
		unicodeMap.put("0CEC", "");   // ೬
		unicodeMap.put("0CED", "");   // ೭
		unicodeMap.put("0CEE", "");   // ೮
		unicodeMap.put("0CEF", "");   // ೯
		unicodeMap.put("0CF1", "");   // ೱ
		unicodeMap.put("0CF2", "");   // ೲ
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
					
					if (nextCode >= anthraBegin && nextCode <=anthraEnd) {
							
					} else {
						letter = letter + "a";
					}
				} else if(code == sunnaCode) {
					if (nextCode >= sunnaBegin && nextCode <=sunnaEnd) {
						letter = "n";
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
