package com.indlish.convert.util;

import com.indlish.convert.lang.BengaliConverter;
import com.indlish.convert.lang.GujaratiConverter;
import com.indlish.convert.lang.HindiConverter;
import com.indlish.convert.lang.KannadaConverter;
import com.indlish.convert.lang.MalayalamConverter;
import com.indlish.convert.lang.OriyaConverter;
import com.indlish.convert.lang.TamilConverter;
import com.indlish.convert.lang.TeluguConverter;

public class ApplicationConstants
{
	public static final String ENGLISH	= "English";
	
	public static final String HINDI	= "Hindi";
	public static final String TAMIL	= "Tamil";
	public static final String TELUGU	= "Telugu";
	public static final String KANNADA	= "Kannada";
	public static final String MALAYALAM
									= "Malayalam";
	public static final String BENGALI = "Bengali";
	public static final String GUJARATI = "Gujarati";
	public static final String ORIYA = "Oriya";
	
	public static final String[] SUPPORTED_LANGUAGES = {HINDI, TAMIL, TELUGU, KANNADA};
	
	public static final String LANGUAGE_LIST = "{" + 
			"Bengali	: { code : 1, begin : " + BengaliConverter.langBegin + ", end: " + BengaliConverter.langEnd +  "}, " +
			"Hindi		: { code : 2, begin : " + HindiConverter.langBegin + ", end: " + HindiConverter.langEnd +  "}, " +
			"Kannada	: { code : 3, begin : " + KannadaConverter.langBegin + ", end: " + KannadaConverter.langEnd +  "}, " +
			"Malayalam	: { code : 4, begin : " + MalayalamConverter.langBegin + ", end: " + MalayalamConverter.langEnd +  "}, " +
			"Tamil		: { code : 6, begin : " + TamilConverter.langBegin + ", end: " + TamilConverter.langEnd +  "}, " +
			"Telugu		: { code : 7, begin : " + TeluguConverter.langBegin + ", end: " + TeluguConverter.langEnd +  "}, " +
			"Gujarati	: { code : 8, begin : " + GujaratiConverter.langBegin + ", end: " + GujaratiConverter.langEnd +  "}, " +
			"Oriya		: { code : 9, begin : " + OriyaConverter.langBegin + ", end: " + OriyaConverter.langEnd +  "} " +
	"}";
}
