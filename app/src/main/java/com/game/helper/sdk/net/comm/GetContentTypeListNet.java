package com.game.helper.sdk.net.comm;

import java.io.InputStream;
import com.game.helper.sdk.model.returns.GetContentTypeList;
import com.game.helper.sdk.net.base.BaseNetwork;
import com.game.helper.sdk.net.base.GeneralParser;

import android.content.Context;

/**
 * @Description
 * @Path com.game.helper.sdk.net.comm.GetContentTypeListNet.java
 * @Author lbb
 * @Date 2016年9月22日 下午5:56:09
 * @Company
 */
public class GetContentTypeListNet extends BaseNetwork{

	public GetContentTypeListNet(Context context,  String datas) {
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
		return parser.getData(GetContentTypeList.class) ;
	}

}