package com.indlish.convert;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.indlish.convert.lang.BengaliConverter;
import com.indlish.convert.lang.HindiConverter;
import com.indlish.convert.lang.KannadaConverter;
import com.indlish.convert.lang.LanguageConverter;
import com.indlish.convert.lang.MalayalamConverter;
import com.indlish.convert.lang.GujaratiConverter;
import com.indlish.convert.lang.OriyaConverter;
import com.indlish.convert.lang.TamilConverter;
import com.indlish.convert.lang.TeluguConverter;
import com.indlish.convert.util.ApplicationConstants;

public class LanguageDetector
{
	private LanguageDetector languageDetector = null;

	private LanguageDetector()
	{}

	public LanguageDetector getInstance()
	{
		if (languageDetector == null) {
			languageDetector = new LanguageDetector();
		}
		return languageDetector;
	}
	
	
	public String checkLanguage(String source) {
		String sampleText = getNonLatinText(source);
		if (sampleText == null) {
			return ApplicationConstants.ENGLISH;
		}
		
		JSONObject langList = null;
		try {
			langList = new JSONObject(ApplicationConstants.LANGUAGE_LIST);
		}
		catch (JSONException e1) {
			e1.printStackTrace();
		}
		
		Map<String, Integer> langCount = new HashMap<String, Integer>();
		
		for (int i=0; i<ApplicationConstants.SUPPORTED_LANGUAGES.length; i++) {
			langCount.put(ApplicationConstants.SUPPORTED_LANGUAGES[i], 0);
		}
		
		int textLength = sampleText.length();
		for(int i=0; i<textLength; i++) {
			int code = (int)sampleText.charAt(i);
			for (int j = 0; j < ApplicationConstants.SUPPORTED_LANGUAGES.length; j++) {
				String lang = ApplicationConstants.SUPPORTED_LANGUAGES[j];
				int langBegin = 0;
				int langEnd = 0;
				try {
					 langBegin = langList.getJSONObject(lang).getInt("begin");
					 langEnd = langList.getJSONObject(lang).getInt("end");
				} catch(Exception e) {
					e.printStackTrace();
				}
				if (code >= langBegin && code <= langEnd) {
					langCount.put(lang, langCount.get(lang) + 1);
					break;
				}
			}
		}
		
		int max = 0;
		String language = null;
		for (int i=0; i<ApplicationConstants.SUPPORTED_LANGUAGES.length; i++) {
			if ( langCount.get(ApplicationConstants.SUPPORTED_LANGUAGES[i]) > max) {
				max = langCount.get(ApplicationConstants.SUPPORTED_LANGUAGES[i]);
				language = ApplicationConstants.SUPPORTED_LANGUAGES[i];
			}
		}
		
		return language;
	}
	
	
	public ConvertResult convert(String source) {
		ConvertResult convertResult = new ConvertResult();
		convertResult.setSource(source);
		convertResult.setResult(source);
		
		String language = checkLanguage(source);
		convertResult.setLanguage(language);
		if (language == null) {
			return convertResult;
		}
		
		LanguageConverter languageConverter = null;
		switch (language) {
			case ApplicationConstants.BENGALI:
				languageConverter = new BengaliConverter();
				break;
			case ApplicationConstants.MALAYALAM:
				languageConverter = new MalayalamConverter();
				break;
				
			case ApplicationConstants.HINDI:
				languageConverter = new HindiConverter();
				break;
				
			case ApplicationConstants.KANNADA:
				languageConverter = new KannadaConverter();
				break;
		
			case ApplicationConstants.TAMIL:
				languageConverter = new TamilConverter();
				break;
				
			case ApplicationConstants.TELUGU:
				languageConverter = new TeluguConverter();
				break;
				
			case ApplicationConstants.GUJARATI:
				languageConverter = new GujaratiConverter();
				break;
			case ApplicationConstants.ORIYA:
				languageConverter = new OriyaConverter();
				break;
	
			default:
				break;
		}
		
		if (languageConverter != null) {
			convertResult.setResult(languageConverter.convert(source));
		}
		
		return convertResult;
	}
	
	private String getNonLatinText(String selText) {
		selText = selText.replaceAll("\\s", "");
		int langBegin	= Integer.parseInt("0020", 16);
		int langEnd		= Integer.parseInt("007F", 16);
		
		int randomCheckLength = selText.length() > 4 ? 4 : selText.length();
		int falseCount = 0;
		String text = "";
			
		for(int i=0; i<randomCheckLength; i++) {
			int index = (int) Math.floor(Math.random() * selText.length());
			int code = (int)selText.charAt(index);
			if (code >= langBegin && code <= langEnd) {
				falseCount++;
				i--;
				if (falseCount >= randomCheckLength) {
					return null;
				}
			} else {
				text += selText.charAt(index);
			}
		}
		return text;		
	}
	
	
	public static void main(String[] args) {
		String source = "దేశానికి కొత్త దిశ చూపిస్తా";
		LanguageDetector detector = new LanguageDetector();
		ConvertResult result = detector.convert(source);
		System.out.println(result.getLanguage());
		System.out.println(result.getSource());
		System.out.println(result.getResult());
	}
}
