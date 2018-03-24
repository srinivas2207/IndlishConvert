package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class TamilConverter implements LanguageConverter
{

	private Map<String, String> unicodeMap = null;
	public static int langBegin	= Integer.parseInt("0B82", 16);
	public static int langEnd		= Integer.parseInt("0BFA", 16);
	
	private int consBegin	= Integer.parseInt("0B95", 16);
	private int consEnd		= Integer.parseInt("0BB5", 16);
	
	private int vowelBegin	= Integer.parseInt("0B85", 16);
	private int vowelEnd	= Integer.parseInt("0B94", 16);
	
	private int anthraBegin	= Integer.parseInt("0BBE", 16);
	private int anthraEnd	= Integer.parseInt("0BCC", 16);
	
	private int vaCode 		= Integer.parseInt("0BB5", 16);
	private int shankarSCode= Integer.parseInt("0BB8", 16);
	
	private int halfChar 	= Integer.parseInt("0BCD", 16);
	
	public TamilConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0B82", "");   // ஂ  / no char
		unicodeMap.put("0B83", "auk");   // ஃ   / aik
		unicodeMap.put("0B85", "a");   // அ   / a
		unicodeMap.put("0B86", "aa");   // ஆ   /aa
		unicodeMap.put("0B87", "i");   // இ  /e
		unicodeMap.put("0B88", "e");   // ஈ	/ee
		unicodeMap.put("0B89", "u");   // உ	/u
		unicodeMap.put("0B8A", "uu");   // ஊ 	/uu
		unicodeMap.put("0B8E", "ae");   // எ	/ae
		unicodeMap.put("0B8F", "aae");   // ஏ	/aae
		unicodeMap.put("0B90", "ai");   // ஐ	/ai
		unicodeMap.put("0B92", "o");   // ஒ	/ o
		unicodeMap.put("0B93", "oh");   // ஓ	/oh
		unicodeMap.put("0B94", "au");   // ஔ 	/aw
		unicodeMap.put("0B95", "k");   // க	/k 'a
		unicodeMap.put("0B99", "ng");   // ங	ng 'a
		unicodeMap.put("0B9A", "ch");   // ச	/ch 'a
		unicodeMap.put("0B9C", "j");   // ஜ	/j'a
		unicodeMap.put("0B9E", "ny");   // ஞ	/ ny 'a
		unicodeMap.put("0B9F", "d");   // ட	/ d 'a
		unicodeMap.put("0BA3", "nn");   // ண	/nn 'a	
		unicodeMap.put("0BA4", "th");   // த	/th'a
		unicodeMap.put("0BA8", "N");   // ந	/Nn'a
		unicodeMap.put("0BA9", "n");   // ன	/n'a
		unicodeMap.put("0BAA", "p");   // ப    /p'a
		unicodeMap.put("0BAE", "m");   // ம	/m'a
		unicodeMap.put("0BAF", "y");   // ய 	/y'a
		unicodeMap.put("0BB0", "r");   // ர		/r'a
		unicodeMap.put("0BB1", "r");   // ற	/rr'a
		unicodeMap.put("0BB2", "l");   // ல	/l'a
		unicodeMap.put("0BB3", "ll");   // ள	/ll'a
		unicodeMap.put("0BB4", "zh");   // ழ	/zh'a
		unicodeMap.put("0BB5", "v");   // வ	/v'a
		unicodeMap.put("0BB6", "");   // ஶ
		unicodeMap.put("0BB7", "sh");   // ஷ	/sh'a
		unicodeMap.put("0BB8", "sh");   // ஸ	/s'a
		unicodeMap.put("0BB9", "h");   // ஹ	/h'a
		unicodeMap.put("0BBE", "aa");   // ா	/a in suffix
		unicodeMap.put("0BBF", "i");   // ி	/i in suffix
		unicodeMap.put("0BC0", "e");   // ீ		/e in suffix
		unicodeMap.put("0BC1", "u");   // ு	/u in suffix
		unicodeMap.put("0BC2", "uu");   // ூ	/uw in suffix
		unicodeMap.put("0BC6", "a");   // ெ	/ae in suffix
		unicodeMap.put("0BC7", "ae");   // ே	/aae in suffix 
		unicodeMap.put("0BC8", "ai");   // ை	/ai in suffix
		unicodeMap.put("0BCA", "o");   // ொ	/o in suffix
		unicodeMap.put("0BCB", "oh");   // ோ	/oh in suffix
		unicodeMap.put("0BCC", "au");   // ௌ	/aw in suffix
		unicodeMap.put("0BCD", "");   // ்		/ i in prefix
		unicodeMap.put("0BD0", "om");   // ௐ	/om
		unicodeMap.put("0BD7", "la");   // ௗ
		unicodeMap.put("0BE6", "");   // ௦	
		unicodeMap.put("0BE7", "ka");   // ௧   	/ka
		unicodeMap.put("0BE8", "u");   // ௨	/u
		unicodeMap.put("0BE9", "");   // ௩
		unicodeMap.put("0BEA", "");   // ௪
		unicodeMap.put("0BEB", "ru");   // ௫	ru
		unicodeMap.put("0BEC", "kuu");   // ௬	/kuu
		unicodeMap.put("0BED", "a");   // ௭	/ae
		unicodeMap.put("0BEE", "a");   // ௮	/a
		unicodeMap.put("0BEF", "");   // ௯
		unicodeMap.put("0BF0", "");   // ௰
		unicodeMap.put("0BF1", "");   // ௱
		unicodeMap.put("0BF2", "");   // ௲
		unicodeMap.put("0BF3", "");   // ௳
		unicodeMap.put("0BF4", "");   // ௴
		unicodeMap.put("0BF5", "");   // ௵
		unicodeMap.put("0BF6", "");   // ௶
		unicodeMap.put("0BF7", "");   // ௷
		unicodeMap.put("0BF8", "");   // ௸
		unicodeMap.put("0BF9", "");   // ௹
		unicodeMap.put("0BFA", "");   // ௺
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
