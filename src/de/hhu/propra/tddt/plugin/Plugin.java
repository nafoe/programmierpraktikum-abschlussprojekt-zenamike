package de.hhu.propra.tddt.plugin;

/**
 * Created by zeljko On 23.06.2016
 */

/******************************************************************************
 * Interface: Plugin
 * <p>
 * Task: Implementing the "Extensions" made easy. The information the plugins
 * are allowed to receive are specified in with this Interface and the way you
 * have to deal with a plugin is generalized. So therefor the PluginManager can
 * do his work properly and can be kept cleaner (without typecast and so on).
 *
 * @author zeljko
 * @version 0.1 first try
 ******************************************************************************/
public interface Plugin {

    /**************************************************************************
     * Method: provideSource
     * <p>
     * Plugins will in this project mainly interact with the code written by the
     * user, so if a plugin needs to access the code (e.g. for the suggestions
     * for auto-completion) it will happen through this method.
     *
     * @param code the code written by the user of this tool.
     **************************************************************************/
    public void provideSource(String code);

    /**************************************************************************
     * Method: modifySource
     * <p>
     * If a plugin wants to modify the code it has to happen with this method.
     * With this method the plugin can modify the code.
     *
     * @param source
     **************************************************************************/
    public void modifySource(String source);

    /**************************************************************************
     * Method: start
     * <p>
     * Starting a plugin requiers this method.
     **************************************************************************/
    public void start();

    /**************************************************************************
     * Method: stop
     * <p>
     * Stopping a plugin will happen with this method. Be it an 'emergency-stop'
     * or you just want to turn it off.
     **************************************************************************/
    public void stop();

}
