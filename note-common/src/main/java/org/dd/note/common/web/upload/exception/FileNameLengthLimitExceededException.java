package org.dd.note.common.web.upload.exception;

import org.apache.commons.fileupload.FileUploadException;

/**
 * 文件名超长
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午6:44:45
 * <p> @version 0.0.1
 */
public class FileNameLengthLimitExceededException extends FileUploadException {

    private int length;
    private int maxLength;
    private String filename;

    public FileNameLengthLimitExceededException(String filename, int length, int maxLength) {
        super("file name : [" + filename + "], length : [" + length + "], max length : [" + maxLength + "]");
        this.length = length;
        this.maxLength = maxLength;
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public int getLength() {
        return length;
    }


    public int getMaxLength() {
        return maxLength;
    }

}
