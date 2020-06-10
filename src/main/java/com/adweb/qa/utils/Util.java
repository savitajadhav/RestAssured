package com.adweb.qa.utils;

import com.adweb.qa.resources.Constant;

public class Util {
	
	   public static int[] excludeActivityTypes() {
	       return new int[]{Constant.EXCLUDE_MEDIACOLLECTION, Constant.EXCLUDE_IDNOTIFICATION, Constant.EXCLUDE_WORKFLOWNOTIFICATION,
	                        Constant.EXCLUDE_MENTIONTAG, Constant.EXCLUDE_WORKFLOWCHANNELPOST, Constant.EXCLUDE_MUSTREAD, Constant.EXCLUDE_SHARE};
	   }


}
