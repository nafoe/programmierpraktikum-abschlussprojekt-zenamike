package de.hhu.propra.tddt.cycle;

/**
 * Created by Subject-16 on 25.06.2016.
 */
public class TestSucceed extends AbstractCycleElement {

    @Override
    public void moveToNextPhase() {
        /*button click event in order to tell program the user is ready to advance*/
    }

    @Override
    public void compileCode(){
        /*uses virtual kata here, just use the basic function of virtual kata
        *
        * discuss with other if this is really necessary though
        * */

    }

    @Override
    public void runTest(){
        /*check so that after the improvement of the code, the program is still working after editCode()*/
    }

    public void returnToTestFail(){
        /*button click event if the user likes to return to the first phase of this cycle, resulting in deleting
        * what the user did in phase 1
        * */
    }

    public void editCode(){
        /*function to edit the code, which is tested, in this cycle-phase so that all tests are working.
        * Return type not yet clear, hence the void
        * */
    }


}
