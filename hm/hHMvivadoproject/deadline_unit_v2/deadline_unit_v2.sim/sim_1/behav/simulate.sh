#!/bin/bash -f
xv_path="/home/miguel/Vivado/2016.4"
ExecStep()
{
"$@"
RETVAL=$?
if [ $RETVAL -ne 0 ]
then
exit $RETVAL
fi
}
ExecStep $xv_path/bin/xsim DU_tb_behav -key {Behavioral:sim_1:Functional:DU_tb} -tclbatch DU_tb.tcl -log simulate.log
