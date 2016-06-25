package de.hhu.propra.tddt.plugin;

/**
 * Created by zeljko On 24.06.2016
 */

import java.time.Duration;
import java.util.Timer;
import java.util.TimerTask;

/******************************************************************************
 * Class: Babysteps implements Plugin
 * <p>
 * Task: After waiting X Minutes it erase the source code and resets the current
 * phase. You can define the X in the minutes (you should be able to do it).
 * <p>
 * By default it has been set to 3 Minutes.
 *
 * @author zeljko
 * @version 0.1
 ******************************************************************************/

 /*
  * @TODO
  * 1. Finish this program.
  * 2. Write a test for this class to test if it really works how intended.
  * 3. Be happy.
  */
public class Babysteps implements Plugin {

    PluginManager pluginManager;
    Duration duration = Duration.ofMinutes(3);
    Timer timer = new Timer();

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setPluginManager(PluginManager pluginManager) {
        this.pluginManager = pluginManager;
    }
}

class BabystepsTimerTask extends TimerTask {

    @Override
    public void run() {

    }
}