package com.architectawesome.cornerstone.parsexml.backup;

import java.io.File;

/**
 * Created by renwujie on 2018/07/03 at 16:27
 */
public class FindXml {

    public static boolean checkXml(String checkPath) {
        boolean flag = false;
        File[] files = new File(checkPath).listFiles();
        if(files != null) {
            for(File file : files) {
                String fileName = file.getName();
                if(!file.isDirectory()) {
                    if(fileName.endsWith(".xml")){
                        flag =  true;
                        break;
                    }
                } else {
                    checkPath = checkPath + "/" + fileName;
                    flag = checkXml(checkPath);
                }
            }
        }
        return flag;
    }
}
