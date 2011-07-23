/*
 * Created on May 29, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ContentFactory {
    /**
     * Parse the path and return the appropriate Content
     */
    public static Content createContentRequest(
        URI baseURI,
        File directory,
        String path)
        throws NotFoundException, IOException {

        PathParser parsedPath = new PathParser(path);

        File file = directory;

        URI directoryURI = baseURI.resolve("");
        for (int i = 0; i < parsedPath.length() && file.isDirectory(); i++) {
            String element = parsedPath.popPathElement();
            file = new File(file, element);
            directoryURI = directoryURI.resolve(element);
        }

        // File is not a directory.

        // Is it a file?
        boolean isFile = file.isFile() && file.exists();

        if (!isFile) {
            throw new NotFoundException(path);
        }

        ContentComposer composer = new SegyFileContent(directoryURI, file);
        while (parsedPath.length() > 0) {
            String keyName = parsedPath.popPathElement();
            String keyValue = null;
            if (parsedPath.length() > 0) {
                keyValue = parsedPath.popPathElement();
            }
            composer = composer.composeWith(keyName, keyValue);
        }

        Content content = composer.getContent(path.endsWith("/"));
        return content;
    }

}
