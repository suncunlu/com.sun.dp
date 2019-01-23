package com.sun.hg.dbf.handler;

import java.io.File;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import com.sun.hg.log.GLog;

public abstract class FileChangeHandler {
	protected String targetFileName;
	protected File targetFile;
	protected SimpleDateFormat sdf;
	int reclen = 0;
	byte[] bytes;
	public abstract void changed(long lastModified,ByteBuffer buffer);
	public abstract void getLastModified(File targetFile);
	public FileChangeHandler(){
		GLog.info("init FileChangeHandler........"+LocalDateTime.now().toString(),null);
	}
	public File getTargetFile(File folder){
		if(targetFile == null) {
			targetFile = new File(folder,targetFileName);
		}
		if(targetFile.exists()) {
			return targetFile;
		}
		return null;
	}
	public String getTargetFileName() {
		return this.targetFileName;
	}
}
