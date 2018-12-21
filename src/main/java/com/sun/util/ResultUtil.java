package com.sun.util;

import com.sun.enums.ResultEnum;
import com.sun.oauthor.dto.ResultTo;

/**
 * 返回结果工具类
 * 
 * @author jh
 *
 */
public class ResultUtil {
	private ResultUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static <T> ResultTo<T> success(T object) {
		ResultTo<T> resultVO = new ResultTo<T>();
		resultVO.setErrcode(ResultEnum.SUCCESS.getCode());
		resultVO.setErrmsg(ResultEnum.SUCCESS.getMsg());
		resultVO.setData(object);
		return resultVO;
	}

	public static <T> ResultTo<T> success() {
		return success(null);
	}

	public static <T> ResultTo<T> error(Integer errcode, String errmsg) {
		ResultTo<T> resultVO = new ResultTo<T>();
		resultVO.setErrcode(errcode);
		resultVO.setErrmsg(errmsg);
		return resultVO;

	}

	public static <T> ResultTo<T> error(ResultEnum resultEnum) {
		ResultTo<T> resultVO = new ResultTo<T>();
		resultVO.setErrcode(resultEnum.getCode());
		resultVO.setErrmsg(resultEnum.getMsg());
		return resultVO;

	}
}
