package moe.msm.dmtqjavaserver.service;

import moe.msm.dmtqserver.external.StaticFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @author sam_nya (privateamusement@protonmail.com)
 */
public class JavaFileService implements StaticFileService {

    private static final Logger logger = LoggerFactory.getLogger(JavaFileService.class);

    private final String dir;
    public JavaFileService() {
        dir = System.getProperty("user.dir");
    }

    @Override
    public File getFileByPath(String path) {
        File file = new File(dir, path);
        logger.info("Get File: {}", file.getAbsolutePath());
        return file;
    }
}
