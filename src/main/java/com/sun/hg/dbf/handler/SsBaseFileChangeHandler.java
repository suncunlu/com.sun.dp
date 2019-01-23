package com.sun.hg.dbf.handler;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;


import com.sun.hg.log.GLog;

public abstract class SsBaseFileChangeHandler extends FileChangeHandler {

	public SsBaseFileChangeHandler() {
		GLog.info("init SsBaseFileChangeHandler....................."+LocalDateTime.now().toString(), null);
		sdf = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS");
		reclen=70;
		bytes = new byte[reclen];
	}
	@Override
	public void getLastModified(File targetFile) {
		// TODO Auto-generated method stub
		/**
		 * 具体实现
		 */
	}

}
