package com.game.helper.sdk.net.comm;

import java.io.InputStream;

import com.game.helper.sdk.model.returns.GetNoticeList;
import com.game.helper.sdk.net.base.BaseNetwork;
import com.game.helper.sdk.net.base.GeneralParser;

import android.content.Context;

/**
 * @Description
 * @Path com.game.helper.sdk.net.comm.GetNoticeListNet.java
 * @Author lbb
 * @Date 2016年9月16日 上午11:01:31
 * @Company 
 */
public class GetNoticeListNet extends BaseNetwork{

	public GetNoticeListNet(Context context,  String datas) {
		super(context, false);
		url =BASE_URL;
		InputStream inputStream = getContentWithPOST(datas);
		if (inputStream != null) {
			parser = new GeneralParser(context, inputStream);
		}
	}

	@Override
	public Object getData() {
		if(parser==null){
			return null;
		}
		return parser.getData(GetNoticeList.class) ;
	}

}

