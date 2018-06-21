package com.clj.util;

import com.clj.entity.Result;

public class UserUtil {
	
	public static Result success(Object object) {
		Result result = new Result();
		result.setCode(1);
		result.setMsg("success");
		result.setData(object);
		return result;
	}
	
	public static Result error(Integer code,String Msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(Msg);
		return result;
	}

}
