package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class OriyaConverter implements LanguageConverter
{

	private Map<String, String> unicodeMap = null;
	public static final int langBegin	= Integer.parseInt("0B00", 16);
	public static final int langEnd		= Integer.parseInt("0B7E", 16);
	
	private int consBegin	= Integer.parseInt("0B15", 16);
	private int consEnd		= Integer.parseInt("0B39", 16);
	
	private int vowelBegin	= Integer.parseInt("0B01", 16);
	private int vowelEnd	= Integer.parseInt("0B14", 16);
	
	private int antraBegin	= Integer.parseInt("0B3C", 16);
	private int antraEnd	= Integer.parseInt("0B4D", 16);
	
	private int angCode 	= Integer.parseInt("0B02", 16);
	
	private int vaCode 		= Integer.parseInt("0B35", 16);
	private int shankarSCode= Integer.parseInt("0B36", 16);
	
	private int halfChar	=  Integer.parseInt("0B4D", 16);
	
	public OriyaConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0B01", "");   // ଁ
		unicodeMap.put("0B02", "");   // ଂ
		unicodeMap.put("0B03", "");   // ଃ
		unicodeMap.put("0B05", "");   // ଅ
		unicodeMap.put("0B06", "");   // ଆ
		unicodeMap.put("0B07", "");   // ଇ
		unicodeMap.put("0B08", "");   // ଈ
		unicodeMap.put("0B09", "");   // ଉ
		unicodeMap.put("0B0A", "");   // ଊ
		unicodeMap.put("0B0B", "");   // ଋ
		unicodeMap.put("0B0C", "");   // ଌ
		unicodeMap.put("0B0F", "");   // ଏ
		unicodeMap.put("0B10", "");   // ଐ
		unicodeMap.put("0B13", "");   // ଓ
		unicodeMap.put("0B14", "");   // ଔ
		unicodeMap.put("0B15", "");   // କ
		unicodeMap.put("0B16", "");   // ଖ
		unicodeMap.put("0B17", "");   // ଗ
		unicodeMap.put("0B18", "");   // ଘ
		unicodeMap.put("0B19", "");   // ଙ
		unicodeMap.put("0B1A", "");   // ଚ
		unicodeMap.put("0B1B", "");   // ଛ
		unicodeMap.put("0B1C", "");   // ଜ
		unicodeMap.put("0B1D", "");   // ଝ
		unicodeMap.put("0B1E", "");   // ଞ
		unicodeMap.put("0B1F", "");   // ଟ
		unicodeMap.put("0B20", "");   // ଠ
		unicodeMap.put("0B21", "");   // ଡ
		unicodeMap.put("0B22", "");   // ଢ
		unicodeMap.put("0B23", "");   // ଣ
		unicodeMap.put("0B24", "");   // ତ
		unicodeMap.put("0B25", "");   // ଥ
		unicodeMap.put("0B26", "");   // ଦ
		unicodeMap.put("0B27", "");   // ଧ
		unicodeMap.put("0B28", "");   // ନ
		unicodeMap.put("0B2A", "");   // ପ
		unicodeMap.put("0B2B", "");   // ଫ
		unicodeMap.put("0B2C", "");   // ବ
		unicodeMap.put("0B2D", "");   // ଭ
		unicodeMap.put("0B2E", "");   // ମ
		unicodeMap.put("0B2F", "");   // ଯ
		unicodeMap.put("0B30", "");   // ର
		unicodeMap.put("0B32", "");   // ଲ
		unicodeMap.put("0B33", "");   // ଳ
		unicodeMap.put("0B35", "");   // ଵ
		unicodeMap.put("0B36", "");   // ଶ
		unicodeMap.put("0B37", "");   // ଷ
		unicodeMap.put("0B38", "");   // ସ
		unicodeMap.put("0B39", "");   // ହ
		unicodeMap.put("0B3C", "");   // ଼
		unicodeMap.put("0B3D", "");   // ଽ
		unicodeMap.put("0B3E", "");   // ା
		unicodeMap.put("0B3F", "");   // ି
		unicodeMap.put("0B40", "");   // ୀ
		unicodeMap.put("0B41", "");   // ୁ
		unicodeMap.put("0B42", "");   // ୂ
		unicodeMap.put("0B43", "");   // ୃ
		unicodeMap.put("0B44", "");   // ୄ
		unicodeMap.put("0B47", "");   // େ
		unicodeMap.put("0B48", "");   // ୈ
		unicodeMap.put("0B4B", "");   // ୋ
		unicodeMap.put("0B4C", "");   // ୌ
		unicodeMap.put("0B4D", "");   // ୍
		unicodeMap.put("0B56", "");   // ୖ
		unicodeMap.put("0B57", "");   // ୗ
		unicodeMap.put("0B5C", "");   // ଡ଼
		unicodeMap.put("0B5D", "");   // ଢ଼
		unicodeMap.put("0B5F", "");   // ୟ
		unicodeMap.put("0B60", "");   // ୠ
		unicodeMap.put("0B61", "");   // ୡ
		unicodeMap.put("0B62", "");   // ୢ
		unicodeMap.put("0B63", "");   // ୣ
		unicodeMap.put("0B66", "");   // ୦
		unicodeMap.put("0B67", "");   // ୧
		unicodeMap.put("0B68", "");   // ୨
		unicodeMap.put("0B69", "");   // ୩
		unicodeMap.put("0B6A", "");   // ୪
		unicodeMap.put("0B6B", "");   // ୫
		unicodeMap.put("0B6C", "");   // ୬
		unicodeMap.put("0B6D", "");   // ୭
		unicodeMap.put("0B6E", "");   // ୮
		unicodeMap.put("0B6F", "");   // ୯
		unicodeMap.put("0B70", "");   // ୰
		unicodeMap.put("0B71", "");   // ୱ
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
