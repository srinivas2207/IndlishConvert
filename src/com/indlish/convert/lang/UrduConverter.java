package com.indlish.convert.lang;

import java.util.HashMap;
import java.util.Map;

public class UrduConverter implements LanguageConverter
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
	
	public UrduConverter() {
		_init();
	}
	
	private void _init() {
		unicodeMap = new HashMap<>();
		unicodeMap.put("0600", "");    //   ؀
		unicodeMap.put("0601", "");    //   ؁
		unicodeMap.put("0602", "");    //   ؂
		unicodeMap.put("0603", "");    //   ؃؊
		unicodeMap.put("060B", "");    //   ؋
		unicodeMap.put("060C", "");    //   ،
		unicodeMap.put("060D", "");    //   ؍
		unicodeMap.put("060E", "");    //   ؎
		unicodeMap.put("060F", "");    //   ؏
		unicodeMap.put("0610", "");    //   ؐ
		unicodeMap.put("0611", "");    //   ؑ
		unicodeMap.put("0612", "");    //   ؒ
		unicodeMap.put("0613", "");    //   ؓ
		unicodeMap.put("0614", "");    //   ؔ
		unicodeMap.put("0615", "");    //   ؕ
		unicodeMap.put("061B", "");    //   ؛
		unicodeMap.put("061E", "");    //   ؞
		unicodeMap.put("061F", "");    //   ؟
		unicodeMap.put("0621", "");    //   ء
		unicodeMap.put("0622", "");    //   آ
		unicodeMap.put("0623", "");    //   أ
		unicodeMap.put("0624", "");    //   ؤ
		unicodeMap.put("0625", "");    //   إ
		unicodeMap.put("0626", "");    //   ئ
		unicodeMap.put("0627", "");    //   ا
		unicodeMap.put("0628", "");    //   ب
		unicodeMap.put("0629", "");    //   ة
		unicodeMap.put("062A", "");    //   ت
		unicodeMap.put("062B", "");    //   ث
		unicodeMap.put("062C", "");    //   ج
		unicodeMap.put("062D", "");    //   ح
		unicodeMap.put("062E", "");    //   خ
		unicodeMap.put("062F", "");    //   د
		unicodeMap.put("0630", "");    //   ذ
		unicodeMap.put("0631", "");    //   ر
		unicodeMap.put("0632", "");    //   ز
		unicodeMap.put("0633", "");    //   س
		unicodeMap.put("0634", "");    //   ش
		unicodeMap.put("0635", "");    //   ص
		unicodeMap.put("0636", "");    //   ض
		unicodeMap.put("0637", "");    //   ط
		unicodeMap.put("0638", "");    //   ظ
		unicodeMap.put("0639", "");    //   ع
		unicodeMap.put("063A", "");    //   غ
		unicodeMap.put("0640", "");    //   ـ
		unicodeMap.put("0641", "");    //   ف
		unicodeMap.put("0642", "");    //   ق
		unicodeMap.put("0643", "");    //   ك
		unicodeMap.put("0644", "");    //   ل
		unicodeMap.put("0645", "");    //   م
		unicodeMap.put("0646", "");    //   ن
		unicodeMap.put("0647", "");    //   ه
		unicodeMap.put("0648", "");    //   و
		unicodeMap.put("0649", "");    //   ى
		unicodeMap.put("064A", "");    //   ي
		unicodeMap.put("064B", "");    //   ً
		unicodeMap.put("064C", "");    //   ٌ
		unicodeMap.put("064D", "");    //   ٍ
		unicodeMap.put("064E", "");    //   َ
		unicodeMap.put("064F", "");    //   ُ
		unicodeMap.put("0650", "");    //   ِ
		unicodeMap.put("0651", "");    //   ّ
		unicodeMap.put("0652", "");    //   ْ
		unicodeMap.put("0653", "");    //   ٓ
		unicodeMap.put("0654", "");    //   ٔ
		unicodeMap.put("0655", "");    //   ٕ
		unicodeMap.put("0656", "");    //   ٖ
		unicodeMap.put("0657", "");    //   ٗ
		unicodeMap.put("0658", "");    //   ٘
		unicodeMap.put("0659", "");    //   ٙ
		unicodeMap.put("065A", "");    //   ٚ
		unicodeMap.put("065B", "");    //   ٛ
		unicodeMap.put("065C", "");    //   ٜ
		unicodeMap.put("065D", "");    //   ٝ
		unicodeMap.put("065E", "");    //   ٞ
		unicodeMap.put("0660", "");    //   ٠
		unicodeMap.put("0661", "");    //   ١
		unicodeMap.put("0662", "");    //   ٢
		unicodeMap.put("0663", "");    //   ٣
		unicodeMap.put("0664", "");    //   ٤
		unicodeMap.put("0665", "");    //   ٥
		unicodeMap.put("0666", "");    //   ٦
		unicodeMap.put("0667", "");    //   ٧
		unicodeMap.put("0668", "");    //   ٨
		unicodeMap.put("0669", "");    //   ٩
		unicodeMap.put("066A", "");    //   ٪
		unicodeMap.put("066B", "");    //   ٫
		unicodeMap.put("066C", "");    //   ٬
		unicodeMap.put("066D", "");    //   ٭
		unicodeMap.put("066E", "");    //   ٮ
		unicodeMap.put("066F", "");    //   ٯ
		unicodeMap.put("0670", "");    //   ٰ
		unicodeMap.put("0671", "");    //   ٱ
		unicodeMap.put("0672", "");    //   ٲ
		unicodeMap.put("0673", "");    //   ٳ
		unicodeMap.put("0674", "");    //   ٴ
		unicodeMap.put("0675", "");    //   ٵ
		unicodeMap.put("0676", "");    //   ٶ
		unicodeMap.put("0677", "");    //   ٷ
		unicodeMap.put("0678", "");    //   ٸ
		unicodeMap.put("0679", "");    //   ٹ
		unicodeMap.put("067A", "");    //   ٺ
		unicodeMap.put("067B", "");    //   ٻ
		unicodeMap.put("067C", "");    //   ټ
		unicodeMap.put("067D", "");    //   ٽ
		unicodeMap.put("067E", "");    //   پ
		unicodeMap.put("067F", "");    //   ٿ
		unicodeMap.put("0680", "");    //   ڀ
		unicodeMap.put("0681", "");    //   ځ
		unicodeMap.put("0682", "");    //   ڂ
		unicodeMap.put("0683", "");    //   ڃ
		unicodeMap.put("0684", "");    //   ڄ
		unicodeMap.put("0685", "");    //   څ
		unicodeMap.put("0686", "");    //   چ
		unicodeMap.put("0687", "");    //   ڇ
		unicodeMap.put("0688", "");    //   ڈ
		unicodeMap.put("0689", "");    //   ډ
		unicodeMap.put("068A", "");    //   ڊ
		unicodeMap.put("068B", "");    //   ڋ
		unicodeMap.put("068C", "");    //   ڌ
		unicodeMap.put("068D", "");    //   ڍ
		unicodeMap.put("068E", "");    //   ڎ
		unicodeMap.put("068F", "");    //   ڏ
		unicodeMap.put("0690", "");    //   ڐ
		unicodeMap.put("0691", "");    //   ڑ
		unicodeMap.put("0692", "");    //   ڒ
		unicodeMap.put("0693", "");    //   ړ
		unicodeMap.put("0694", "");    //   ڔ
		unicodeMap.put("0695", "");    //   ڕ
		unicodeMap.put("0696", "");    //   ږ
		unicodeMap.put("0697", "");    //   ڗ
		unicodeMap.put("0698", "");    //   ژ
		unicodeMap.put("0699", "");    //   ڙ
		unicodeMap.put("069A", "");    //   ښ
		unicodeMap.put("069B", "");    //   ڛ
		unicodeMap.put("069C", "");    //   ڜ
		unicodeMap.put("069D", "");    //   ڝ
		unicodeMap.put("069E", "");    //   ڞ
		unicodeMap.put("069F", "");    //   ڟ
		unicodeMap.put("06A0", "");    //   ڠ
		unicodeMap.put("06A1", "");    //   ڡ
		unicodeMap.put("06A2", "");    //   ڢ
		unicodeMap.put("06A3", "");    //   ڣ
		unicodeMap.put("06A4", "");    //   ڤ
		unicodeMap.put("06A5", "");    //   ڥ
		unicodeMap.put("06A6", "");    //   ڦ
		unicodeMap.put("06A7", "");    //   ڧ
		unicodeMap.put("06A8", "");    //   ڨ
		unicodeMap.put("06A9", "");    //   ک
		unicodeMap.put("06AA", "");    //   ڪ
		unicodeMap.put("06AB", "");    //   ګ
		unicodeMap.put("06AC", "");    //   ڬ
		unicodeMap.put("06AD", "");    //   ڭ
		unicodeMap.put("06AE", "");    //   ڮ
		unicodeMap.put("06AF", "");    //   گ
		unicodeMap.put("06B0", "");    //   ڰ
		unicodeMap.put("06B1", "");    //   ڱ
		unicodeMap.put("06B2", "");    //   ڲ
		unicodeMap.put("06B3", "");    //   ڳ
		unicodeMap.put("06B4", "");    //   ڴ
		unicodeMap.put("06B5", "");    //   ڵ
		unicodeMap.put("06B6", "");    //   ڶ
		unicodeMap.put("06B7", "");    //   ڷ
		unicodeMap.put("06B8", "");    //   ڸ
		unicodeMap.put("06B9", "");    //   ڹ
		unicodeMap.put("06BA", "");    //   ں
		unicodeMap.put("06BB", "");    //   ڻ
		unicodeMap.put("06BC", "");    //   ڼ
		unicodeMap.put("06BD", "");    //   ڽ
		unicodeMap.put("06BE", "");    //   ھ
		unicodeMap.put("06BF", "");    //   ڿ
		unicodeMap.put("06C0", "");    //   ۀ
		unicodeMap.put("06C1", "");    //   ہ
		unicodeMap.put("06C2", "");    //   ۂ
		unicodeMap.put("06C3", "");    //   ۃ
		unicodeMap.put("06C4", "");    //   ۄ
		unicodeMap.put("06C5", "");    //   ۅ
		unicodeMap.put("06C6", "");    //   ۆ
		unicodeMap.put("06C7", "");    //   ۇ
		unicodeMap.put("06C8", "");    //   ۈ
		unicodeMap.put("06C9", "");    //   ۉ
		unicodeMap.put("06CA", "");    //   ۊ
		unicodeMap.put("06CB", "");    //   ۋ
		unicodeMap.put("06CC", "");    //   ی
		unicodeMap.put("06CD", "");    //   ۍ
		unicodeMap.put("06CE", "");    //   ێ
		unicodeMap.put("06CF", "");    //   ۏ
		unicodeMap.put("06D0", "");    //   ې
		unicodeMap.put("06D1", "");    //   ۑ
		unicodeMap.put("06D2", "");    //   ے
		unicodeMap.put("06D3", "");    //   ۓ
		unicodeMap.put("06D4", "");    //   ۔
		unicodeMap.put("06D5", "");    //   ە
		unicodeMap.put("06D6", "");    //   ۖ
		unicodeMap.put("06D7", "");    //   ۗ
		unicodeMap.put("06D8", "");    //   ۘ
		unicodeMap.put("06D9", "");    //   ۙ
		unicodeMap.put("06DA", "");    //   ۚ
		unicodeMap.put("06DB", "");    //   ۛ
		unicodeMap.put("06DC", "");    //   ۜ
		unicodeMap.put("06DD", "");    //   ۝
		unicodeMap.put("06DE", "");    //   ۞
		unicodeMap.put("06DF", "");    //   ۟
		unicodeMap.put("06E0", "");    //   ۠
		unicodeMap.put("06E1", "");    //   ۡ
		unicodeMap.put("06E2", "");    //   ۢ
		unicodeMap.put("06E3", "");    //   ۣ
		unicodeMap.put("06E4", "");    //   ۤ
		unicodeMap.put("06E5", "");    //   ۥ
		unicodeMap.put("06E6", "");    //   ۦ
		unicodeMap.put("06E7", "");    //   ۧ
		unicodeMap.put("06E8", "");    //   ۨ
		unicodeMap.put("06E9", "");    //   ۩
		unicodeMap.put("06EA", "");    //   ۪
		unicodeMap.put("06EB", "");    //   ۫
		unicodeMap.put("06EC", "");    //   ۬
		unicodeMap.put("06ED", "");    //   ۭ
		unicodeMap.put("06EE", "");    //   ۮ
		unicodeMap.put("06EF", "");    //   ۯ
		unicodeMap.put("06F0", "");    //   ۰
		unicodeMap.put("06F1", "");    //   ۱
		unicodeMap.put("06F2", "");    //   ۲
		unicodeMap.put("06F3", "");    //   ۳
		unicodeMap.put("06F4", "");    //   ۴
		unicodeMap.put("06F5", "");    //   ۵
		unicodeMap.put("06F6", "");    //   ۶
		unicodeMap.put("06F7", "");    //   ۷
		unicodeMap.put("06F8", "");    //   ۸
		unicodeMap.put("06F9", "");    //   ۹
		unicodeMap.put("06FA", "");    //   ۺ
		unicodeMap.put("06FB", "");    //   ۻ
		unicodeMap.put("06FC", "");    //   ۼ
		unicodeMap.put("06FD", "");    //   ۽
		unicodeMap.put("06FE", "");    //   ۾


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
