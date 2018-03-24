package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class TeluguConverter implements LanguageConverter
{
	private Map<String, String> unicodeMap = null;
	public static final int langBegin	= Integer.parseInt("0C00", 16);
	public static final int langEnd	= Integer.parseInt("0C7F", 16);
	
	private int consBegin	= Integer.parseInt("0C15", 16);
	private int consEnd		= Integer.parseInt("0C39", 16);
	
	private int anthraBegin	= Integer.parseInt("0C3D", 16);
	private int anthraEnd	= Integer.parseInt("0C4D", 16);
	
	private int sunnaBegin 	= Integer.parseInt("0C15", 16);
	private int sunnaEnd  	= Integer.parseInt("0C28", 16);
	
	private int sunnaCode 	= Integer.parseInt("0C02", 16);
	
	private int vaCode 		= Integer.parseInt("0C35", 16);
	private int halfChar	= Integer.parseInt("0C4D", 16);
	private int shankarSCode= Integer.parseInt("0C36", 16);
	
	public TeluguConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0C02", "m");   // ం
		unicodeMap.put("0C03", "ah");   // ః
		unicodeMap.put("0C05", "A");   // అ
		unicodeMap.put("0C06", "Aa");   // ఆ
		unicodeMap.put("0C07", "I");   // ఇ
		unicodeMap.put("0C08", "Ee");   // ఈ
		unicodeMap.put("0C09", "U");   // ఉ
		unicodeMap.put("0C0A", "Oo");   // ఊ
		unicodeMap.put("0C0B", "Ru");   // ఋ
		unicodeMap.put("0C0E", "E");   // ఎ
		unicodeMap.put("0C0F", "E");   // ఏ
		unicodeMap.put("0C10", "Ai");   // ఐ
		unicodeMap.put("0C12", "O");   // ఒ
		unicodeMap.put("0C13", "O");   // ఓ
		unicodeMap.put("0C14", "Av");   // ఔ
		
		unicodeMap.put("0C15", "K");   // క
		unicodeMap.put("0C16", "KH");   // ఖ
		unicodeMap.put("0C17", "G");   // గ
		unicodeMap.put("0C18", "GH");   // ఘ
		unicodeMap.put("0C19", "GN");   // ఙ
		unicodeMap.put("0C1A", "CH");   // చ
		unicodeMap.put("0C1B", "CH");   // ఛ
		unicodeMap.put("0C1C", "J");   // జ
		unicodeMap.put("0C1D", "JH");   // ఝ
		unicodeMap.put("0C1E", "IN");   // ఞ
		unicodeMap.put("0C1F", "T");   // ట
		unicodeMap.put("0C20", "T");   // ఠ
		unicodeMap.put("0C21", "D");   // డ
		unicodeMap.put("0C22", "D");   // ఢ
		unicodeMap.put("0C23", "N");   // ణ
		unicodeMap.put("0C24", "T");   // త
		unicodeMap.put("0C25", "TH");   // థ
		unicodeMap.put("0C26", "D");   // ద
		unicodeMap.put("0C27", "DH");   // ధ
		unicodeMap.put("0C28", "N");   // న
		unicodeMap.put("0C2A", "P");   // ప  
		unicodeMap.put("0C2B", "F");   // ఫ  
		unicodeMap.put("0C2C", "B");   // బ  
		unicodeMap.put("0C2D", "BH");   // భ  
		unicodeMap.put("0C2E", "M");   // మ
		unicodeMap.put("0C2F", "Y");   // య 
		unicodeMap.put("0C30", "R");   // ర 
		unicodeMap.put("0C31", "R");   // ఱ 
		unicodeMap.put("0C32", "L");   // ల  
		unicodeMap.put("0C33", "L");   // ళ 
		unicodeMap.put("0C35", "V");   // వ
		unicodeMap.put("0C36", "Sh");   // శ
		unicodeMap.put("0C37", "SH");   // ష
		unicodeMap.put("0C38", "S");   // స 
		unicodeMap.put("0C39", "H");   // హ 
		
		unicodeMap.put("0C3D", "a");   // ఽ
		unicodeMap.put("0C3E", "a");   // ా
		unicodeMap.put("0C3F", "i");   // ి
		unicodeMap.put("0C40", "ee");   // ీ
		unicodeMap.put("0C41", "u");   // ు
		unicodeMap.put("0C42", "oo");   // ూ
		unicodeMap.put("0C43", "ru");   // ృ
		unicodeMap.put("0C44", "roo");   // ౄ
		unicodeMap.put("0C46", "e");   // ె
		unicodeMap.put("0C47", "e");   // ే
		unicodeMap.put("0C48", "ai");   // ై
		unicodeMap.put("0C4A", "o");   // ొ
		unicodeMap.put("0C4B", "o");   // ో
		unicodeMap.put("0C4C", "av");   // ౌ
		unicodeMap.put("0C4D", "");   // ్ 
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
