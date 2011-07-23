/*
 * Created on Jun 1, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
interface ContentComposer {
    ContentComposer composeWith(String keyName, String keyValue)
        throws NotFoundException;
    Content getContent(boolean listing);
}
