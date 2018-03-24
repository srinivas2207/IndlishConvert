package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class HindiConverter implements LanguageConverter
{

	private Map<String, String> unicodeMap = null;
	public static final int langBegin	= Integer.parseInt("0900", 16);
	public static final int langEnd		= Integer.parseInt("097E", 16);
	
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
	
	public HindiConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0901", "n");   // ँ
		unicodeMap.put("0902", "n");   // ं
		unicodeMap.put("0903", "ah");   // ः
		unicodeMap.put("0905", "a");   // अ
		unicodeMap.put("0906", "aa");   // आ
		unicodeMap.put("0907", "i");   // इ
		unicodeMap.put("0908", "Ee");   // ई
		unicodeMap.put("0909", "u");   // उ
		unicodeMap.put("090A", "oo");   // ऊ
		unicodeMap.put("090B", "ru");   // ऋ
		unicodeMap.put("090D", "");   // ऍ
		unicodeMap.put("090E", "");   // ऎ
		unicodeMap.put("090F", "e");   // ए
		unicodeMap.put("0910", "ai");   // ऐ
		unicodeMap.put("0911", "");   // ऑ
		unicodeMap.put("0912", "");   // ऒ
		unicodeMap.put("0913", "Vo");   // ओ
		unicodeMap.put("0914", "Av");   // औ
		
		unicodeMap.put("0915", "k");   // क
		unicodeMap.put("0916", "kh");   // ख
		unicodeMap.put("0917", "g");   // ग
		unicodeMap.put("0918", "gh");   // घ
		unicodeMap.put("0919", "");   // ङ
		unicodeMap.put("091A", "ch");   // च
		unicodeMap.put("091B", "ch");   // छ
		unicodeMap.put("091C", "j");   // ज
		unicodeMap.put("091D", "jh");   // झ
		unicodeMap.put("091E", "");   // ञ
		unicodeMap.put("091F", "t");   // ट
		unicodeMap.put("0920", "t");   // ठ
		unicodeMap.put("0921", "d");   // ड
		unicodeMap.put("0922", "d");   // ढ
		unicodeMap.put("0923", "n");   // ण
		unicodeMap.put("0924", "t");   // त
		unicodeMap.put("0925", "th");   // थ
		unicodeMap.put("0926", "d");   // द
		unicodeMap.put("0927", "dh");   // ध
		unicodeMap.put("0928", "n");   // न
		unicodeMap.put("0929", "");   // ऩ
		unicodeMap.put("092A", "p");   // प
		unicodeMap.put("092B", "f");   // फ
		unicodeMap.put("092C", "b");   // ब
		unicodeMap.put("092D", "bh");   // भ
		unicodeMap.put("092E", "m");   // म
		unicodeMap.put("092F", "y");   // य
		unicodeMap.put("0930", "r");   // र
		unicodeMap.put("0931", "");   // ऱ
		unicodeMap.put("0932", "l");   // ल
		unicodeMap.put("0933", "");   // ळ
		unicodeMap.put("0934", "");   // ऴ
		unicodeMap.put("0935", "v");   // व
		unicodeMap.put("0936", "sh");   // श
		unicodeMap.put("0937", "sh");   // ष
		unicodeMap.put("0938", "s");   // स
		unicodeMap.put("0939", "h");   // ह
		
		unicodeMap.put("093C", "");   // ़
		unicodeMap.put("093D", "");   // ऽ
		unicodeMap.put("093E", "aa");   // ा
		unicodeMap.put("093F", "i");   // ि
		unicodeMap.put("0940", "ee");   // ी
		unicodeMap.put("0941", "u");   // ु
		unicodeMap.put("0942", "oo");   // ू
		unicodeMap.put("0943", "ru");   // ृ
		unicodeMap.put("0944", "roo");   // ॄ
		unicodeMap.put("0945", "");   // ॅ
		unicodeMap.put("0946", "");   // ॆ
		unicodeMap.put("0947", "e");   // े
		unicodeMap.put("0948", "ai");   // ै
		unicodeMap.put("0949", "");   // ॉ
		unicodeMap.put("094A", "");   // ॊ
		unicodeMap.put("094B", "o");   // ो
		unicodeMap.put("094C", "av");   // ौ
		unicodeMap.put("094D", "");   // ्
		
		unicodeMap.put("0950", "");   // ॐ
		unicodeMap.put("0951", "");   // ॑
		unicodeMap.put("0952", "");   // ॒
		unicodeMap.put("0953", "");   // ॓
		unicodeMap.put("0954", "");   // ॔
		
		unicodeMap.put("0958", "K");   // क़
		unicodeMap.put("0959", "Kh");   // ख़
		unicodeMap.put("095A", "g");   // ग़
		unicodeMap.put("095B", "j");   // ज़
		unicodeMap.put("095C", "d");   // ड़
		unicodeMap.put("095D", "t");   // ढ़
		unicodeMap.put("095E", "f");   // फ़
		unicodeMap.put("095F", "y");   // य़
		unicodeMap.put("0960", "Ri");   // ॠ
		unicodeMap.put("0961", "");   // ॡ
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
