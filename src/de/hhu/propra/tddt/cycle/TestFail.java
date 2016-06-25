package de.hhu.propra.tddt.cycle;

/**
 * Created by Subject-16 on 25.06.2016.
 */
public class TestFail extends AbstractCycleElement{

    @Override
    public void moveToNextPhase() {
        /*button click event in order to tell program the user is ready to advance*/
    }

    @Override
    public void compileCode(){
        /*uses virtual kata, the code isn't allow to compile here*/

    }

    @Override
    public void runTest(){
        /*only one test is allowed to fail in this phase*/
    }


    public void editTest(){
        /*function to edit the test in this cycle-phase, return type not yet clear, hence the void*/
    }
}
