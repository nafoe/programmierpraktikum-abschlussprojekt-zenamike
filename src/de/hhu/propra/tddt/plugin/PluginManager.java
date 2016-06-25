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
 * The PluginManager is a 'gate' which lets the plugins access information the
 * programm can provide. But we don't want the plugins to access all information
 * so we setup the PluginManager, that the Plugins can easily access the needed
 * and allowed information.
 *
 * @author zeljko
 * @version 0.1 first try
 ******************************************************************************/
public interface PluginManager {

    /**************************************************************************
     * Method: getCode
     * <p>
     * Gives the plugins the information about the code you wrote.
     *
     * @return The code the user actually wrote
     ***************************************************************************/
    public String getCode();

    /**************************************************************************
     * Method: modifyCode
     * <p>
     * Modifies the source based on the result of the plugins
     *
     * @param code
     **************************************************************************/
    public void modifyCode(String code);

    /**************************************************************************
     * Method: getCycle
     * <p>
     * Gives the plugins the information about the phase the user is in.
     *
     * @return The current phase the user is in.
     **************************************************************************/
    public void getCycle();


    /*
     * @TODO
     * Think of what other information the plugins may need
     */
}
