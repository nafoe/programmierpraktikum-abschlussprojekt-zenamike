package de.hhu.propra.tddt.plugin;

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
     * Method: getSource
     * <p>
     * Gives the plugin the Information it needs to work.
     ***************************************************************************/
    public void getSource();

    /**************************************************************************
     * Method: modifySource
     * <p>
     * Modifies the source based on the result of the plugins
     *
     * @param string
     **************************************************************************/
    public void modifySource(String string);

    /*
     * @TODO
     * Think of what other information the plugins may need
     */
}
