package de.hhu.propra.tddt.plugin;

import java.nio.file.Path;

/**
 * Created by zeljko On 23.06.2016
 */

/******************************************************************************
 * Interface: PluginManager
 * <p>
 * Task: Handling and interacting with the Plugins requires a Manager or
 * Handler. And here you see the PluginManager.
 * <p>
 * The PluginManager expects the following things: - You handle the Plugins in
 * the Class which implements the PluginManager. - You have access to the
 * source.
 *
 * @author zeljko
 * @version 0.1 first try
 ******************************************************************************/
public interface PluginManager {

    /**************************************************************************
     * Method: giveSource
     * <p>
     * Gives the plugin the Information it needs to work.
     *
     * @param source the source you want to pass to the plugin
     **************************************************************************/
    public void giveSource(String source);

    /**************************************************************************
     * Method: modifySource
     * <p>
     * Modifies the source based on the result of the plugins
     **************************************************************************/
    public void modifySource();

    /**************************************************************************
     * Method: load
     *
     * This method loads an Plugin from a specified destination.
     *
     * @param pathtoplugin the path to a plugin you want to load
     **************************************************************************/
    public Plugin load(Path pathtoplugin);
}
