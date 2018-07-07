package com.architectawesome.cornerstone.parsexml.backup;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by renwujie on 2018/07/03 at 16:21
 */
public class UnComprassFileUtil {
    public static void unZipFiles(String zipFilePath, String desDir) {
        unZipFiles(new File(zipFilePath), desDir);
    }

    public static void unZipFiles(File zipFile, String destDir) {
        mkNotExistsDirs(new File(destDir));

        ZipFile zip = null;
        try {
            zip = new ZipFile(zipFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (zip != null) {
            Enumeration enumeration = zip.entries();
            while (enumeration.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) enumeration.nextElement();
                String zipEntryName = entry.getName();

                String outPath = (destDir + "/" + zipEntryName).replaceAll("\\*", "/");
                File file = new File(outPath.substring(0, outPath.lastIndexOf('/')));
                mkNotExistsDirs(file);
                //如果是文件夹，不解压
                if (new File(outPath).isDirectory()) {
                    continue;
                }

                unComprassTO(zip, entry, outPath);
            }
        }
    }

    private static void mkNotExistsDirs(File filePath) {
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
    }

    private static void unComprassTO(ZipFile zipFile, ZipEntry zipEntry, String outPath) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = zipFile.getInputStream(zipEntry);
            out = new FileOutputStream(outPath);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
